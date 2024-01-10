package com.hspedu.Object_;

public class ToString_ {
    public static void main(String[] args) {
        /**
         * public String toString() {
         *   return getClass().getName() + "@" + Integer.toHexString(hashCode());
         * }
         * 1. getClass().getName()  类的全类名（包名+类名）
         * 2. Integer.toHexString(hashCode() 将对象的hash值转为16进制字符串
         *
         * 一般都要重写toString
         */
        Monster monster = new Monster("小妖怪", "巡山的", 1000);
        System.out.println(monster.toString());
        System.out.println("当直接输出一个对象时，默认调用toString");
        System.out.println(monster);
    }
}
class Monster {
    private String name;
    private String job;
    private double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }

    //重写toString,输出对象的属性

    @Override
    public String toString() { //重写后，一般是把对象的属性输出,也可以自己设定
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}
