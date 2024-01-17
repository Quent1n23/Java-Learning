package com.hspedu.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 丁聪
 * @version 1.0
 */
public class ArraysMethod01 {
    public static void main(String[] args) {

        Integer[] integers = {1, 20, 90};
        //直接使用Arrays.toString方法 遍历数组
        //返回的是 String
        System.out.println(Arrays.toString(integers));

        //sort 排序
        //1. 可以使用冒泡排序,也可以直接使用sort方法
        //2. 数组是引用类型, 会影响 实参 arr
        Integer[] arr = {1, -1, 7, 0, 89};
        Arrays.sort(arr);
        System.out.println("===排序后===");
        System.out.println(Arrays.toString(arr));

        //3. sort重载的, 通过传入一个接口 Comparator,实现定制排序
        //4. 调用 定制排序 时, 传参两个
        // (1) arr
        // (2) 实现了Comparator接口的匿名内部类,要求实现 compare方法
        //定制排序
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer i1 = (Integer) o1;
                Integer i2 = (Integer) o2;
                return i2 - i1;
            }
        });
        System.out.println("===排序后===");
        System.out.println(Arrays.toString(arr));
    }
}
