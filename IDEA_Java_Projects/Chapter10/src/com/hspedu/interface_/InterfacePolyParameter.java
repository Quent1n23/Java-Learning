package com.hspedu.interface_;

public class InterfacePolyParameter {
    public static void main(String[] args) {

        //接口的多态体现
        //接口类型 的 变量if01 可以指向 实现了IF接口的对象实例
        IF if01 = new Monster();
        if01 = new Car();

        //继承体现的多态
        //父类类型 的 变量a 可以指向 继承了AAA的子类的对象实例
        AAA a = new BBB();
        a = new CCC();
    }
}
interface IF{}
class Monster implements IF{}
class Car implements IF{}

class AAA{}
class BBB extends AAA{}
class CCC extends AAA{}