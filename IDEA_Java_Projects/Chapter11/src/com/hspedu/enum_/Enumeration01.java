package com.hspedu.enum_;

/**
 * @author 丁聪
 * @version 1.0
 */
public class Enumeration01 {
    public static void main(String[] args) {
        Season spring = new Season("春天", "温暖");
        Season winter = new Season("冬天", "寒冷");
        Season summer = new Season("夏天", "炎热");
        Season autumn = new Season("秋天", "凉爽");
        //对于季节而言, 他的对象(具体的值),是固定的四个
        //=====> 枚举类 即 把具体的对象一个一个列举出来
        Season other = new Season("白天","~~");
    }
}

class Season{
    private String name;
    private String desc;

    public Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
