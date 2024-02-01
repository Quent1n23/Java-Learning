package com.hspedu.tankgame5;

/**
 * @author 丁聪
 * @version 1.0
 */
public class Shot implements Runnable {
    int x;
    int y;
    int direct = 0;//子弹方向
    int speed = 2;//子弹的速度
    boolean isLive = true;//子弹是否还存活

    //构造器


    public Shot(int x, int y, int direct) {
        this.x = x;
        this.y = y;
        this.direct = direct;
    }

    @Override
    public void run() {//射击
        while (true) {
            //休眠50ms
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //根据方向来改变坐标
            switch (direct) {
                case 0://上
                    y -= speed;
                    break;
                case 1://右
                    x += speed;
                    break;
                case 2://下
                    y += speed;
                    break;
                case 3://左
                    x -= speed;
                    break;
            }
            //测试 输出坐标
            System.out.println("子弹 x=" + x + " y=" + y);
            //子弹移到到边界时,应该销毁(把启动的子弹的线程销毁)
            //子弹碰到敌人坦克时,也应该结束线程
            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750 && isLive)) {
                System.out.println("子弹线程退出");
                isLive = false;
                break;
            }
        }
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
