package com.hspedu.exception_.try_;

/**
 * @author 丁聪
 * @version 1.0
 */
public class TryCatchDetail {
    public static void main(String[] args) {

        try {
            String str = "韩顺平";
            int a = Integer.parseInt(str);
            System.out.println("数字"+a);
        } catch (NumberFormatException e) {
//            e.printStackTrace();
            System.out.println("异常信息="+ e.getMessage());
        } finally{
            System.out.println("finally代码块被执行");
        }

        System.out.println("程序继续执行");
    }
}
