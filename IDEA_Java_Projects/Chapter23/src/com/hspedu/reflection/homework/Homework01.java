package com.hspedu.reflection.homework;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 丁聪
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        /**
         * 定义PrivateTest类，有私有name属性，并且属性值为hellokitty
         * 提供getName的公有方法
         * 创建PrivateTest的类，利用Class类得到私有的name属性，修改私有的name属性值，并调用getName()的方法打印name属性值
         */
        //1. 得到 PrivateTest类对应的Class对象
        Class<PrivateTest> privateTestClass = PrivateTest.class;

        //2. 创建对象实例
        PrivateTest privateTest = privateTestClass.newInstance();

        //3. 得到name属性对象
        Field name = privateTestClass.getDeclaredField("name");

        //4. 暴破name
        name.setAccessible(true);
        name.set(privateTest,"天龙八部");

        //5. 得到getName方法对象
        Method getName = privateTestClass.getMethod("getName");
        //6. 因为getName() 是public，所有直接调用
        Object invoke = getName.invoke(privateTest);
        System.out.println("name = " + invoke);
    }
}

class PrivateTest {
    private String name = "hellokitty";
    //默认无参构造器
    public String getName() {
        return name;
    }
}