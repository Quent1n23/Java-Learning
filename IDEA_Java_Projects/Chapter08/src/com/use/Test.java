package com.use;

import com.xiaoqiang.Dog;

//lang包是基本包，默认引入
//util包，系统提供的工具包
//net包，网络包，网络开发
//awt包，java的界面开发，GUI
public class Test {
    public static void main(String[] args) {

        Dog dog = new Dog();
        System.out.println(dog);//com.xiaoqiang.Dog@1b6d3586

        com.xiaoming.Dog dog1 = new com.xiaoming.Dog();
        System.out.println(dog1);//com.xiaoming.Dog@4554617c

        System.out.println(Math.abs(-1));
    }
}
