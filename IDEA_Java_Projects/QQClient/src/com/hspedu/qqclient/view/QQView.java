package com.hspedu.qqclient.view;

import com.hspedu.qqclient.service.FileClientService;
import com.hspedu.qqclient.service.MessageClientService;
import com.hspedu.qqclient.service.UserClientService;
import com.hspedu.qqclient.utils.Utility;

/**
 * @author 丁聪
 * @version 1.0
 * 客户端的菜单界面
 */
public class QQView {
    private boolean loop = true;//控制是否显示菜单
    private String key = "";//接收用户的键盘输入
    private UserClientService userClientService = new UserClientService();//登录服务
    private MessageClientService messageClientService = new MessageClientService();//私聊/群聊
    private FileClientService fileClientService = new FileClientService();//传输文件

    public static void main(String[] args) {
        new QQView().mainMenu();
        System.out.println("客户端退出系统...");
    }

    //显示主菜单
    private void mainMenu() {
        while (loop) {
            System.out.println("==========欢迎登录网络通信系统==========");
            System.out.println("\t\t 1 登录系统");
            System.out.println("\t\t 9 退出系统");
            System.out.print("请输入你的选择: ");

            key = Utility.readString(1);

            //根据用户的输入,来处理不同的逻辑
            switch (key) {
                case "1":
                    System.out.print("请输入用户号: ");
                    String userId = Utility.readString(50);
                    System.out.print("请输入密  码: ");
                    String pwd = Utility.readString(50);
                    //这里需要到服务端验证
                    if (userClientService.checkUser(userId, pwd)) {//先打通逻辑
                        System.out.println("==========欢迎(用户 " + userId + " 登录成功)==========");
                        //进入二级菜单
                        while (loop) {
                            System.out.println("\n==========网络通信系统二级菜单(用户 " + userId + ")==========");
                            System.out.println("\t\t 1 显示在线用户列表");
                            System.out.println("\t\t 2 群发消息");
                            System.out.println("\t\t 3 私聊消息");
                            System.out.println("\t\t 4 发送文件");
                            System.out.println("\t\t 9 退出系统");
                            System.out.print("请输入你的选择: ");
                            key = Utility.readString(1);
                            switch (key) {
                                case "1":
                                    //System.out.println("显示在线用户列表");
                                    userClientService.onlineFriendList();
                                    break;
                                case "2":
                                    System.out.println("请输入想对大家说的话: ");
                                    String s = Utility.readString(100);
                                    messageClientService.senMessageToAll(s, userId);
                                    //System.out.println("群发消息");
                                    break;
                                case "3":
                                    System.out.print("请输入想聊天的用户号(在线): ");
                                    String getterId = Utility.readString(50);
                                    System.out.print("请输入想说的话: ");
                                    String content = Utility.readString(50);
                                    messageClientService.sendMessageToOne(content, userId, getterId);
                                    //System.out.println("私聊消息");
                                    break;
                                case "4":
                                    System.out.println("你想发给谁(在线): ");
                                    getterId = Utility.readString(50);
                                    System.out.println("请输入发送文件的路径(形式 d:\\xx.jpg): ");
                                    String src = Utility.readString(100);
                                    System.out.println("请输入你想发送到的路径(形式 d:\\yy.jpg)");
                                    String dest = Utility.readString(100);
                                    fileClientService.sendFileToOne(src, dest, userId, getterId);
                                    //System.out.println("发送文件");
                                    break;
                                case "9":
                                    //调用方法,给服务器发送一个message:退出系统
                                    userClientService.logout();
                                    loop = false;
                                    break;
                            }
                        }
                    } else {//登录服务器失败
                        System.out.println("==========登录失败==========");
                    }
                    break;
                case "9":
                    loop = false;
                    break;
            }
        }
    }
}
