package com.hspedu.homework;

public class Manager extends Employee{
    //特有属性
    private double bonus;
    //创建Manager对象时，奖金不确定，因此构造器中 不给 bonus
//    可以用set get
    public Manager(String name, double daySal, int workDays, double grade) {
        super(name, daySal, workDays, grade);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    //重写父类的方法

    @Override
    public void printSal() {
        System.out.println("经理 "+getName() + " 的工资是  " +
                (bonus + getDaySal()*getWorkDays()*getGrade()));
    }
}
