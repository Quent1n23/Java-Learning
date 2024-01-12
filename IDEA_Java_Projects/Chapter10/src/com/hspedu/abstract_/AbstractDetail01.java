package com.hspedu.abstract_;

public class AbstractDetail01 {
    public static void main(String[] args) {
        //抽象类不能被实例化
        //new A();
    }
}
//抽象类可以没有 abstract方法
//abstract只能修饰类和方法

abstract class A{
    public void hi(){
        System.out.println("hi");
    }
}


