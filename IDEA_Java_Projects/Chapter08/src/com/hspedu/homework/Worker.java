package com.hspedu.homework;

public class Worker extends Employee{
    //普通员工没有特有属性
    public Worker(String name, double daySal, int workDays, double grade) {
        super(name, daySal, workDays, grade);
    }

    @Override
    public void printSal() {
        super.printSal();
    }
}
