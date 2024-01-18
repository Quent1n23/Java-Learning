package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 丁聪
 * @version 1.0
 */
public class CollectionExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        List dogs = new ArrayList();
        dogs.add(new Dog("黑狗",3));
        dogs.add(new Dog("白狗",4));
        dogs.add(new Dog("黄狗",5));

        //1. 迭代器循环
        //得到迭代器
        Iterator iterator = dogs.iterator();
        //快捷键itit
        System.out.println("===迭代器循环===");
        while (iterator.hasNext()) {
            Object o = iterator.next();
            System.out.println(o);
        }

        //2. 增强for循环
        //快捷键I
        System.out.println("===增强for循环===");
        for (Object o : dogs) {
            System.out.println(o);
        }


    }
}

class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
