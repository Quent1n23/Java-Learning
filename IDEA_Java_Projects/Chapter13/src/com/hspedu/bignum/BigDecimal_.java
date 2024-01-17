package com.hspedu.bignum;

import java.math.BigDecimal;

/**
 * @author 丁聪
 * @version 1.0
 */
public class BigDecimal_ {
    public static void main(String[] args) {

        //需要保存一个 精度很高的小数, double 不够用
//        double d = 1999.1111111111119999999999999999999d;
//        System.out.println(d);

        BigDecimal bigDecimal = new BigDecimal("1999.1111111999999999999999");
        BigDecimal bigDecimal2 = new BigDecimal("1.1");
        System.out.println(bigDecimal);

        //1. 加减乘除,有对应的方法
        System.out.println(bigDecimal.add(bigDecimal2));//加
        System.out.println(bigDecimal.subtract(bigDecimal2));//减
        System.out.println(bigDecimal.multiply(bigDecimal2));//乘
        //System.out.println(bigDecimal.divide(bigDecimal2));//除,可能会抛异常(无限循环)
        //在调用divide方法时  指定精度即可 BigDecimal.ROUND_CEILING
        //如果有无限循环小数, 就会保留分子的精度
        System.out.println(bigDecimal.divide(bigDecimal2,BigDecimal.ROUND_CEILING));
    }
}
