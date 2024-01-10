package com.hspedu.Object_;
//演示Finalize的用法
//实际开发中，几乎不会用 finalize()
public class Finalize_ {
    public static void main(String[] args) {
        Car bmw = new Car("宝马");
        bmw = null;
        //这时 Car对象就是一个垃圾，垃圾回收器就会回收(销毁)对象
        //在销毁对象前，会调用该对象的finalize方法
        //程序员就可以重写finalize方法，(释放资源：数据库连接，打开文件)
        //如果程序员不重写，那么就会调用 Object类的 finalize,即默认处理
        //如果重写了， 就可以实现自己的逻辑

        //一个对象变成垃圾， 不会马上被回收
        //垃圾回收机制算法复杂
        //可以自己 主动触发 垃圾回收器

        System.gc();//主动调用垃圾回收器

        System.out.println("程序退出了...");
    }
}
class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }
    //快捷键

    @Override
    protected void finalize() throws Throwable {
        System.out.println("我们销毁了 汽车" + name);
        System.out.println("释放了某些资源...");
    }
}
