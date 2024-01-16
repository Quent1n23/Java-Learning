package com.hspedu.stringbuffer_;

/**
 * @author 丁聪
 * @version 1.0
 */
public class StringAndStringBuffer {
    public static void main(String[] args) {

        //String -->StringBuffer
        String str = "hello tom";
        //1. 使用构造器
        //注意: 返回的才是StringBuffer对象, 对str本身没有影响
        StringBuffer stringBuffer = new StringBuffer(str);
        //2. 使用append()方法
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);


        //StringBuffer --> String
        StringBuffer stringBuffer3 = new StringBuffer("韩顺平教育");

        //1. toString()
        String s = stringBuffer3.toString();

        //2. 使用构造器
        String s1 = new String(stringBuffer3);

    }
}
