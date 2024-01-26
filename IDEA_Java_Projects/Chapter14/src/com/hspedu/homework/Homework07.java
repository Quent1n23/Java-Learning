package com.hspedu.homework;

/**
 * @author 丁聪
 * @version 1.0
 */
public class Homework07 {
    public static void main(String[] args) {
        /**
         * 试写出 Vector和 ArrayList 的比较
         *
         *              底层结构        版本      线程安全(同步)效率      扩容倍数
         *
         * ArrayList    可变数组        jdk1.2      不安全,效率高        无参构造器
         *              Object[]                                        1. 第一次扩容10----2.第二次开始按照1.5倍
         *                                                              有参构造器
         *                                                               1.5倍
         *
         * Vector       可变数组        jdk1.0      安全,效率不高        无参构造器
         *              Object[]                                        默认10,扩容2倍
         *                                                              有参构造器
         *                                                              2倍
         */

    }
}
