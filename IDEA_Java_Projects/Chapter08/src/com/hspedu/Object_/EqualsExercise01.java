package com.hspedu.Object_;

import java.util.Objects;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person1 = new Person("jack", 10, '男');
        Person person2 = new Person("smith", 10, '男');
        System.out.println(person1.equals(person2));

        Object person3 = new Person("jack", 10, '男');
        System.out.println(person1.equals(person3));
    }
}

class Person { //extends Object
    private String name;
    private int age;
    private char gender;

    //重写Object 的 equals方法
    public boolean equals(Object obj) {
        //判断地址（同一个对象）
        if (this == obj) {
            return true;
        }
        //判断类型
        if (obj instanceof Person) {//传进来的运行类型是Person,才比较，编译类型不清楚
            /**obj 运行类型 是 Person,但是 编译类型 不清楚（可能是Object、Person、Person的父类...）
             *若obj的编译类型不是Person----- Object obj = new Person();
             *则obj不能调用Person类的属性，obj.name不可用
             *所以需要 向下转型, Person p = (Person)obj
             *因为需要得到 obj 的 各个属性
             */
            Person p = (Person) obj;
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }

        return false;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
