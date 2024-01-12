package com.hspedu.codeblock_;
/**
 * 创建一个对象时,在一个类中 调用顺序
 *1. 先执行 静态属性 和 静态代码块, 优先级一样,按顺序
 * 2.再执行 普通属性 和 普通代码块, 优先级一样,按顺序
 * 3. 最后调用构造器
 */
public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();
    }
}

class A{

    private int n2 = getN2();//普通属性初始化
    {//普通代码块
        System.out.println("A 普通代码块");
    }

    static {//静态代码块
        System.out.println("A 静态代码块");
    }
    private static int n1 = getN1();


    public static int getN1(){
        System.out.println("getN1被调用");
        return 100;
    }
    public int getN2(){
        System.out.println("getN2被调用");
        return 200;
    }

    //无参构造器
    public A(){
        System.out.println("A 构造器");
    }
}