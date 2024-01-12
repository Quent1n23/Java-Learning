package com.hspedu.static_;
//类方法
//静态方法

public class StaticMethod {
    public static void main(String[] args) {
        //创建2个学生,收学费
        Stu tom = new Stu("tom");
        tom.payFee(100);

        Stu mary = new Stu("mary");
        mary.payFee(200);

        //输出当前收到的总学费
        Stu.showFee();

        //如果我们希望 不创建实例,也可以调用某个方法(即当作工具来使用)
        //这时 把方法做成静态方法是非常合适的
    }
}
//开发自己的工具类时,可以将方法做成静态的,方便调用
class Stu {
    private String name;//普通成员
    //定义一个静态变量,来累计学生的学费
    private static double fee = 0;

    public Stu(String name) {
        this.name = name;
    }
    //
    //1.当方法使用了static修饰后,该方法就是一个静态方法
    //2. 静态方法就可以访问静态属性/变量
    public static void payFee(double fee) {
        Stu.fee += fee;//累积到静态变量里
    }
    public static void showFee() {
        System.out.println("总学费有: "+ Stu.fee);
    }
}
