package com.hspedu.qqserver.service;

import com.hspedu.qqcommon.Message;
import com.hspedu.qqcommon.MessageType;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.HashMap;
import java.util.Iterator;

/**
 * @author 丁聪
 * @version 1.0
 * 该类对应的一个对象 和 某个客户端 保持通信
 */
public class ServerConnectClientThread extends Thread {

    private Socket socket;
    private String userId;//连接到服务端的用户id

    public ServerConnectClientThread(Socket socket, String userId) {
        this.socket = socket;
        this.userId = userId;
    }

    public Socket getSocket() {
        return socket;
    }

    @Override
    public void run() {//这里线程处于run的状态,可以发送/接收消息

        while (true) {
            try {
                System.out.println("服务端和客户端" + userId + "保持通信,读取数据...");
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Message message = (Message) ois.readObject();
                //根据message的类型,做相应的业务处理
                if (message.getMesType().equals(MessageType.MESSAGE_GET_ONLINE_FRIEND)) {
                    //客户端要在线用户列表
                    System.out.println(message.getSender() + " 请求在线用户列表");
                    String onlineUser = ManageClientThreads.getOnlineUser();
                    //返回message
                    //构建一个Message对象, 返回给客户端
                    Message message2 = new Message();
                    message2.setMesType(MessageType.MESSAGE_RET_ONLINE_FRIEND);
                    message2.setContent(onlineUser);
                    message2.setGetter(message.getSender());
                    //返回给客户端
                    ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                    oos.writeObject(message2);

                } else if (message.getMesType().equals(MessageType.MESSAGE_COMM_MES)) {
                    //根据message获取getter id ,然后得到对应线程
                    ServerConnectClientThread serverConnectClientThread =
                            ManageClientThreads.getServerConnectClientThread(message.getGetter());
                    //得到对应socket的对象输出流,将message对象转发给指定的客户端
                    ObjectOutputStream oos =
                            new ObjectOutputStream(serverConnectClientThread.socket.getOutputStream());
                    oos.writeObject(message);//数据库可以实现离线留言
                } else if (message.getMesType().equals(MessageType.MESSAGE_TO_ALL_MES)) {//群发
                    //遍历 管理线程的集合,把所有的socket得到,  然后转发message
                    HashMap<String, ServerConnectClientThread> hm = ManageClientThreads.getHm();

                    Iterator<String> iterator = hm.keySet().iterator();
                    while (iterator.hasNext()) {
                        //取出在线用户的id

                        String onlineUserId = iterator.next().toString();
                        //排除发消息的用户
                        if (!onlineUserId.equals(message.getSender())) {
                            //转发
                            ObjectOutputStream oos =
                                    new ObjectOutputStream(hm.get(onlineUserId).socket.getOutputStream());
                            oos.writeObject(message);
                        }
                    }
                } else if (message.getMesType().equals(MessageType.MESSAGE_FILE_MES)) {
                    //获取线程
                    ServerConnectClientThread serverConnectClientThread = ManageClientThreads.getServerConnectClientThread(message.getGetter());
                    ObjectOutputStream oos = new ObjectOutputStream(serverConnectClientThread.socket.getOutputStream());
                    //转发
                    oos.writeObject(message);
                } else if (message.getMesType().equals(MessageType.MESSAGE_CLIENT_EXIT)) {//客户端要退出
                    System.out.println(message.getSender() + " 退出");
                    //将这个客户端 对应的 线程, 从集合中删除
                    ManageClientThreads.removeServerConnectClientThread(message.getSender());
                    socket.close();//关闭连接
                    //退出线程
                    break;
                } else {
                    System.out.println("其他类型,暂时不处理");
                }


            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }


}
