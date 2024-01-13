package com.hspedu.interface_;
//子类继承了父类,就自动的拥有父类的功能
//如果子类需要扩展功能,可以通过 实现接口 来实现
//接口是对java单继承机制的补充
public class ExtendsVsInterface {
    public static void main(String[] args) {
        LittleMonkey wuKong = new LittleMonkey("悟空");
        wuKong.climbing();
        wuKong.swimming();
        wuKong.flying();
    }
}
//猴子
class Monkey{
    private String name;

    public Monkey(String name) {
        this.name = name;
    }

    public void climbing(){
        System.out.println(name+"会爬树");
    }

    public String getName() {
        return name;
    }
}

//接口
interface Fishable{
    void swimming();
}
interface BirdAble{
    void flying();
}

//继承
class LittleMonkey extends Monkey implements Fishable,BirdAble{
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(getName()+" 通过学习,可以像鱼一样游泳");
    }

    @Override
    public void flying() {
        System.out.println(getName()+" 通过学习,可以像鸟一样飞翔");
    }
}