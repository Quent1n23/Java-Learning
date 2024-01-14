package com.hspedu.annotation_;

/**
 * @author 丁聪
 * @version 1.0
 */
public class Deprecated_ {
    public static void main(String[] args) {
        A a = new A();
        a.hi();
        System.out.println(a.n1);
    }
}

//1. @Deprecated 修饰某个元素,表示该元素已经过时
//2. 即不推荐使用, 但是还能用
//3. 修饰方法,类,字段,包,参数, 等等
//4. 可以做 版本升级过渡使用
/*
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
public @interface Deprecated {
}
 */
@Deprecated
class A{
    @Deprecated
    public int n1 = 10;
    @Deprecated
    public void hi(){

    }
}
