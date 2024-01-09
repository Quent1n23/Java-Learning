package com.hspedu.poly_.detail_;

public class PolyDetail {
    public static void main(String[] args) {

        //向上转型：父类的引用指向了子类的对象
        Animal animal = new Cat();

        //调用属性，看编译类型
        //调用方法，看运行类型

        //1. 可以调用父类的所有成员(遵守访问权限)
        //2. 不能调用 子类 特有的成员
        //3. 因为在 编译阶段，能调用哪些成员，是由编译类型来决定的
//        animal.catchMouse;错误
        //4. 最终运行效果看子类的具体实现
        animal.eat();
        animal.run();
        animal.show();
        animal.sleep();

        //希望可以调用Cat的 catchMouse方法
        //向下转型
        //1. 语法
        //cat 的 编译类型 Cat, 运行类型 Cat
        Cat cat = (Cat) animal;//把 animal 强转
        cat.catchMouse();
        //2. 要求 父类的引用 必须指向的是 当前目标类型的对象
        //  animal = new Cat()              Cat cat
    }
}
