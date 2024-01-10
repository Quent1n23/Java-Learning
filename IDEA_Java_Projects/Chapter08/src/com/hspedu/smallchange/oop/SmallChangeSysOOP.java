package com.hspedu.smallchange.oop;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 该类是完成零钱通的各个功能的类
 * 使用OOP(面向对象编程)
 * 将各个功能对应一个方法
 */
public class SmallChangeSysOOP {
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


    //显示菜单
    public void mainMenu(){
        do {
            System.out.println("\n==============零钱通菜单(OOP)==============");
            System.out.println("\t\t\t1 零钱通明细");
            System.out.println("\t\t\t2 收益入账");
            System.out.println("\t\t\t3 消费");
            System.out.println("\t\t\t4 退   出");
            System.out.print("请选择(1-4): ");
            key = scanner.next();
            //使用分支控制 switch
            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                  this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("选择有误，请重新选择");
            }
        } while (loop);
        System.out.println("----------退出了零钱通项目----------");
    }

    //完成零钱通明细
    public void detail(){
        System.out.println(details);
    }

    //收益入账
    public void income(){
        System.out.print("收益入账金额：");
        money = scanner.nextDouble();
        //校验money的值
        if(money <= 0){
            System.out.println("收益入账金额 需要 大于 0");
            return;// 推出方法，不再执行后面的代码
        }
        balance += money;//余额变化
        //拼接 收益入账信息到 details
        date = new Date();//获取当前日期
        details += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //消费
    public void pay(){
        System.out.print("消费金额：");
        money = scanner.nextDouble();
        //money范围校验
        if(money <= 0 || money > balance) {
            System.out.println("你的消费金额应该在 0到" + balance);
            return;
        }
        System.out.print("消费说明：");
        note = scanner.next();
        balance -= money;
        //拼接 消费信息到 details
        date = new Date();//获取当前日期
        details += "\n" + note + "\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    //退出
    public void exit(){
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
    }
}
