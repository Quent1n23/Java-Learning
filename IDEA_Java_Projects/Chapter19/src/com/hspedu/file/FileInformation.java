package com.hspedu.file;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @author 丁聪
 * @version 1.0
 * 获取文件的信息
 */
public class FileInformation {
    public static void main(String[] args) {

    }

    //获取文件的信息
    @Test
    public void info() {
        //先创建文件对象
        File file = new File("E:\\Repository\\Java-Learning\\IDEA_Java_Projects\\Chapter19\\src\\com\\hspedu\\file\\news1.txt");
        //调用相应的方法,得到对应信息
        System.out.println("文件名字=" + file.getName());
        System.out.println("文件绝对路径=" + file.getAbsolutePath());
        System.out.println("文件父级目录=" + file.getParent());
        System.out.println("文件大小(字节)=" + file.length());
        System.out.println("文件是否存在=" + file.exists());
        System.out.println("是不是一个文件=" + file.isFile());
        System.out.println("是不是一个目录=" + file.isDirectory());
    }
}
