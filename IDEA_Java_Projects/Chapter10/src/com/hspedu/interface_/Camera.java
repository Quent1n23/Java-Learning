package com.hspedu.interface_;

public class Camera implements UsbInterface{//实现接口,本质就是把接口的方法实现
    @Override
    public void start() {
        System.out.println("相机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("相机停止工作");
    }
}
