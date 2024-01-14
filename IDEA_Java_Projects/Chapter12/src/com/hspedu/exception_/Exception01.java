package com.hspedu.exception_;

/**
 * @author 丁聪
 * @version 1.0
 */
public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        //当执行到num1/num2时,因为num2=0,程序就会抛出异常 ArithmeticException
        //当抛出异常后,程序就退出, 崩溃, 下面的代码就不再执行
        //不算致命问题,但导致了系统崩溃
        //用 异常处理机制 来解决
//        int res = num1 / num2;// 10 / 0

        //如果程序员,认为一段代码可能会出现异常,可以使用try-catch异常处理机制来解决
        //从而保证程序的健壮性
        //选中代码块 -> ctrl + alt + t -> try-catch
        try {
            int res = num1 / num2;
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("异常原因: "+e.getMessage());
        }

        System.out.println("程序继续运行");
    }
}
