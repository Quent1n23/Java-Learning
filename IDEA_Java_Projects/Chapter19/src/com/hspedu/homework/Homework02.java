package com.hspedu.homework;

import java.io.*;

/**
 * @author 丁聪
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) throws IOException {
        /**
         * 要求:  使用BufferedReader读取一个文本文件，为每行加上行号，
         * 再连同内容一并输出到屏幕上。
         */

        String filePath = "e:\\aa.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        String line = "";
        int i = 1;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println((i++) + line);
        }
        bufferedReader.close();

    }
}
