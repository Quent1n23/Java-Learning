package com.hspedu.poly_.detail_;

public class PolyDetail02 {
    public static void main(String[] args) {
        Base base = new Sub();//向上转型
        System.out.println(base.count);//10 编译类型 Base
        Sub sub = new Sub();
        System.out.println(sub.count);//20  编译类型 Sub
    }
}
class Base {
    int count = 10;
}
class Sub extends Base {
    int count = 20;
}