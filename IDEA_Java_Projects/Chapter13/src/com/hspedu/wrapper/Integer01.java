package com.hspedu.wrapper;

/**
 * @author 丁聪
 * @version 1.0
 */
public class Integer01 {
    public static void main(String[] args) {
        //演示int--Integer 的 装箱和拆箱
        //jdk1.5前 是手动
        //手动装箱  基本数据类型 转成 包装类
        int n1 = 100;
        Integer integer = new Integer(n1);
        Integer integer1 = Integer.valueOf(n1);

        //手动拆箱
        int i = integer.intValue();

        //jdk1.5 后(包括5)  自动装箱,自动拆箱
        int n2 = 200;
        //自动装箱 int-->Integer
        Integer integer2 = n2;//底层使用的是 Integer.valueOf()
        //自动拆箱 Integer-->int
        int n3 = integer2;//底层 intValue()

    }
}
