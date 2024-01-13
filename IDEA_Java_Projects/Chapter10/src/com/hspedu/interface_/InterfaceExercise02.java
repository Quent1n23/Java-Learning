package com.hspedu.interface_;

public class InterfaceExercise02 {
}

interface A01 {
    int x = 0;
}

class B01 {
    int x = 1;
}

class C01 extends B01 implements A01 {
    public void pX() {
//        System.out.println(x);//错误,原因不明确x
        //可以明确指定x
        //接口x   A01.x
        //父类x   super.x
        System.out.println(A01.x + " "+super.x);
    }

    public static void main(String[] args) {
        new C01().pX();
    }
}
