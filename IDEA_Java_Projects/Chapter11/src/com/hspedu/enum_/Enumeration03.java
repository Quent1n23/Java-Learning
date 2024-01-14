package com.hspedu.enum_;

/**
 * @author 丁聪
 * @version 1.0
 */
public class Enumeration03 {
    public static void main(String[] args) {

        System.out.println(Season3.AUTUMN);
        System.out.println(Season3.SPRING);
        System.out.println(Season3.SUMMER);
        System.out.println(Season3.WINTER);
    }
}

//使用enum关键字来实现枚举类
//1. 使用 enum 替代 class
//2. public static final Season3 SPRING = new Season3("春天", "温暖");
//   使用  SPRING("春天", "温暖");  替代
//3. 如果有多个常量(对象),使用 逗号, 间隔
//4. 如果使用enum, 要求将定义的常量对象 写在前面
//5. 如果使用无参构造器 创建常量对象,则可以省略()
enum Season3 {
    SPRING("春天", "温暖"),WINTER("冬天", "寒冷"),
    SUMMER("夏天", "炎热"),AUTUMN("秋天", "凉爽"),
    What,Why();

    private String name;
    private String desc;

    //定义了四个对象
//    public static final Season3 SPRING = new Season3("春天", "温暖");
//    public static final Season3 WINTER = new Season3("冬天", "寒冷");
//    public static final Season3 SUMMER = new Season3("夏天", "炎热");
//    public static final Season3 AUTUMN = new Season3("秋天", "凉爽");


    Season3() {
    }

    private Season3(String name, String desc) {
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
        return "Season3{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}