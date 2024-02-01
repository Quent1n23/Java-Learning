package com.hspedu.homework;

import java.io.*;

/**
 * @author 丁聪
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) throws IOException {
        /**
         *(1) 在判断e盘下是否有文件夹mytemp ,如果没有就创建mytemp
         *(2) 在e:\\mytemp 目录下, 创建文件 hello.txt
         *(3) 如果hello.txt 已经存在，提示该文件已经存在，就不要再重复创建了
         *(4) 并且在hello.txt 文件中，写入 hello,world~
         */

        String directoryPath = "e:\\mytemp";
        File file = new File(directoryPath);
        if (!file.exists()) {
            if (file.mkdirs()) {
                System.out.println(directoryPath + "创建成功");
            } else {
                System.out.println(directoryPath + "创建失败");
            }
        } else {
            System.out.println(directoryPath + "已经存在");
        }

        //String filePath = "e:\\mytemp\\hello.txt";
        String filePath = directoryPath + "\\hello.txt";
        //File file = new File(filePath);
        file = new File(filePath);
        if (!file.exists()) {
            if (file.createNewFile()) {
                System.out.println(filePath + "创建成功");
                //如果文件存在,就写入
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write("hello,world");
                bufferedWriter.close();
            } else {
                System.out.println(filePath + "创建失败");
            }
        } else {
            System.out.println(filePath + "已经存在");
        }

    }
}
