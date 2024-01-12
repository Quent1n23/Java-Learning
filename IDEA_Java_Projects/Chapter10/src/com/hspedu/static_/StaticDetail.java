package com.hspedu.static_;

public class StaticDetail {
    public static void main(String[] args) {
        B b = new B();
//        System.out.println(B.n1);错误
        System.out.println(B.n2);

        //静态变量是 类加载时 就创建了
        System.out.println(C.address);
    }
}

class B{
    public int n1 = 100;
    public static int n2 = 200;
}

class C{
    public static String address = "北京";
}