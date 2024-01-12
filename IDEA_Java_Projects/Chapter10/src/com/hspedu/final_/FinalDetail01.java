package com.hspedu.final_;

public class FinalDetail01 {
    public static void main(String[] args) {
        CC cc = new CC();
        new EE().cal();
    }
}

class AA{
    /*
    1. 定义时赋值
    2. 构造器中赋值
    3. 代码块中赋值
     */
    public final double TAX_RATE = 0.08;
    public final double TAX_RATE2;
    public final double TAX_RATE3;
    public AA(){
        TAX_RATE2 = 1.1;
    }

    {
        TAX_RATE3 = 8.8;
    }
}

class BB{
    /*
    如果final修饰的是static
    1. 定义时赋值
    2. static代码块中赋值
     */
    public static final double TAX_RATE = 99.9;
    public static final double TAX_RATE2;
    static {
        TAX_RATE2 = 3.3;
    }
}

//final类不能继承,但是可以实例化对象
final class CC{

}

//类不是final类,但是含有final方法,  该方法不能被重写,但可以继承
class DD{
    public final void cal(){
        System.out.println("cal()方法");
    }
}
class EE extends DD{

}
