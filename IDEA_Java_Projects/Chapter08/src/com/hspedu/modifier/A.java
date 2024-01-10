package com.hspedu.modifier;
/*
访问级别    访问控制修饰符     同类(本类)   同包   子类   不同包
公开          public               √        √       √      √
受保护        protected            √        √       √      ×
默认          没有修饰符           √        √       ×      ×
私有          private              √        ×       ×      ×
 */
public class A {
    public int n1 = 100;
    protected int n2 = 200;
    int n3 = 300;
    private int n4 = 400;

    public void m1() {
        //在 同一个类下，可以访问 public ，protected ，默认，private 修饰的属性
        System.out.println("n1=" + n1 +" n2=" + n2 + " n3=" + n3 + " n4=" + n4);
    }
    protected void m2() { }
    void m3() { }
    private void m4() { }

    public void hi() {
        //修饰符可以修饰方法
        m1();
        m2();
        m3();
        m4();
    }

}
