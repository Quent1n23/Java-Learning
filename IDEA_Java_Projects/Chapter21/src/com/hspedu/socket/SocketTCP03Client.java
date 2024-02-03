package com.hspedu.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author 丁聪
 * @version 1.0
 * 使用字符流
 */
public class SocketTCP03Client {
    public static void main(String[] args) throws IOException {
        //1. 连接服务端 (ip , 端口）
        //解读: 连接本机的 9999端口, 如果连接成功，返回Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端 socket返回=" + socket.getClass());

        //2. 连接上后，生成Socket, 通过socket.getOutputStream()
        //   得到 和 socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();

        //3. 通过输出流，写入数据到 数据通道, (字符流)
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
        bw.write("hello,server 字符流");
        //插入一个换行符,表示写入的内容结束, 注意: 要求对方使用 readLine()
        bw.newLine();
        //如果使用的字符流,需要手动刷新,否则数据不会写入数据通道
        bw.flush();

        //4. 获取和socket关联的输入流,读数据,字符流
        InputStream inputStream = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String s = br.readLine();
        System.out.println(s);

        //5. 关闭流对象和socket, 必须关闭
        br.close();
        bw.close();
        socket.close();
        System.out.println("客户端退出...");
    }
}
