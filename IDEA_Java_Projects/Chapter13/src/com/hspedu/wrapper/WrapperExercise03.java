package com.hspedu.wrapper;

/**
 * @author 丁聪
 * @version 1.0
 */
public class WrapperExercise03 {
    public static void main(String[] args) {
        Integer i1 = new Integer(127);
        Integer i2 = new Integer(127);
        System.out.println(i1 == i2);//F

        Integer i5 = 127;
        Integer i6 = 127;
        System.out.println(i5 == i6);//T

        Integer i9 = 127;
        Integer i10 = new Integer(127);
        System.out.println(i9 == i10);//F

        Integer i11 = 127;
        int i12 = 127;
        //只要有基本数据类型, == 判断的就是 值 是否相等
        System.out.println(i11 == i12);//T

        Integer i13 = 128;
        int i14 = 128;
        System.out.println(i13 == i14);//T
    }
}
