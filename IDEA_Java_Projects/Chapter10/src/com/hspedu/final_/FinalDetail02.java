package com.hspedu.final_;

public class FinalDetail02 {
    public static void main(String[] args) {
        System.out.println(BBB.num);

        //包装类,String  是final修饰的,不能被继承

    }
}
//final 和 static 搭配使用, 不会导致 类的加载
class BBB{
    public final static int num = 10000;
    static {
        System.out.println("BBB静态代码块");
    }
}
