package com.hspedu.homework;

public class SavingsAccount extends BankAccount{
    //利息
    //每个月 3 次 免手续费
    private int count = 3;
    private double rate = 0.01;//利率

    public void earnMonthlyInterest(){//每个月初，统计上个月的利息，同时将count = 3
        count = 3;
        super.deposit(getBalance()*rate);
    }

    @Override
    public void deposit(double amount) {
        //判断是否还可以免手续费
        if(count > 0){
            super.deposit(amount);
            count--;
        } else {
            super.deposit(amount-1);//手续费
        }
    }

    @Override
    public void withdraw(double amount) {
        //判断是否还可以免手续费
        if(count > 0){
            super.withdraw(amount);
            count--;
        } else {
            super.withdraw(amount+1);//手续费
        }
    }

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
