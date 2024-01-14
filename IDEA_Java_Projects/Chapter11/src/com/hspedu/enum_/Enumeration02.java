package com.hspedu.enum_;
//自定义枚举
/**
 * @author 丁聪
 * @version 1.0
 */
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season2.AUTUMN);
        System.out.println(Season2.SPRING);
    }
}

//自定义枚举
//1. 构造器私有化, 防止直接new
//2. 去掉set方法, 防止被修改
//3. 在Season内部,直接创建固定的对象
//4. 优化,加入 final修饰符
class Season2{
    private String name;
    private String desc;

    //定义了四个对象
    public static final Season2 SPRING = new Season2("春天", "温暖");
    public static final Season2 WINTER = new Season2("冬天", "寒冷");
    public static final Season2 SUMMER = new Season2("夏天", "炎热");
    public static final Season2 AUTUMN = new Season2("秋天", "凉爽");

    private Season2(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }


    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season2{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
