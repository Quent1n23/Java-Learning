package com.hspedu.extend_;

//子类继承了所有的属性和方法，非私有的属性和方法可以直接访问
//私有属性和方法不能在子类直接访问，
// 要通过 符类提供公共的方法去访问
public class Sub extends Base {//子类

    public Sub() {//构造器
//        super();//默认调用父类的无参构造器
        super("smith", 10);
        System.out.println("子类Sub()构造器...");
    }
    //创建子类对象时，不管使用子类的 哪个构造器，默认总会调用父类的无参构造器
    public Sub(String name) {
        super("tom",30);
        System.out.println("子类Sub(String name)构造器...");
    }
    public Sub(String name, int age) {
        super("hsp");
        System.out.println("子类Sub(String name, int age)构造器...");
    }

    public void sayOk() {//子类方法
        //非私有的属性和方法可以直接访问
        //私有属性和方法不能在子类直接访问
        System.out.println(n1 + " " + n2 + " " + n3);
        test100();
        test200();
        test300();
        //test400();
        //要通过 父类提供公共的方法去访问
        System.out.println("n4=" + getN4());
        callTest400();//
    }
}
