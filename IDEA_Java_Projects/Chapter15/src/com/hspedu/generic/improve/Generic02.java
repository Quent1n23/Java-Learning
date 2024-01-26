package com.hspedu.generic.improve;

import java.util.ArrayList;

/**
 * @author 丁聪
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Generic02 {
    public static void main(String[] args) {

        //传统方法 ---> 使用泛型

        //1. ArrayList<Dog> 表示:存到 ArrayList 集合中的元素是Dog类型
        //2. 如果编译器发现添加的类型,不满足要求,就会报错
        //3. 遍历时,可以直接取出Dog类型,而不是Object
        //4. public class ArrayList<E> {}
        ArrayList<Dog> arrayList = new ArrayList<Dog>();
        arrayList.add(new Dog("旺财", 10));
        arrayList.add(new Dog("发财", 1));
        arrayList.add(new Dog("小黄", 5));

        //不小心,添加了一只猫
        //arrayList.add(new Cat("招财猫",8));

        //遍历
        System.out.println("===使用泛型===");
        for (Dog dog : arrayList) {
            System.out.println(dog.getName() + "-" + dog.getAge());
        }

    }
}

/*
请编写程序，在ArrayList 中，添加3个Dog对象
Dog对象含有name 和 age, 并输出name 和 age (要求使用getXxx())
 */
class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Cat { //Cat类
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
