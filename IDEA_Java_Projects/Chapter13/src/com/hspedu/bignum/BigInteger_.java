package com.hspedu.bignum;

import java.math.BigInteger;

/**
 * @author 丁聪
 * @version 1.0
 */
public class BigInteger_ {
    public static void main(String[] args) {

        //当编程中,需要处理很大的整数, long 不够用
        //可以使用 BigInteger 类
//        long l = 2524652654642l;
//        System.out.println("l=" + l);
        BigInteger bigInteger = new BigInteger("12342657764879899999999999");
        BigInteger bigInteger2 = new BigInteger("100");
        System.out.println(bigInteger);

        //1. 对BigInteger 进行 加减乘除, 需要使用对应的方法,不能直接 + - * /
        //2.
        BigInteger add = bigInteger.add(bigInteger2);
        System.out.println(add);//加

        BigInteger subtract = bigInteger.subtract(bigInteger2);
        System.out.println(subtract);//减

        BigInteger multiply = bigInteger.multiply(bigInteger2);
        System.out.println(multiply);//乘

        BigInteger divide = bigInteger.divide(bigInteger2);
        System.out.println(divide);//除


    }
}
