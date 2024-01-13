package com.hspedu.innerclass;




/**
 * 匿名内部类
 * 1. 本质是类 2.内部类 3.该类没有名字 4. 同时还是一个对象
 *
 * new 类或接口(参数列表){
 *     类体
 * }
 *
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04{//外部类
    private int n1 = 10;//属性
    public void method(){//方法
        //基于接口的 匿名内部类
        //1. 需求: 想使用 IA接口,并创建对象
        //2. 传统方式: 写一个类,实现该接口,并创建对象
        //3. 新需求:  Tiger/Dog类只使用一次,后面再不使用
        //4. 这时就可以使用 匿名类 来简化开发
        //5. tiger的 编译类型 IA
        //6. tiger的 运行类型 匿名内部类 XXX ==> 外部名称$1(Outer04$1)
        /*
            底层 系统会分配 类名Outer04$1
            class XXX implements IA {
                @Override
                public void cry() {
                      System.out.println("老虎叫 ");
                }
            }
         */
        //7. jdk底层在创建匿名内部类 Outer04$1,  立即就创建了Outer04$1实例
        //  并且把地址返回给tiger
        //8. 匿名内部类 使用一次,就不能再使用, 对象(tiger)可以反复使用
        IA tiger = new IA(){
            @Override
            public void cry() {
                System.out.println("老虎叫 ");
            }
        };
        System.out.println("tiger的运行类型="+ tiger.getClass());
        tiger.cry();
//        IA tiger = new Tiger();
//        tiger.cry();

        //基于类 的匿名内部类
        //1. father编译类型 Father
        //2. father运行类型 Outer04$2
        //3. 底层 创建 匿名内部类
        /*
            class Outer04$2 extends Father{
            }
         */
        //4. 同时也直接返回了 匿名内部类 Outer04$2的对象
        //5. 参数列表("Jack"),会传输到构造器
        Father father = new Father("jack"){
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        System.out.println("father对象的运行类型="+father.getClass());
        father.test();

        //基于抽象类的匿名内部类
        Animal animal = new Animal(){
            @Override
            void eat() {
                System.out.println("小狗吃骨头");
            }
        };
        animal.eat();
    }
}
interface IA{//接口
    public void cry();
}

//class Tiger implements IA{
//    @Override
//    public void cry() {
//        System.out.println("老虎叫");
//    }
//}
//class Dog implements IA{
//    @Override
//    public void cry() {
//        System.out.println("小狗叫");
//    }
//}

class Father{
    public Father(String name){//构造器
        System.out.println("接收到了name="+name);
    }
    public void test(){//方法

    }
}
abstract class Animal{
    abstract void eat();
}