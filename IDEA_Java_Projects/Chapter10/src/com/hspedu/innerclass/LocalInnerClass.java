package com.hspedu.innerclass;

/**
 * 演示局部内部类的使用
 */
public class LocalInnerClass {//外部其他类
    public static void main(String[] args) {

        Outer02 outer02 = new Outer02();
        outer02.m1();
        System.out.println("Outer02 hashcode="+outer02);
    }
}
class Outer02{
    private int n1 = 100;
    private void m2(){
        System.out.println("Outer02 m2()");
    }//私有方法

    public void m1(){//方法
        //1. 局部内部类是定义在外部类的局部位置,通常在方法中
        //3. 不能添加访问修饰符,但是可以使用final修饰
        //4. 作用域
        class Inner02{//局部内部类
            //2. 可以直接访问外部类的所有成员,包含私有的
            private int n1 = 800;
            public void f1(){
                //5.  局部内部类 可以 直接访问外部类的成员
                //7. 如果外部类和局部内部类的成员重名时,默认遵循就近原则, 若像访问外部类的成员
                //使用 外部类名.this.成员
                //Outer02.this 本质就是外部类的对象

                System.out.println("n1=" + n1+" 外部类的n1=" + Outer02.this.n1);
                System.out.println("Outer02.this hashcode=" + Outer02.this);
                m2();
            }
        }
        //6. 外部类在方法中,可以创建Inner02对象,然后调用方法即可
        Inner02 inner02 = new Inner02();
        inner02.f1();

    }
}
