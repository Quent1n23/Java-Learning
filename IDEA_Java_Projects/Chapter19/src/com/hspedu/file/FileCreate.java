package com.hspedu.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @author 丁聪
 * @version 1.0
 * 演示文件的创建
 */
public class FileCreate {
    public static void main(String[] args) {

    }

    //1. new File(String pathname)
    @Test
    public void create01(){
        String filePath = "E:\\Repository\\Java-Learning\\IDEA_Java_Projects\\Chapter19\\src\\com\\hspedu\\file\\news1.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("文件news1.txt创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //2. new File(File parent,String child) //根据父目录文件+子路径构建
    @Test
    public void create02(){
        File parentFile = new File("E:\\Repository\\Java-Learning\\IDEA_Java_Projects\\Chapter19\\src\\com\\hspedu\\file\\");
        String fileName = "news2.txt";
        //这里的file对象，在java程序中，只是一个对象
        //只有执行了createNewFile 方法，才会真正的，在磁盘创建该文件
        File file = new File(parentFile, fileName);
        try {
            file.createNewFile();
            System.out.println("文件news2.txt创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //3. new File(String parent,String child) //根据父目录+子路径构建
    @Test
    public void create03(){
        String parentPath = "E:\\Repository\\Java-Learning\\IDEA_Java_Projects\\Chapter19\\src\\com\\hspedu\\file\\";
        String fileName = "news3.txt";
        File file = new File(parentPath, fileName);
        try {
            file.createNewFile();
            System.out.println("文件news3.txt创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
