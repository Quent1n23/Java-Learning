package com.hspedu.udp;

import java.io.IOException;
import java.net.*;

/**
 * @author 丁聪
 * @version 1.0
 * 发送端B
 */
public class UDPSenderB {
    public static void main(String[] args) throws IOException {
        //1. 创建DatagramSocket对象, 监听9998端口, 主备发送和接收数据
        DatagramSocket socket = new DatagramSocket(9998);

        //2. 将需要发送的数据,封装到 DatagramPacket对象中
        byte[] data = "hello,明天吃火锅~".getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.10.1"), 9999);

        socket.send(packet);

        //===接收信息
        // (1)创建一个 DatagramPacket对象, 准备接收数据
        //   UDP数据包 最大64K
        byte[] buf = new byte[1024];
        packet = new DatagramPacket(buf, buf.length);
        // (2)调用 接收方法,
        //   将通过网络传输的 DatagramPacket对象,填充到 packet对象
        //当有数据包发送到本机的9999端口,就会接收到数据
        //如果没有数据包发送到本机的9998端口,就会阻塞等待
        socket.receive(packet);

        // (3)把packet进行拆包,取出数据,并显示
        int length = packet.getLength();//实际接收到的数据字节长度
        data = packet.getData();//接收到数据

        String s = new String(data, 0, length);
        System.out.println(s);

        socket.close();
        System.out.println("B端退出");
    }
}
