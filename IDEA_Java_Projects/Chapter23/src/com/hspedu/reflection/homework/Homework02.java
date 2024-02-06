package com.hspedu.reflection.homework;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 丁聪
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /**
         * 利用Class类的forName方法得到File类的class 对象
         * 在控制台打印File类的所有构造器
         * 通过newInstance的方法创建File对象，并创建E:\mynew.txt文件
         */
        //1. Class类的forName方法得到File类的class 对象
        Class<?> fileCls = Class.forName("java.io.File");
        //2. 得到所有的构造器
        Constructor<?>[] declaredConstructors = fileCls.getDeclaredConstructors();
        //遍历输出
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("File构造器 = "+declaredConstructor);
        }
        //3. 指定的得到 public java.io.File(java.lang.String)
        Constructor<?> declaredConstructor = fileCls.getDeclaredConstructor(String.class);
        String filePath = "e:\\myNew.txt";
        Object file = declaredConstructor.newInstance(filePath);//创建File对象

        //4. 得到createNewFile 的方法对象
        Method createNewFile = fileCls.getMethod("createNewFile");
        createNewFile.invoke(file);
        //file的运行类型就是File
        System.out.println(file.getClass());
    }
}
