package tankgame4;

import java.util.Vector;

/**
 * @author 丁聪
 * @version 1.0
 * 敌方坦克
 */
public class EnemyTank extends Tank implements Runnable {
    public EnemyTank(int x, int y) {
        super(x, y);
    }

    boolean isLive = true;

    //使用Vector,保存多个shot
    Vector<Shot> shots = new Vector<>();

    @Override
    public void run() {
        while (true) {
            //判断 shots.size() == 0,坦克子弹集合中已经没有子弹了,那就创建一颗子弹,放入到集合中
            if (isLive && shots.size() < 1) {
                Shot s = null;
                //判断坦克方向
                switch (getDirect()) {
                    case 0:
                        s = new Shot(getX() + 20, getY(), 0);
                        break;
                    case 1:
                        s = new Shot(getX() + 60, getY() + 20, 1);
                        break;
                    case 2:
                        s = new Shot(getX() + 20, getY() + 60, 2);
                        break;
                    case 3:
                        s = new Shot(getX(), getY() + 20, 3);
                        break;
                }
                shots.add(s);
                new Thread(s).start();
            }
            //根据坦克的方向来继续移动
            switch (getDirect()) {
                case 0: //向上
                    //让坦克保持一个方向,走 30步
                    for (int i = 0; i < 30; i++) {

                        moveUP();
                        //休眠一下
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 1: //向右
                    for (int i = 0; i < 30; i++) {
                        moveRIGHT();
                        //休眠一下
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 2: //向下
                    for (int i = 0; i < 30; i++) {
                        moveDOWN();
                        //休眠一下
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 3: //向左
                    for (int i = 0; i < 30; i++) {
                        moveLEFT();
                        //休眠一下
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
            }

            //然后随机改变坦克方向 [0,4)
            setDirect((int) (Math.random() * 4));
            //写并发程序,一定要考虑清楚.该线程是什么时候结束
            if (!isLive) {//没有存活
                break;
            }
        }
    }
}
