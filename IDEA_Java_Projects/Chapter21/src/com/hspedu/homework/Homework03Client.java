package com.hspedu.homework;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @author 丁聪
 * @version 1.0
 * 文件下载的客户端
 */
public class Homework03Client {
    public static void main(String[] args) throws Exception {
        //1. 接收用户输入,指定下载文件的名称
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入下载文件名:");
        String downloadFileName = scanner.next();

        //2. 客户端连接服务端
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        //3. 获取socket输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(downloadFileName.getBytes());
        //结束标志
        socket.shutdownOutput();

        //4. 读取服务端返回的文件(字节数据)
        BufferedInputStream bis =
                new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //5. 得到输出流,把数据写入到磁盘
        String filePath = "e:\\" + downloadFileName +".mp3";
        BufferedOutputStream bos =
                new BufferedOutputStream(new FileOutputStream(filePath));
        bos.write(bytes);

        //6. 关闭资源
        bos.close();
        bis.close();
        outputStream.close();
        socket.close();
    }
}
