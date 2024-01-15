package com.hspedu.exception_.customexception;

/**
 * @author 丁聪
 * @version 1.0
 */
public class CustomException {
    public static void main(String[] args) {
        int age = 80;
        //要求在 18-120 之间, 否则抛出一个 自定义异常
        if (!(age >= 18 && age <= 120)){
            throw new AgeException("年龄需要在18-120之间");
        }
        System.out.println("你的年龄范围是正确的");
    }
}

//自定义异常
//1. 一般情况下继承 RuntimeException
//2. 运行时异常, 可以使用默认的 异常处理机制
class AgeException extends RuntimeException {
    public AgeException(String message) {
        super(message);
    }
}
