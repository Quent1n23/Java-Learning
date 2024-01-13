package com.hspedu.innerclass;

//静态内部类
public class StaticInnerClass01 {
    public static void main(String[] args) {
        Outer10 outer10 = new Outer10();
        outer10.m1();

        //外部其他类 访问 静态内部类
        //1.静态的,通过类名直接访问
        Outer10.Inner10 inner10 = new Outer10.Inner10();
        inner10.say();
        //2. 编写方法,返回静态内部类的对象实例
        Outer10.Inner10 inner101 = outer10.getInner10();

        Outer10.Inner10 inner10_ = Outer10.getInner10_();


    }
}

class Outer10 {
    private int n1 = 10;
    private static String name = "张三";

    private static void cry() {

    }

    //Inner10就是静态内部类
    //1. 外部类的成员位置
    //2. static修饰
    //3. 可以访问外部类 的 静态成员, 但不能直接访问非静态成员
    //4. 可以添加任意的修饰符public
    //5. 作用域
    static class Inner10 {
        private static String name = "韩顺平教育";

        public void say() {
            System.out.println(name);
            System.out.println("外部类 " + Outer10.name);
            cry();
        }
    }

    public void m1() {//外部类 访问 静态内部类
        Inner10 inner10 = new Inner10();
        inner10.say();
    }

    public Inner10 getInner10() {
        return new Inner10();
    }

    public static Inner10 getInner10_() {
        return new Inner10();
    }
}
