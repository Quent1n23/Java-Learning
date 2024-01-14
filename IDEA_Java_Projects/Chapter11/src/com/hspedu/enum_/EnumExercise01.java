package com.hspedu.enum_;

/**
 * @author 丁聪
 * @version 1.0
 */
public class EnumExercise01 {
    public static void main(String[] args) {
        Gender2 boy = Gender2.BOY;
        Gender2 boy2 = Gender2.BOY;
        //本质 调用父类Enum  的 toString() : return name;
        System.out.println(boy);
        System.out.println(boy2 == boy);//true
    }
}
enum Gender2{
    BOY,GIRL;
}
