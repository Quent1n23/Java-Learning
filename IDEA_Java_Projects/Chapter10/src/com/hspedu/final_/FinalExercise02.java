package com.hspedu.final_;

public class FinalExercise02 {
    public static void main(String[] args) {

    }
}
class Something{
    public int addOne(final int x) {
        //++x;  修改了x的值,不行   x被final修饰
        return x + 1;
    }
}