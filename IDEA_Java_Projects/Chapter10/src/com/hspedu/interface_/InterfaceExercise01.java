package com.hspedu.interface_;

public class InterfaceExercise01 {
    public static void main(String[] args) {
        BB bb = new BB();
        System.out.println(bb.a);//23
        System.out.println(AA.a);//23
        System.out.println(BB.a);//23
    }
}

interface AA{
    int a = 23;//public static final
}
class BB implements AA{

}