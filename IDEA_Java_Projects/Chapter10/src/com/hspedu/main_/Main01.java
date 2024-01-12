package com.hspedu.main_;

public class Main01 {

    //静态的变量/属性
    private static String name = "韩顺平教育";
    //非静态变量
    private int n1 = 1000;

    //静态方法
    public static void hi(){
        System.out.println("Main01 的 hi()");
    }
    //非静态方法
    public void cry(){
        System.out.println("Main01 的 cry()");
    }

    public static void main(String[] args) {

        //1.静态方法main 可以访问 本类的  静态成员
        System.out.println("name=" + name);
        hi();

        //2.静态方法main  不可以访问 本类的 非静态成员
        //System.out.println(n1);  错误
        //cty();  错误

        //3.静态方法main 如果要访问 本类的 非静态成员, 先创建对象,再调用
        Main01 main01 = new Main01();
        System.out.println(main01.n1);
        main01.cry();
    }
}
