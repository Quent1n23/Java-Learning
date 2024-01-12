package com.hspedu.codeblock_;

/**
 * 1. static修饰的代码块,作是对类进行初始化, 它随着 类的加载 而执行, 并且指挥执行一次
 *   2.普通代码块,每创建一个对象,就执行一次  (需要创建对象!)
 *   3. 类什么时候被加载
 */
public class CodeBlockDetail01 {
    public static void main(String[] args) {

        //类 被加载 的情况

        //1. 创建对象实例时(new)
        //AA aa = new AA();
        //2.创建子类对象实例,父类也会被加载,而且父类先被加载
        //AA aa2 = new AA();
        //3. 使用类的静态成员时
        //System.out.println(Cat.n1);

        //static 代码块只执行一次
        //普通代码块,创建对象,才会调用一次
        //DD dd = new DD();
        //DD dd1 = new DD();
        System.out.println(DD.n1);

    }
}

class DD{
    public static int n1 = 8888;//静态属性

    //静态代码块
    static{
        System.out.println("DD的静态代码块");
    };
    {
        System.out.println("DD的普通代码块");
    };
}
class Animal{
    //静态代码块
    static{
        System.out.println("Animal的静态代码块");
    };
}

class Cat extends Animal{
    public static int n1 = 999;
    //静态代码块
    static{
        System.out.println("Cat的静态代码块");
    };
}

class BB{
    //静态代码块
    static{
        System.out.println("BB的静态代码块");
    };
}

class AA extends BB{

    //静态代码块
    static{
        System.out.println("AA的静态代码块");
    };
}
