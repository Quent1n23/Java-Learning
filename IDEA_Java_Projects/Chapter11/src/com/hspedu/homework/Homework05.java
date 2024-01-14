package com.hspedu.homework;

/**
 * @author 丁聪
 * @version 1.0
 */
public class Homework05 {
    public static void main(String[] args) {
        A a = new A();
        a.f1();
    }
}

class A{
    private String name = "hello";
    private String NAME = "HELLO";

    public void f1(){
        class B{
            private final String NAME = "韩顺平教育";
            public void show(){
                System.out.println("NAME=" + NAME +" 外部类的name="+ name
                        +" 重名属性,外部类NAME=" +A.this.NAME);
            }
        }
        B b = new B();
        b.show();
    }
}

