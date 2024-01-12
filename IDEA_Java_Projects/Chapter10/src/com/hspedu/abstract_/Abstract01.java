package com.hspedu.abstract_;
//父类方法 不确定性
//考虑将该方法 设计为抽象(abstract)方法
//所谓抽象方法,就是没有实现的方法
//没有实现 就是指 没有方法体
//当一个类中存在抽象方法时,需要将该类声明为抽象类
//一般来说,抽象类会被继承,由其子类来实现抽象方法
public class Abstract01 {
    public static void main(String[] args) {

    }
}
abstract class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

//    public void eat(){
//        System.out.println("这是一个动物,要吃什么?");
//    }
    public abstract void eat();
}