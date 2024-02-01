package com.hspedu.tankgame5;

import java.util.Vector;

/**
 * @author 丁聪
 * @version 1.0
 * 我方坦克
 */
public class Hero extends Tank {
    public Hero(int x, int y) {
        super(x, y);
        this.setSpeed(5);
    }

    //定义一个Shot对象,表示一个射击(线程)
    Shot shot = null;
    //可以发射多颗子弹
    Vector<Shot> shots = new Vector<>();

    //射击
    public void shotEnemyTank() {
        //控制:最多发射5颗子弹
        if(shots.size() == 5){
            return;
        }

        //创建Shot对象,根据当前Hero对象的位置和方向来创建Shot
        switch (getDirect()) {//得到Hero对象的方向
            case 0://向上
                shot = new Shot(getX() + 20, getY(), 0);
                shot.setSpeed(5);
                break;
            case 1://向右
                shot = new Shot(getX() + 60, getY()+20, 1);
                shot.setSpeed(5);
                break;
            case 2://向下
                shot = new Shot(getX() + 20, getY()+60, 2);
                shot.setSpeed(5);
                break;
            case 3://向左
                shot = new Shot(getX(), getY()+20, 3);
                shot.setSpeed(5);
                break;
        }

        //把新创建的shot放入到shots
        shots.add(shot);
        //启动Shot线程
        new Thread(shot).start();
    }
}
