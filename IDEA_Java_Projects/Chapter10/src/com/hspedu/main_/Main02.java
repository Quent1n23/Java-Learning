package com.hspedu.main_;
//Edit Configurations...
//Program arguments   在里面传入参数
public class Main02 {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args["+i+"]=" + args[i]);
        }
    }
}
