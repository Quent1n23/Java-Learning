package com.hspedu.override_;

public class Dog extends Animal {
    //1. 因为Dog 是 Animal 的子类
    //2. cry() 定义形式一样：名称，返回类型，参数
    //3. 这时 Dog 的 cry() 重写了 Animal 的 cey()
    public void cry() {
        System.out.println("小狗叫");
    }

    //细节： 父类方法 返回类型 的 子类 ，String 是 Object的子类
    public String m1() {
        return null;
    }
    public String m2() {
        return null;
    }

    //子类方法 的 访问权限 不能缩小
    //public > protected > 默认 > private
//    protected void eat(){
//
//    }
}
