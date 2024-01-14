package com.hspedu.annotation_;

//重写
/**
 * @author 丁聪
 * @version 1.0
 */
public class Override_ {
    public static void main(String[] args) {

    }
}

class Father{
    public void fly(){
        System.out.println("Father fly");
    }
}

class son extends Father{
    //如果写了 @Override注解,编译器会检查,  语法校验
    //真的是重写,通过   没有构成重写,编译错误

    //@Target(ElementType.METHOD)      只能放在方法上
    //@Retention(RetentionPolicy.SOURCE)
    //public @interface Override {
    //}
    @Override
    public void fly() {
        System.out.println("Son fly");
    }
}
