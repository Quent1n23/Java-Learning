package com.hspedu.homework;

/**
 * @author 丁聪
 * @version 1.0
 */
public class Homework02 {
    public static void main(String[] args) {

        System.out.println(Frock.getNextNum());//100100
        System.out.println(Frock.getNextNum());//100200
        Frock frock1 = new Frock();//100300
        Frock frock2 = new Frock();//100400
        Frock frock3 = new Frock();//100500
        System.out.println(frock1.getSerialNumber());
        System.out.println(frock2.getSerialNumber());
        System.out.println(frock3.getSerialNumber());
    }
}
