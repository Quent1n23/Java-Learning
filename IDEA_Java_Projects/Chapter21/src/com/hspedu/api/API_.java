package com.hspedu.api;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author 丁聪
 * @version 1.0
 * 演示 InetAddress类 的使用
 */
public class API_ {
    public static void main(String[] args) throws UnknownHostException {

        //1. 获取本机的 InetAddress对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);//LAPTOP-J4K9BBFE/192.168.10.1

        //2. 根据指定的主机名,获取InetAddress对象
        InetAddress host1 = InetAddress.getByName("LAPTOP-J4K9BBFE");
        System.out.println("host1=" + host1);

        //3. 根据域名 返回InetAddress对象
        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println("host2=" +host2);//www.baidu.com/39.156.66.14

        //4. 通过 InetAddress 对象, 获取对应的地址
        String hostAddress = host2.getHostAddress();//IP
        System.out.println("host2 对应的ip = " + hostAddress);

        //5. 通过 InetAddress 对象，获取对应的主机名/或者域名
        String hostName = host2.getHostName();
        System.out.println("host2对应的主机名/域名=" + hostName); // www.baidu.com

    }
}
