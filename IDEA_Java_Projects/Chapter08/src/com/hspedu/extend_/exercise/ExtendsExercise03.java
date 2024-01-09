package com.hspedu.extend_.exercise;

public class ExtendsExercise03 {
    public static void main(String[] args) {
        PC pc = new PC("intel", 16,500,"IBM");
        pc.printInfoPC();
        NotePad notePad = new NotePad("麒麟", 16, 512, "white");
        notePad.printInfoPad();
    }
}

class Computer {
    private String cpu;
    private int memory;//内存
    private int disk;//硬盘

    public Computer() {
    }

    public Computer(String cpu, int memory, int disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }

    //返回computer信息
    public String getDetails() {
        return "cpu=" + cpu +" memory=" + memory+" disk" + disk;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getDisk() {
        return disk;
    }

    public void setDisk(int disk) {
        this.disk = disk;
    }
}
