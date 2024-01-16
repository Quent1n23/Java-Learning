package com.hspedu.string_;

/**
 * @author 丁聪
 * @version 1.0
 */
public class StringMethod01 {
    public static void main(String[] args) {
        //1. equals
        //2. equalsIgnoreCase 忽略大小写
        //3. length
        //4. indexOf 获取字符/字符串在字符串对象中第一次出现的索引,从0开始,
        // 找不到返回-1
        String s1 = "wer@aerawe@r";
        int index = s1.indexOf('@');
        System.out.println(index);//3
        System.out.println(s1.indexOf("we"));//
        //5. lastIndexOf  字符/字符串 在字符串中最后一次出现的索引
        s1 = "wer@aerae@r@";
        index = s1.lastIndexOf('@');
        System.out.println(index);//11
        System.out.println(s1.lastIndexOf("r@"));
        //6. substring  截取指定范围的子串
        String name = "hello,张三";
        //name.substring(6) 从索引6开始 截取后面所有内容
        System.out.println(name.substring(6));
        //name.substring(2,5)  截取 索引 2到5-1  即 [2,5) 不包括5
        System.out.println(name.substring(2, 5));

    }
}
