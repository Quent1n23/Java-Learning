package com.hspedu.stringbuffer_;

/**
 * @author 丁聪
 * @version 1.0
 */
public class StringBufferExercise01 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);//传入null, 底层 将之 置为'n' 'u' 'l' 'l'
        System.out.println(sb.length());

    }
}
