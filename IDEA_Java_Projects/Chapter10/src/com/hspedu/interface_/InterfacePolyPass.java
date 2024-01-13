package com.hspedu.interface_;

/**
 * 演示多态传递现象
 */
public class InterfacePolyPass {
    public static void main(String[] args) {

        IG ig = new Teacher();
        //如果 IG接口 继承了 IH接口, 而 Teacher类  实现了 IG接口
        //实际上就相当于 Teacher类 也实现了 IH接口
        //这就是  接口多态传递现象
        IH ih = new Teacher();
    }
}
interface IH{}
interface IG extends IH{}
class Teacher implements IG{}
