package com.hspedu.innerclass;
//成员内部类
public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer08 outer08 = new Outer08();
        outer08.t1();

        //外部其他类,使用成员内部类
        //1.
        Outer08.Inner08 inner08 = outer08.new Inner08();
        inner08.say();
        //2. 在外部类中,编写一个方法,可以返回inner08的对象
        Outer08.Inner08 inner08Instance = outer08.getInner08Instance();
        inner08Instance.say();
        //3.
        Outer08.Inner08 inner081 = new Outer08().new Inner08();
    }
}
class Outer08 {//外部类

    private int n1 = 10;
    public String name = "张三";

    private void hi(){
        System.out.println("hi()方法");
    }

    //1. 成员内部类的位置
    //2. 可以添加任意的修饰符
    //3. 作用域
    class Inner08{
        public Inner08() {
        }//成员内部类
        public void say(){
            System.out.println("n1="+n1+" name=" + name);
        }
    }

    //get方法,返回inner08实例
    public Inner08 getInner08Instance(){
        return new Inner08();
    }

    //
    public void t1(){
        //使用成员内部类
        Inner08 inner08 = new Inner08();
        inner08.say();
    }
}