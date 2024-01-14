package com.hspedu.homework;

/**
 * @author 丁聪
 * @version 1.0
 */
public class Person {
    private String name;
    private Vehicles vehicles;

    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public void passRiver(){
        //先得到船
//        Boat boat = VehiclesFactory.getBoat();
//        boat.work();
        if(!(vehicles instanceof Boat)) {
            vehicles =  VehiclesFactory.getBoat();
        }
        vehicles.work();
    }
    public void common(){
        //判断一下 当前的vehicles属性 是否已经存在了
//        if(vehicles == null){
        if(!(vehicles instanceof Horse)){
            //这里是多态
            vehicles = VehiclesFactory.getHorse();
        }
        //这列体现 接口调用
        vehicles.work();
    }

    public void passHill(){
        if(!(vehicles instanceof Plane)){
            vehicles = VehiclesFactory.getPlane();
        }
        vehicles.work();
    }
}
