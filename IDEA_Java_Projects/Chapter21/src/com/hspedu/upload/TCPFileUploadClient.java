package com.hspedu.upload;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author 丁聪
 * @version 1.0
 * 文件上传的客户端
 */
public class TCPFileUploadClient {
    public static void main(String[] args) throws Exception {

        //客户端连接服务端8888,得到socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        //创建输入流: 读取磁盘文件
        String filePath = "e:\\qie.png";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));

        //bytes 就是  filePath 对应的字节数组
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        //通过socket获取到输出流,将bytes数据发送给服务端
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes);//将文件对应的字节数组的内容,写入到数据通道
        bis.close();
        socket.shutdownOutput();//设置写入数据的结束标记

        //接收从服务端回复的消息
        InputStream inputStream = socket.getInputStream();
        //使用StreamUtils的方法, 直接将inputStream读取到的内容,转成字符串
        String s = StreamUtils.streamToString(inputStream);
        System.out.println(s);

        //关流
        inputStream.close();
        bos.close();
        socket.close();

    }
}
