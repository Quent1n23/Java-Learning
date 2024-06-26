package com.hspedu.qqclient.service;

import java.util.HashMap;

/**
 * @author 丁聪
 * @version 1.0
 * 该类是 管理 客户端连接到服务器端的线程 的类
 */
public class ManageClientConnectServerThread {
    //把多个线程放入到一个HashMap集合, key就是用户id, value就是线程
    private static HashMap<String, ClientConnectServerThread> hm = new HashMap<>();

    //将某个集合加入到集合
    public static void addClientConnectServerThread(String userId,ClientConnectServerThread clientConnectServerThread){
        hm.put(userId,clientConnectServerThread);
    }

    //通过userId 可以得到对应线程
    public static ClientConnectServerThread getClientConnectServerThread(String userId){
        return hm.get(userId);
    }
}
