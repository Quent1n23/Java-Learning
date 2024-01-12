package com.hspedu.single_;
//单例设计模式
//饿汉式
//加载类时, 对象就被创建
public class SingleTon01 {
    public static void main(String[] args) {
        //通过方法可以获取对象
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println(instance);
    }
}
//只能创建一个 GirlFriend 对象
//1. 将构造器私有化-----不能new了
//2. 在类的内部直接创建对象
//3. 提供一个公共的static方法,返回gf对象
class GirlFriend{
    private String name;
    private static GirlFriend gf = new GirlFriend("小红");

    private GirlFriend(String name) {
        this.name = name;
    }
    public static GirlFriend getInstance(){
        return gf;
    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
