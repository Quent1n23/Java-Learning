package com.hspedu.encap;

public class AccountTest {
    public static void main(String[] args) {
        //创建Account
        Account account = new Account();
        account.setName("Jackkkk");
        account.setBalance(6);
        account.setPwd("123");

        account.showInfo();
    }
}
