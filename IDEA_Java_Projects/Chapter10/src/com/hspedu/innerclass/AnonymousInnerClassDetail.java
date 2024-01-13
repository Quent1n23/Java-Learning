package com.hspedu.innerclass;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
        //外部其他类 不能访问 匿名内部类

    }
}

class Outer05 {
    private int n1 = 99;

    public void f1() {
        //创建一个基于类的匿名内部类
        //不能添加访问修饰符
        Person p = new Person() {
            private int n1 = 88;
            @Override
            public void hi() {
                //可以访问外部类的所有成员,包括私有
                //外部类 内部类 重名时, 就近原则,或者 (外部类名.this.成员)
                System.out.println("匿名内部类重写了 hi方法 n1="+n1+
                        "外部类的n1="+Outer05.this.n1);
                //Outer05.this 就是调用 f1的 对象
                //谁调用,就是谁
            }
        };
        p.hi();//动态绑定  运行类型Outer05$1

        //也可以直接调用, 匿名内部类本身也是一个返回对象
        new Person() {
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了 hi(), 直接调用");
            }

            @Override
            public void ok(String str) {
                super.ok(str);
            }
        }.ok("jack");
    }
}

class Person {
    public void hi() {
        System.out.println("Person hi()");
    }

    public void ok(String str) {
        System.out.println("Person ok()" + str);
    }
}
//
