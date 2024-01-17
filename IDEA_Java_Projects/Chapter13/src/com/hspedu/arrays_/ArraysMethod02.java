package com.hspedu.arrays_;

import java.util.Arrays;
import java.util.List;

/**
 * @author 丁聪
 * @version 1.0
 */
public class ArraysMethod02 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 90, 123, 567};
        //binarySearch  二分搜索法 查找
        //1. 使用binarySearch 二叉查找
        //2. 要求数组有序
        //3. 如果数组中不存在该元素,返回 -(low + 1)
        int index = Arrays.binarySearch(arr, 1);
        System.out.println("index=" + index);

        //copyOf 数组元素的复制
        //1. 从 arr 数组中, 拷贝 arr.length 个元素 到 newArr
        //2. 如果 拷贝的长度 > arr.length,就在新数组的后面 增加 null
        //3. 如果 拷贝的长度 < 0 , 就抛出异常
        Integer[] newArr = Arrays.copyOf(arr, arr.length);
        System.out.println("==拷贝完毕后==");
        System.out.println(Arrays.toString(newArr));

        //fill 数组元素的填充
        Integer[] num = new Integer[]{9, 3, 2};
        //使用99 填充num数组, 元素全部变成99
        Arrays.fill(num,99);
        System.out.println("==num数组填充后==");
        System.out.println(Arrays.toString(num));

        //equals
        //两个数组元素完全一样 true
        Integer[] arr2 = {1, 2, 90, 123, 567};
        boolean equals = Arrays.equals(arr,arr2);
        System.out.println("equals=" + equals);

        //asList 将一组值,转换成list
        //1. asList方法, 将(2, 3, 4, 5, 6, 1)数据 转成一个List集合
        //2. 返回的 asList 编译类型 List(接口)
        //3. asList 运行类型 java.util.Arrays$ArrayList
        //   是Arrays类的 静态内部类
        List asList = Arrays.asList(2, 3, 4, 5, 6, 1);
        System.out.println("asList=" +asList);
        System.out.println("asList的运行类型=" + asList.getClass());

    }
}
