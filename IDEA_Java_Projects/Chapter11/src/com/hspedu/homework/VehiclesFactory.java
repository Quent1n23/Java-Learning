package com.hspedu.homework;

/**
 * @author 丁聪
 * @version 1.0
 */
public class VehiclesFactory {
    private static Horse horse = new Horse();//饿汉式
    private VehiclesFactory(){}
    //马儿始终是同一匹
    //创建交通工具工厂类,有两个方法 分别获取交通工具 horse boat
    public static Horse getHorse(){
//        return new Horse();
        return horse;
    }
    public static Boat getBoat(){
        return new Boat();
    }
    public static Plane getPlane(){
        return new Plane();
    }
}
