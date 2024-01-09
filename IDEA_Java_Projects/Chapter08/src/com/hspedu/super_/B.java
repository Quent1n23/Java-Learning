package com.hspedu.super_;

public class B extends A {

    public int n1 = 888;
    public void test() {
        System.out.println("super.n1=" + super.n1);
        super.cal();
    }

    //访问父类的属性，但不能访问private属性
    public void hi() {
        System.out.println(super.n1 + " " + super.n2 + " " + super.n3);
    }
    public void cal() {
        System.out.println("B类cal()");
    }
    public void sum() {
        System.out.println("B类的sum()");
        System.out.println("=============================");
        //希望调用父类-A的cal()
        //这时，因为子类B没有cal()，因此 有三种方式 的调用

        cal();
        System.out.println("=============================");
        this.cal();
        System.out.println("=============================");
        //找 cal() 和 this.cal() 时，顺序：
        //1. 先找本类，如果有，则调用；
        //2. 如果没有，则找父类(如果有，并可以调用，则调用)
        //3. 如果父类没有，则找父类的父类...
        //提示：如果查找方法的过程中，找到了，但是不能访问（private），则报错 cannot access
        //      如果查找方法的过程中，没有找到， 则提示方法不存在
        super.cal();
        // 找 super.cal() 的顺序是：直接查找父类，其他的规则一样
        System.out.println("=============================");


        //演示访问属性的规则
        System.out.println(n1);
        System.out.println("=============================");
        System.out.println(this.n1);
        //n1 和 this.n1
        //1. 先找本类，如果有，则调用
        //2. 如果没有，则找父类(如果有，并可以调用，则调用)
        //3. 如果父类没有，则找父类的父类...
        //提示：如果查找属性的过程中，找到了，但是不能访问（private），则报错 cannot access
        //      如果查找属性的过程中，没有找到， 则提示 属性不存在
        System.out.println("=============================");
        System.out.println(super.n1);
        // 找 super.n1 的顺序是：直接查找父类，其他的规则一样
    }

    //访问父类的方法，但不能访问private方法
    public void ok() {
        super.test100();
        super.test200();
        super.test300();
        //super.test400();不能访问private方法
    }

    //访问父类的构造器，只能放在第一句
    public B() {
//        super();
//        super("jack",10);
        super("jack");
    }
}
