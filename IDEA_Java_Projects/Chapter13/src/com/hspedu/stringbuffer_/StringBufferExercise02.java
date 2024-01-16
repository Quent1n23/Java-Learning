package com.hspedu.stringbuffer_;

import java.util.Scanner;

/**
 * @author 丁聪
 * @version 1.0
 */
public class StringBufferExercise02 {
    public static void main(String[] args) {
        //123564.59 改为 123,564.59
        Scanner scanner = new Scanner(System.in);
        String price = "6576123564.59";
        StringBuffer sb = new StringBuffer(price);
        //找到小数点.的索引,在该位置的前3位,插入,即可
//        int i = sb.lastIndexOf(".");
//        sb = sb.insert(i-3,",");
        for (int i = sb.lastIndexOf(".")-3; i > 0; i -= 3) {
            sb = sb.insert(i,",");
        }
        System.out.println(sb);


    }
}
