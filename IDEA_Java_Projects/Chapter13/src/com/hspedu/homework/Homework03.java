package com.hspedu.homework;

/**
 * @author 丁聪
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) {
        String name = "HAN shun PING";
        printName(name);

    }

    // 输入 HAN SHUN PING
    // 打印 PING,HAN .S
    // 1. 分割字符串 split()
    // 2. 对得到的String[] 进行格式化 String.format()
    // 3. 对输入的字符串校验
    public static void printName(String str) {

        if (str == null) {
            System.out.println("str不能为空");
            return;
        }

        String[] names = str.split(" ");
        if (names.length != 3) {
            System.out.println("输入的字符串格式不对");
            return;
        }

        String format = String.format("%s,%s .%c", names[2], names[0], names[1].toUpperCase().charAt(0));
        System.out.println(format);

    }
}
