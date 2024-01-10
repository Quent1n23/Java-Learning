package com.hspedu.homework;

public class Homework08 {
    public static void main(String[] args) {
//        CheckingAccount checkingAccount = new CheckingAccount(1000);
//        checkingAccount.deposit(10);//存十元 1000 + 10 -1 = 1009
//        checkingAccount.withdraw(9);//取9元  1009 - 9 - 1= 999
//        System.out.println(checkingAccount.getBalance());

        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());//1300
        savingsAccount.deposit(100);
        System.out.println(savingsAccount.getBalance());//1399

        //月初，定时器自动调用
        savingsAccount.earnMonthlyInterest();//统计利息
        System.out.println(savingsAccount.getBalance());

        savingsAccount.deposit(100);//免手续
        System.out.println(savingsAccount.getBalance());


    }
}
