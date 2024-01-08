package com.hspedu.pkg;

import com.hspedu.modifier.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();

        //不同包下，只可以访问 public 修饰的属性或方法
        //
        System.out.println(a.n1);
        a.m1();
        //不能方法 a.m2() a.m3() a.m4()
    }
}
