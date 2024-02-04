package com.hspedu.homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author 丁聪
 * @version 1.0
 * 先写文件下载的服务端
 */
public class Homework03Server {
    public static void main(String[] args) throws Exception {
        //1. 监听 9999端口,
        ServerSocket serverSocket = new ServerSocket(9999);
        //2. 等待客户端连接
        System.out.println("服务端等待中...");
        Socket socket = serverSocket.accept();
        //3. 读取客户端 要下载文件的名称
        //   使用while循环,考虑到将来文件过大, 目前没有必要用while
        InputStream inputStream = socket.getInputStream();
        byte[] b = new byte[1024];
        int len = 0;
        String downLoadFileName = "";
        while ((len = inputStream.read(b)) != -1){
            downLoadFileName += new String(b,0,len);
        }
        System.out.println("客户端希望下载的文件 = " + downLoadFileName);
        //默认文件 无名.mp3

        String resFileName = "";
        if("高山流水".equals(downLoadFileName)){
            resFileName = "src\\高山流水.mp3";
        }else {
            resFileName = "src\\无名.mp3";
        }

        //4. 创建输入流, 读取文件
        BufferedInputStream bis =
                new BufferedInputStream(new FileInputStream(resFileName));

        //5. 使用工具类StreamUtils,读取文件到一个字节数组
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //6. 得到socket输出流
        BufferedOutputStream bos =
                new BufferedOutputStream(socket.getOutputStream());
        //7. 写入到数据通道中
        bos.write(bytes);
        socket.shutdownOutput();//结束标记,必须写

        //8. 关闭资源
        bos.close();
        bis.close();
        inputStream.close();
        socket.close();
        serverSocket.close();
        System.out.println("服务端退出...");

    }
}
