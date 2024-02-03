package com.hspedu.udp;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author 丁聪
 * @version 1.0
 * UDP接收端
 */
public class UDPReceiverA {
    public static void main(String[] args) throws IOException {
        //1. 创建一个 DatagramSocket对象,监听端口9999
        DatagramSocket socket = new DatagramSocket(9999);
        //2. 创建一个 DatagramPacket对象, 准备接收数据
        //   UDP数据包 最大64K
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        //3. 调用 接收方法,
        //   将通过网络传输的 DatagramPacket对象,填充到 packet对象
        //当有数据包发送到本机的9999端口,就会接收到数据
        //如果没有数据包发送到本机的9999端口,就会阻塞等待
        System.out.println("接收端A 等待接收数据...");
        socket.receive(packet);

        //4. 把packet进行拆包,取出数据,并显示
        int length = packet.getLength();//实际接收到的数据字节长度
        byte[] data = packet.getData();//接收到数据

        String s = new String(data, 0, length);
        System.out.println(s);

        //=====回复信息
        data = "好的,明天见".getBytes();
        packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.10.1"), 9998);

        socket.send(packet);

        //5. 关闭资源
        socket.close();
        System.out.println("A端退出");

    }
}
