package com.hspedu.string_;

/**
 * @author 丁聪
 * @version 1.0
 */
public class StringExercise08 {
    public static void main(String[] args) {
        String a = "hello";//创建a对象
        String b = "abc";//创建b对象


        //1. 创建一个 StringBuilder sb = StringBuilder()
        //2. 执行 sb.append("hello")
        //3. sb.append("abc")
        //4. String c = sb.toString()
        //  c 指向堆中的对象(String)  再指向常量池
        String c = a + b;//变量相加   指向堆
        String d = "helloabc";
        System.out.println(c == d);//F
        String e = "hello" + "abc";//常量相加  指向池
        System.out.println(d == e);//T
    }
}
