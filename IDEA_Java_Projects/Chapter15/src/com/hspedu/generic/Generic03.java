package com.hspedu.generic;

/**
 * @author 丁聪
 * @version 1.0
 */
public class Generic03 {
    public static void main(String[] args) {
        Person<String> person = new Person<String>("韩顺平教育");
        person.show();

        Person<Integer> person2 = new Person<Integer>(100);
        person2.show();

    }
}


//泛型的作用是：可以在 类声明时 通过一个标识 表示 类中某个属性的类型，
// 或者是某个方法的返回值的类型，或者是参数类型

class Person<E> {
    E s;//E 表示s的数据类型,该数据类型在定义Person对象时指定,即 在编译期间,就确定E是什么类型

    public Person(E s) {//E也可以是参数类型
        this.s = s;
    }

    public E f() {// E 可以是返回类型
        return s;
    }
    public void show() {
        System.out.println(s.getClass());
    }
}