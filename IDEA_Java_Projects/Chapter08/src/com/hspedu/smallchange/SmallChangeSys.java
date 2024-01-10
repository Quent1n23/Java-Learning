package com.hspedu.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SmallChangeSys {
    public static void main(String[] args) {
        //化繁为简
        //1. 先完成 显示菜单，并可以选择菜单，给出对应提示
        //2. 完成零钱通明细
        //3. 完成收益入账
        //4. 完成消费
        //5. 退出
        //6. 完善退出
        //7. 校验金额

        //定义相关的变量
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";

        //2. 完成零钱通明细
        //(1) 可以把收益入账和消费，保存到数组 (2) 使用对象 (3) 使用String拼接
        String details = "--------------------零钱通明细--------------------";

        //3. 完成收益入账
        //定义新的变量
        double money = 0;//收益
        double balance = 0;//余额
        Date date = null;// date 是 java.util.Date 类型，表示日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");//可以用于日期格式化

        //4. 完成消费
        //定义新变量，保存消费原因
        String note = "";


        //1. 先完成 显示菜单，并可以选择菜单，给出对应提示
        do {
            System.out.println("\n==============零钱通菜单==============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退   出");
            System.out.print("请选择(1-4): ");
            key = scanner.next();
            //使用分支控制 switch
            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.print("收益入账金额：");
                    money = scanner.nextDouble();
                    //校验money的值
                    if(money <= 0){
                        System.out.println("收益入账金额 需要 大于 0");
                        break;
                    }
                    balance += money;//余额变化
                    //拼接 收益入账信息到 details
                    date = new Date();//获取当前日期
                    details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "3":
                    System.out.print("消费金额：");
                    money = scanner.nextDouble();
                    //money范围校验
                    if(money <= 0 || money > balance) {
                        System.out.println("你的消费金额应该在 0到" + balance);
                        break;
                    }
                    System.out.print("消费说明：");
                    note = scanner.next();
                    balance -= money;
                    //拼接 消费信息到 details
                    date = new Date();//获取当前日期
                    details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
                    break;
                case "4":
                    //6. 完善退出
                    //（1）定义一个变量 choice 接收用户的输入
                    //（2）使用 while + break 组合 处理接收到的输入是 y/n
                    //（3）退出while后，再判断choice 是 y/n, 就可以决定是否退出
                    String choice = "" ;
                    while(true) {
                        System.out.println("你确定要退出吗 y/n");
                        choice = scanner.next();
                        if("y".equals(choice) || "n".equals(choice)) {
                            break;
                        }
                    }
                    //用户退出while，再判断
                    if(choice.equals("y")) {
                        loop = false;
                    }

                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }
        } while (loop);
        System.out.println("----------退出了零钱通项目----------");


    }
}
