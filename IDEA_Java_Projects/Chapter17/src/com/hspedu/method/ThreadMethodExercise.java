package com.hspedu.method;

/**
 * @author 丁聪
 * @version 1.0
 */
public class ThreadMethodExercise {
    public static void main(String[] args) throws InterruptedException {

        Thread t3 = new Thread(new T3());

        for (int i = 1; i <= 10; i++) {
            Thread.sleep(1000);
            System.out.println("hi " + i);
            if (i == 5) {//主线程输出了5次
                t3.start();//启动子线程,输出hello
                t3.join();//立即将t3子线程,插队
            }
        }
        System.out.println("主线程结束");

    }
}

class T3 implements Runnable {
    private int count = 0;

    @Override
    public void run() {

        while (true) {
            System.out.println("hello " + (++count));

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if (count == 10) {
                System.out.println("子线程结束");
                break;
            }
        }
    }
}
