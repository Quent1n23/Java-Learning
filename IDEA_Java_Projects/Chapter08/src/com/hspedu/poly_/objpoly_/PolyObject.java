package com.hspedu.poly_.objpoly_;
/**
 * 对象的多态
 * 1. 一个对象的 编译类型 和 运行类型 可以不一致
 * 2. 编译类型 在定义对象时，就确定了，不能改变
 * 3. 运行类型 是可以变化的
 * 4. 编译类型 看定义时 =等号 的 左边， 运行类型 看 =等号 的右边
 *
 * Animal animal = new Dog();
 * animal 编译类型是 Animal， 运行类型是 Dog
 * animal = new Cat();  animal 的运行类型变成了Cat，编译类型 仍然是 Animal
 */
public class PolyObject {
    public static void main(String[] args) {
        //体验 对象多态 特点

        //animal 编译类型是 Animal， 运行类型是 Dog
        Animal animal = new Dog();
        //运行时，执行到该行时，animal运行类型是Dog，所以是Dog的cry()
        animal.cry();//小狗叫

        //animal 编译类型 仍然是Animal,运行类型是 Cat
        animal = new Cat();
        animal.cry();
    }
}
