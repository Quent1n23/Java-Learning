package com.hspedu.innerclass;

public class InnerClassExercise01 {
    public static void main(String[] args) {

        //匿名内部类 可以当作实参 直接传递
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("这时匿名内部类方法");
            }
        });
        //传统方法
        f1(new Picture());

    }
    //静态方法,形参是接口类型
    public static void f1(IL il){
        il.show();
    }
}
//
interface IL {
    void show();
}
//类->实现IL => 编程领域(硬编码)
class Picture implements IL{
    @Override
    public void show() {
        System.out.println("这是传统方法");
    }
}
