package com.hspedu.homework;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.Properties;

/**
 * @author 丁聪
 * @version 1.0
 */
public class Homework03 {
    public static void main(String[] args) throws IOException {
        /**
         * (1) 要编写一个dog.properties   name=tom age=5 color=red
         * (2) 编写Dog 类(name,age,color)  创建一个dog对象，读取dog.properties 用相应的内容完成属性初始化, 并输出
         * (3) 将创建的Dog 对象 ，序列化到 文件 e:\\dog.dat 文件
         */
        Properties properties = new Properties();
//        properties.setProperty("name","tom");
//        properties.setProperty("age","5");
//        properties.setProperty("color","red");
//        properties.store(new FileOutputStream("src\\dog.properties"),null);

        String filePath = "src\\dog.properties";
        properties.load(new FileReader(filePath));
//        properties.list(System.out);

//        Object name = properties.get("name");
        String name = properties.get("name") + "";//Object ->String
//        int age = (int) properties.get("age");   异常
        int age = Integer.parseInt(properties.get("age") + "");//Object ->int
        String color = properties.get("color") + "";//Object ->String

        Dog dog = new Dog(name, age, color);
        System.out.println("===dog===");
        System.out.println(dog);

        //将创建的Dog 对象 ，序列化到 文件 e:\\dog.dat 文件
        String serFilePath = "e:\\dog.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(serFilePath));
        oos.writeObject(dog);

        oos.close();
        System.out.println("序列化完成");

    }

    //编写一个方法 反序列化
    @Test
    public void m1() throws IOException, ClassNotFoundException {
        String serFilePath = "e:\\dog.dat";
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(serFilePath));
        Dog dog = (Dog)ois.readObject();

        System.out.println("===反序列化===");
        System.out.println(dog);
        ois.close();
    }

}

class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}