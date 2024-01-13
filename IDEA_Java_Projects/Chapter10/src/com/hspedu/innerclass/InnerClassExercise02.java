package com.hspedu.innerclass;

public class InnerClassExercise02 {
    public static void main(String[] args) {

        cellPhone cellPhone = new cellPhone();
        //1. 传递的是 实现了Bell接口的 匿名内部类
        //2. 重写了ring()
        //3. Bell bell = new Bell() {
        //            @Override
        //            public void ring() {
        //                System.out.println("懒猪起床了");
        //            }
        //        };

        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床了");
            }
        });
        cellPhone.alarmClock(new Bell() {
            @Override
            public void ring() {
                System.out.println("小伙伴上课了");
            }
        });
    }
}
interface Bell{
    void ring();
}
class cellPhone{
    public void alarmClock(Bell bell){//形参是Bell接口类型
        bell.ring();
    }
}