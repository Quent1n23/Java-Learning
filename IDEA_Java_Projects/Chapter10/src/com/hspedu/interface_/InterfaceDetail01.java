package com.hspedu.interface_;

public class InterfaceDetail01 {
    public static void main(String[] args) {
        //new IA();
    }
}
//1. 接口不能被实例化
//2. 接口中 所有方法 默认是public方法,接口中抽象方法,可以不用abstract
//3. 普通类 implements 接口 ,必须实现所有方法
//4. 抽象类 implements实现 接口时,可以不实现接口的抽象方法
interface IA{
    void say();
    void hi();
}
class Cat implements IA{//alt+enter

    @Override
    public void say() {

    }

    @Override
    public void hi() {

    }
}

abstract class Tiger implements IA{

}