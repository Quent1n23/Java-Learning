package com.hspedu.encap;

/*
创建程序，在其中定义两个类：Account  AccountTest类 体会Java的封装性
Account类要求具有属性：
姓名（2，3，4位）
余额（>20)
密码（六位）
如果不满足，则给出提示信息，并给默认值（自己定）
通过setXxx的方法给Account的属性赋值
在AccountTest中测试
 */
public class Account {
    //为了封装，将3个属性设置位private
    private String name;
    private double balance;
    private String pwd;

    //提供两个构造器


    public Account() {
    }

    public Account(String name, double balance, String pwd) {
        this.setName(name);
        this.setBalance(balance);
        this.setPwd(pwd);
    }

    public String getName() {
        return name;
    }

    //姓名（2，3，4位）
    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 4) {
            this.name = name;
        } else {
            System.out.println("要求姓名（2，3，4位），默认 无名");
            this.name = "无名";
        }
    }

    public double getBalance() {
        return balance;
    }

    //余额 > 20
    public void setBalance(double balance) {
        if (balance > 20) {
            this.balance = balance;
        } else {
            System.out.println("要求余额>20,默认位0");
            this.balance = 0;
        }
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        if (pwd.length() == 6) {
            this.pwd = pwd;
        } else {
            System.out.println("要求密码6位，默认密码为 000000");
            this.pwd = "000000";
        }
    }

    //显示账号信息
    public void showInfo() {
        System.out.println("账号信息\nname=" + name + " 余额=" + balance + " 密码=" + pwd);
    }

}
