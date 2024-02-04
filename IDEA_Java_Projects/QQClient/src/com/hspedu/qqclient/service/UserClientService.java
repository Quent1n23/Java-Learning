package com.hspedu.qqclient.service;

import com.hspedu.qqcommon.Message;
import com.hspedu.qqcommon.MessageType;
import com.hspedu.qqcommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author 丁聪
 * @version 1.0
 * 该类完成用户 登录验证 和 用户注册 等功能
 */
public class UserClientService {

    //可能在其他敌方使用user信息, 因此做成 成员属性
    private User u = new User();
    //可能在其他敌方使用socket, 因此做成 成员属性
    private Socket socket;

    //根据 userId 和 pwd 到服务器验证该用户是否合法
    public boolean checkUser(String userId, String pwd) {
        boolean b = false;
        u.setUserId(userId);
        u.setPasswd(pwd);

        try {
            //连接到服务器,发送u对象
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 9999);
            //得到ObjectOutputStream对象
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(u);//发送u对象

            //读取从服务器回复的Message对象
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Message ms = (Message) ois.readObject();

            if (ms.getMesType().equals(MessageType.MESSAGE_LOGIN_SUCCEED)) {//登录成功

                //创建一个和服务器端保持通信的线程 -> 创建一个类 ClientConnectServerThread
                ClientConnectServerThread clientConnectServerThread = new ClientConnectServerThread(socket);
                //启动客户端的线程
                clientConnectServerThread.start();
                //为了后面客户端的扩展,我们将线程放入到集合中管理
                ManageClientConnectServerThread.addClientConnectServerThread(userId, clientConnectServerThread);
                b = true;
            } else {
                //登录失败,就不能启动和服务器通信的线程, 要关闭socket
                socket.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }

    //向 服务器端请求在线用户列表
    public void onlineFriendList() {
        //发送一个Message--MESSAGE_GET_ONLINE_FRIEND
        Message message = new Message();
        message.setSender(u.getUserId());
        message.setMesType(MessageType.MESSAGE_GET_ONLINE_FRIEND);

        //发送给服务器
        try {
            //从管理线程的集合中,得到对应的线程( 通过userId )
            ClientConnectServerThread clientConnectServerThread =
                    ManageClientConnectServerThread.getClientConnectServerThread(u.getUserId());
            //从线程中,得到socket
            Socket socket = clientConnectServerThread.getSocket();
            //应该得到当前线程socket 对应 的 ObjectOutputStream对象
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            //向服务端请求在线用户列表
            oos.writeObject(message);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //编写方法,退出客户端,并给服务端发送一个message对象:退出系统
    public void logout() {
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_CLIENT_EXIT);
        message.setSender(u.getUserId());//一定要指定  是哪个客户端id

        //发送
        try {
            //ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectOutputStream oos =
                    new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(u.getUserId()).getSocket().getOutputStream());
            oos.writeObject(message);
            oos.close();
            System.out.println(u.getUserId() + " 退出系统 ");
            System.exit(0);//结束进程
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
