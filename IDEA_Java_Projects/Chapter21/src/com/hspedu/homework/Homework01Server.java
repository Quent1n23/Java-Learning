package com.hspedu.homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 丁聪
 * @version 1.0
 */
public class Homework01Server {
    public static void main(String[] args) throws IOException {
        //1. 在本机 的9999端口监听, 等待连接
        //   细节: 要求在本机没有其它服务在监听9999
        //   细节：这个 ServerSocket 可以通过 accept() 返回多个Socket[多个客户端连接服务器的并发]
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务器 在9999端口监听 等待连接...");

        //2. 当没有客户端连接9999端口时，程序会 阻塞, 等待连接
        //   如果有客户端连接，则会返回Socket对象，程序继续
        Socket socket = serverSocket.accept();

        //3. 通过socket.getInputStream() 读取客户端写入到数据通道的数据, 显示
        InputStream inputStream = socket.getInputStream();

        //4. IO读取,使用字符流
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String s = br.readLine();
        String answer = "";
        if("name".equals(s)){
            answer = "我是ikun";
        }else if ("hobby".equals(s)){
            answer = "唱跳rap篮球";
        }else {
            answer = "你说的啥子";
        }


        //5. 获取socket相关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        //   使用字符输出流的方式 回复信息
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(outputStream));
        bw.write(answer);
        bw.newLine();//插入换行符,表示结束
        bw.flush();//需要手动刷新


        //6.关闭流和socket
        bw.close();
        br.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务端退出...");

    }
}
