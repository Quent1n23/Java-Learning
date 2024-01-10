package com.hspedu.homework;

public class CheckingAccount extends BankAccount{

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    //手续费
    @Override
    public void deposit(double amount) {
        super.deposit(amount - 1);
    }
    @Override
    public void withdraw(double amount) {
        //这里的amount + 1 传入到父类withdraw,
        // 取10元(扣10元)，实际上是取11元，(扣11元)
        super.withdraw(amount + 1);
    }
}
