package com.hspedu.interface_;

public class InterfaceDetail02 {
    public static void main(String[] args) {
        //证明接口中的属性是 public static final
        System.out.println(IB.n1);//static  名称访问属性
        //IB.n1 = 30  //final

    }
}

//5. 一个类 可以同时实现多个接口
//6. 接口中的属性,只能是final,而且是 public static final修饰符
//7. 属性访问形式 接口名.属性名
//8. 接口不能继承其他的类, 但可以继承别的接口(多个)
//9. 接口的修饰符 只能是 默认 和 public

interface IB{
    int n1 = 10; //实际上是 : public static final int n1 = 10;
    void hi();
}
interface IC{
    void say();
}
interface ID extends IB,IC{}
interface IE{}

class Pig implements IB,IC{
    @Override
    public void hi() {

    }

    @Override
    public void say() {

    }
}
