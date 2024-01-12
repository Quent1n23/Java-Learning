package com.hspedu.abstract_;

public class AbstractDetail02 {
    public static void main(String[] args) {

    }
}
//抽象类 还是 类 ,可以有类的各种成员
abstract class D {
    public int n1 = 10;
    public static String name = "韩顺平教育";
    public void hi(){
        System.out.println("hi");
    }
}
//若抽象类被继承,则子类必须是  1.抽象类 或 2.实现了父类的 所有抽象方法
abstract class E{
    public abstract void  hi();
}
abstract class F extends E{

}
class G extends E{
    @Override
    public void hi() {//这里相当于 子类G 实现了父类E的抽象方法

    }
}

//抽象方法 不能使用 private final static
//因为这些关键字都是和重写相违背的