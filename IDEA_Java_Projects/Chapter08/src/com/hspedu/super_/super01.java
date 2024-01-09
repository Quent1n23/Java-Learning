package com.hspedu.super_;


/**
 * 1. super调用父类构造器，分工明确
 * 2. 子类和父类 成员重名时，为了访问父类成员，则要通过super
 * 3. super调用  就近原则
 */
public class super01 {
    public static void main(String[] args) {
        B b = new B();
//        b.sum();
        b.test();
    }
}
