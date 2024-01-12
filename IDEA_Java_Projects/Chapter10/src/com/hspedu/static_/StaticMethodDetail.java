package com.hspedu.static_;
//静态方法中 不允许使用 和对象有关的关键字
//比如this super

//静态方法中, 只能访问 静态变量/静态方法

//普通方法,可以访问 普通成员 + 静态成员
public class StaticMethodDetail {
    public static void main(String[] args) {
        D.hi();//ok
        //D.say();错误
    }
}

class D{
    private int n1 = 100;
    private static int n2 = 200;
    public void say(){//普通方法

    }
    public static void hi(){//静态方法
        //System.out.println(this.n1);  错误
    }

    public static void hello(){
        //静态方法中, 只能访问 静态变量/静态方法
        System.out.println(n2);
        System.out.println(D.n2);
       // System.out.println(this.n2);  错误
        hi();
        //say();  错误
    }

    //普通方法,可以访问 普通成员 + 静态成员
    public void ok(){
        //非静态成员
        System.out.println(n1);
        say();
        //静态成员
        System.out.println(n2);
        hello();
    }
}