package com.hspedu.exception_.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author 丁聪
 * @version 1.0
 */
//1. 编译异常,程序中必须处理, try-catch,throws
//2. 运行时异常, 程序中如果没有处理,默认就是throws的方式
public class ThrowsDetail {
    public static void main(String[] args) {

    }
    public static void f2() throws FileNotFoundException{
        //调用f3(),  抛出一个 编译异常,  必须处理
        //在f1中, 要么 try-catch-finally,  要么继续 throws
        f3(); //
    }
    public static void f3() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("d://aa.txt");
    }
    public static void f4(){
        //没有异常,
        //原因是f5()抛出的是 运行异常
        f5();
    }
    public static void f5() throws ArithmeticException{

    }
}

//3. 继承, 重写方法时, 子类抛出的异常 必须是 父类抛出的异常的类型的子类 或相同
class Father{
    public void method() throws RuntimeException{}
}
class Son extends Father{
    @Override
    public void method() throws  ArithmeticException {
    }
}