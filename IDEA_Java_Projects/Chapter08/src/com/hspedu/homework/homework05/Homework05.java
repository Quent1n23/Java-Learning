package com.hspedu.homework.homework05;

public class Homework05 {
    public static void main(String[] args) {
        Worker jack = new Worker("jack", 10000);
        jack.printSal();
        //
        Peasant smith = new Peasant("smith", 20000);
        smith.printSal();
        //
        Teacher hsp = new Teacher("hsp", 2000);
        hsp.setClassDays(360);
        hsp.setClassSal(1000);
        hsp.printSal();
        //
        Scientist scientist = new Scientist("钟南山", 20000);
        scientist.setBonus(2000000);
        scientist.printSal();

    }
}
