package com.hspedu.homework;

/**
 * @author 丁聪
 * @version 1.0
 */
public class Homework07 {
    public static void main(String[] args) {
        Car2 car2 = new Car2(60);
        car2.getAir().flow();
        Car2 car21 = new Car2(-5);
        car21.getAir().flow();
        Car2 car22 = new Car2(20);
        car22.getAir().flow();
    }
}
class Car2{
   private double temperature;

    public Car2(double temperature) {
        this.temperature = temperature;
    }

    class Air{
       public void flow(){
           if(temperature > 40){
               System.out.println("温度大于40度,空调吹冷气");
           }else if(temperature < 0){
               System.out.println("温度小于0度,空调吹暖气");
           }else{
               System.out.println("温度正常,关闭空调");
           }
       }
   }
   //提供方法,返回Air对象
    public Air getAir(){
       return new Air();
    }
}