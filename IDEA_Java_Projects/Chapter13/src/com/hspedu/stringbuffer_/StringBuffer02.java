package com.hspedu.stringbuffer_;

/**
 * @author 丁聪
 * @version 1.0
 */
public class StringBuffer02 {
    public static void main(String[] args) {
        //构造器的使用
        //1. 创建一个 大小16 的 char[], 用于存放字符内容
        StringBuffer stringBuffer = new StringBuffer();

        //2. 通过构造器 指定char[] 大小
        StringBuffer stringBuffer1 = new StringBuffer(100);

        //3. 通过给一个String 创建 StringBuffer
        // 当前字符串hello的长度 + 16
        StringBuffer hello = new StringBuffer("hello");
    }
}
