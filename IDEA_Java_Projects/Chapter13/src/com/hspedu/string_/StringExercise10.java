package com.hspedu.string_;

/**
 * @author 丁聪
 * @version 1.0
 */
public class StringExercise10 {
}

class Test1 {
    String str = new String("hsp");
    //String str = "hsp";

    final char[] ch = {'j', 'a', 'v', 'a'};

    public void change(String str, char ch[]) {
        str = "java";
        ch[0] = 'h';
    }

    public static void main(String[] args) {
        Test1 ex = new Test1();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");
        System.out.println(ex.ch);
    }
}
