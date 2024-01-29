package com.hspedu.homework;

import java.util.Scanner;

/**
 * @author 丁聪
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(a);
        a.start();
        b.start();


    }
}

class A extends Thread {
    private boolean loop = true;

    public void setLoop(boolean loop) {
        this.loop = loop;
    }

    @Override
    public void run() {
        //输出1-100随机数
        while (loop) {
            System.out.println((int) (Math.random() * 100 + 1));
            //休眠
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("a线程退出");
    }
}

//知道第二个线程 从键盘中读到 Q命令
class B extends Thread{
    private A a;
    private Scanner scanner = new Scanner(System.in);

    public B(A a) {//构造器中,直接传入A类对象
        this.a = a;
    }

    @Override
    public void run() {
        while (true){
            //接收到用户输入
            System.out.println("请输入你的指令(Q表示退出):");
            char key = scanner.next().toUpperCase().charAt(0);
            if(key == 'Q'){
                //以通知的方式结束A线程
                a.setLoop(false);
                System.out.println("b线程退出");
                break;
            }
        }
    }
}
