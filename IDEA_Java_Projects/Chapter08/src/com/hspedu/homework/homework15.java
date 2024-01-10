package com.hspedu.homework;

/**
 * 什么是多态?
 * <p>
 * 多态: 方法或对象具有多种形态,是OOP的第三大特征,是建立在封装和继承基础之上
 * <p>
 * 1.方法多态
 * (1)重载体现多态
 * (2)重写体现多态
 * <p>
 * 2.对象多态
 * (1)对象的编译类型和运行类型可以不一致
 * 编译类型在定义时,就确定,不能变化
 * 运行类型 可以变化,可以通过getClass()来查看运行类型
 * (3)编译类型 看 定义时 =左边
 * 运行类型 看 = 右边
 * <p>
 * 3.举例说明
 */
public class homework15 {
    public static void main(String[] args) {
        AAA obj = new BBB();//向上转型
        AAA b1 = obj;
        System.out.println("obj的运行类型="+ obj.getClass());//BBB
        obj = new CCC();//向上转型
        System.out.println("obj的运行类型="+ obj.getClass());//CCC
        //此时obj已经不再指向 BBB空间
        //b1 指向 BBB, b1 赋给 obj, obj再次指向BBB
        obj = b1;
        System.out.println("obj的运行类型="+ obj.getClass());//BBB
    }
}
class AAA {

}
class BBB extends AAA {

}
class CCC extends BBB{

}