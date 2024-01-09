package com.hspedu.extend_.exercise;

public class PC extends Computer {
    private String brand;//品牌

    public PC(String cpu, int memory, int disk, String brand) {
        super(cpu, memory, disk);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printInfoPC() {
        System.out.println("PC信息:");
//        System.out.println(getCpu()+getMemory()+getDisk());
        System.out.println(getDetails() + " brand=" + brand);
    }
}
