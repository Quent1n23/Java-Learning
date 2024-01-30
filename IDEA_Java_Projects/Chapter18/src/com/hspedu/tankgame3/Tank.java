package com.hspedu.tankgame3;

/**
 * @author 丁聪
 * @version 1.0
 */
public class Tank {
    private int x;//坦克的横坐标
    private int y;//坦克的纵坐标
    private int direct;//坦克方向 0123
    private int speed = 1;

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }


    //上右下左移动
    public void moveUp(){
        y-= speed;
    }
    public void moveRight(){
        x+= speed;
    }
    public void moveDown(){
        y+= speed;
    }
    public void moveLeft(){
        x-= speed;
    }

    public int getDirect() {
        return direct;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setDirect(int direct) {
        this.direct = direct;
    }



    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
