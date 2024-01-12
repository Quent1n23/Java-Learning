package com.hspedu.single_;
//单例设计模式
//懒汉式
//只有当用户使用时,才创建对象
public class SingleTon02 {
    public static void main(String[] args) {
        Cat instance = Cat.getInstance();
        System.out.println(instance);
    }
}
//希望在程序运行过程中,只能创建一个cat对象
//使用单例模式
//1. 私有化构造器
//2. 定义一个 static属性
//3. 提供一个 public 方法,可以返回一个cat对象

class Cat{
    private String name;
    public static int n1 = 999;
    private static Cat cat;

    private Cat(String name) {
        System.out.println("构造器调用");
        this.name = name;
    }
    public static Cat getInstance(){

        if(cat == null){//如果还没有创建Cat对象,
            cat = new Cat("小可爱");
        }
        return cat;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
