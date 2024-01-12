package com.hspedu.final_;

public class Final01 {
    public static void main(String[] args) {

    }
}

//1. 要求A类不能被其他类继承
final class A{
}

//2. 要求 方法 不能被子类重写
class C {
    public final void hi(){}
}
class D extends C{
//    @Override
//    public void hi() {
//        System.out.println("重写了C类的hi()");
//    }
}

//3. 不希望属性被修改
class E{
    public final double TAX_RATE = 0.08;
}

//4. 不希望某个局部变量被修改
class F{
    public void cry(){
        final double NUM = 0.01;
        //NUM  = 0.9;
        System.out.println("NUM="+NUM);
    }
}