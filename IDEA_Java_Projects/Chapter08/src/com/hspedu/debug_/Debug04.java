package com.hspedu.debug_;

import java.util.Arrays;

//执行到下一个断点，动态下断点
public class Debug04 {
    public static void main(String[] args) {
        int arr[] = {8, -1, 199, 70, 10};
        //看Arrays.sort方法 怎么实现
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("hello100");
        System.out.println("hello200");
        System.out.println("hello300");
        System.out.println("hello400");
        System.out.println("hello500");
        System.out.println("hello600");
    }
}
