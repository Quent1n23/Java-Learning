package com.hspedu.homework;

public class Homework04 {
    public static void main(String[] args) {
        Manager manager = new Manager("刘备", 100, 20, 1.2);
        //设置奖金
        manager.setBonus(3000);
        //打印
        manager.printSal();

        Worker worker = new Worker("关羽", 50, 10, 1.0);
        worker.printSal();
    }
}
