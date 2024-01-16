package com.hspedu.string_;

/**
 * @author 丁聪
 * @version 1.0
 */
public class StringExercise03 {
    public static void main(String[] args) {
        String a = "hsp";//a 指向 常量池的 "hsp"
        String b = new String("hsp"); //b 指向 堆中的对象
        System.out.println(a.equals(b));//T
        System.out.println(a==b);//F
        System.out.println(a==b.intern());//T  b.intern() 返回的是 常量池的地址
        System.out.println(b==b.intern());//F  一个堆地址 一个常量池地址
    }
}
