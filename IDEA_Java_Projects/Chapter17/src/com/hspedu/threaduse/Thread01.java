package com.hspedu.threaduse;

/**
 * @author 丁聪
 * @version 1.0
 * 演示通过继承Thread类创建线程
 */
public class Thread01 {
    public static void main(String[] args)  throws InterruptedException{
        //创建Cat对象,可以当作线程使用
        Cat cat = new Cat();

        //源码
        /*
            (1)
            public synchronized void start() {
                start0();
            }
            (2)
            //start0() 是本地方法，是JVM调用, 底层是c/c++实现
            //真正实现多线程的效果， 是start0(), 而不是 run
            private native void start0();

         */

        cat.start();//启动线程->最终会执行cat的run方法
        //cat.run();//run方法就是一个普通的方法, 没有真正的启动一个线程，就会把run方法执行完毕，才向下执行
        //说明:当main线程启动一个子线程Thread-0,主线程不会阻塞,会继续执行
        //这时 主线程 和 子线程 交替执行

        System.out.println("主线程继续执行" + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程 i=" + i);
            //让主线程休眠
            Thread.sleep(1000);
        }

    }
}

//1. 当一个类继承了 Thread 类， 该类就可以当做线程使用
//2. 我们会重写 run方法，写上自己的业务代码
//3. run Thread 类 实现了 Runnable 接口的run方法
/*
    @Override
    public void run() {
        if (target != null) {
            target.run();
        }
    }
 */
class Cat extends Thread {

    int times = 0;


    @Override
    public void run() {//重写run方法，写上自己的业务逻辑

        while (true) {
            //该线程每隔1秒。在控制台输出 “喵喵, 我是小猫咪”
            System.out.println("喵喵, 我是小猫咪" + (++times) + " 线程名=" + Thread.currentThread().getName());
            //让该线程休眠1秒
            try {
                Thread.sleep(1000);//单位:毫秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times == 8) {
                break;//times到80时,退出while,这时线程也退出
            }
        }


    }
}
