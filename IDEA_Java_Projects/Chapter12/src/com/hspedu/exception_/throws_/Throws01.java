package com.hspedu.exception_.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author 丁聪
 * @version 1.0
 */
public class Throws01 {
    public static void main(String[] args) {

    }

    public void f1() throws FileNotFoundException {
        //创建了一个文件流对象

        //1. 编译异常 FileNotFoundException
        //2. 可以使用 try-catch-finally
        //3. 使用throws,抛出异常, 让调用f2()方法的调用者(方法)处理
        //4. throws Exception 直接写父类
        //5. throws 异常列表, 即 抛出多个异常
        FileInputStream fis = new FileInputStream("d://aa.txt");
    }
}
