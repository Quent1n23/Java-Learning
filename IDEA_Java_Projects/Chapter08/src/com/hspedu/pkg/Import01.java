package com.hspedu.pkg;

//不建议使用*
//import java.util.Scanner;//只会引入util包下的 Scanner
//import java.util.*;//引入util包下的所有类

import java.util.Arrays;

public class Import01 {
    public static void main(String[] args) {

        //使用系统提供的 Arrays 完成 数组排序
        int[] arr = {-1, 20, 2, 13, 3};
        //系统提供了相关的类，可以方便完成
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
