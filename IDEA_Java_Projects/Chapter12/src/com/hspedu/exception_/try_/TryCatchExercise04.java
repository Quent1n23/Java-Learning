package com.hspedu.exception_.try_;

import java.util.Scanner;

/**
 * @author 丁聪
 * @version 1.0
 */
public class TryCatchExercise04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        String inputStr = "";
        while (true) {

            System.out.print("请输入一个整数: ");
            inputStr = scanner.next();
            try {
                num = Integer.parseInt(inputStr);//强转,可能会抛出异常
                break;
            } catch (NumberFormatException e) {
                System.out.println("你输入的不是整数,请重新输入");
            }
        }

        System.out.println("你输入的数= " + num);
    }
}
