package com.hspedu.wrapper;

/**
 * @author 丁聪
 * @version 1.0
 */
public class WrapperExercise02 {
    public static void main(String[] args) {
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j);//F  两个对象

        //看源码 -128 ---- +127  就直接返回
        Integer m = 1; //Integer.valueOf(1)
        Integer n = 1; //Integer.valueOf(1)
        System.out.println(m == n);//T

        //不在 范围内 , 使用new
        Integer x = 128;//Integer.valueOf(128)
        Integer y = 128;
        System.out.println(x == y);//F
    }
}
