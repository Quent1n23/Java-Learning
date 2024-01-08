package com.hspedu.extend_;
/*
    1.
    子类继承了所有的属性和方法，
    非私有的属性和方法可以直接访问
    私有属性和方法不能在子类直接访问，
    要通过 父类 提供公共的方法 去访问
    2.
    子类必须调用父类的构造器，完成父类的初始化，创建子类对象时
    先调用 父类构造器
    后调用 子类构造器
    3.
    创建子类对象时，不管使用子类的 哪个构造器，默认总会调用父类的无参构造器
    若父类 未提供 无参构造器，
    则必须在 子类的构造器中 使用super("smith",30) 指定使用 父类中的哪个构造器
    4.
    如果希望指定去调用 父类的 某个构造器，则显示的调用一下 super()
    5.
    super使用时，必须要放在构造器第一行，super只能在构造器中使用
    6.
    super和this都只能放在构造器中 第一行
    因此 super和this不能同时出现
    7.
    java所有类都是Object的子类
    Object是所有类的父类（基类）
    8.
    父类构造器的调用不限于直接父类
    将一直往上追溯直到Object类（顶级父类）
    (每一级构造器都可以使用 super 指定父类构造器)
    9.
    子类最多只能继承一个父类（直接继承）----即java中是单继承机制
    10.
    不能滥用继承，
    子类和父类之间必须满足 is-a 的逻辑关系
    Person is a Music?   ×
    cat is a Animal?    √



 */
public class ExtendsDetail {
    public static void main(String[] args) {
        System.out.println("==================第1个对象===================");
        Sub sub = new Sub();

        System.out.println("==================第2个对象===================");
        Sub sub2 = new Sub("jack");

        System.out.println("==================第3个对象===================");
        Sub sub3 = new Sub("king",10);

        //sub.sayOk();
    }
}
