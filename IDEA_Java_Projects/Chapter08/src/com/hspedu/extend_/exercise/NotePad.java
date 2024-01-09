package com.hspedu.extend_.exercise;

public class NotePad extends Computer {
    private String color;

    public NotePad(String cpu, int memory, int disk, String color) {
        super(cpu, memory, disk);
        this.color = color;
    }

    public void printInfoPad() {
        System.out.println("NotePad信息：");
        System.out.println(getDetails() + " color=" + color);
    }
}
