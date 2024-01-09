package com.hspedu.poly_.dynamic;

public class DynamicBinding {
    public static void main(String[] args) {
        //a的 编译类型A 父类 ，运行类型B 子类
        A a = new B();//向上转型
        System.out.println(a.sum());//40 ->30
        System.out.println(a.sum1());//30 -> 20
    }
}

class A {
    public int i = 10;
    //动态绑定机制
    //1. 当调用对象方法时， 该方法 会和 该对象 的内存地址/运行类型 绑定
    //2. 当调用对象属性时，没有动态绑定机制，哪里声明，哪里使用
    public int sum() {
        return getI() + 10;
    }

    public int sum1() {
        return i + 10;
    }

    public int getI() {
        return i;
    }
}

class B extends A {
    public int i = 20;

//    public int sum() {
//        return i + 20;
//    }

//    public int sum1() {
//        return i + 10;
//    }

    public int getI() {
        return i;
    }
}