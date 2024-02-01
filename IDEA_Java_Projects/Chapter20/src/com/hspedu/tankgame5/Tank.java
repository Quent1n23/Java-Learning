package com.hspedu.tankgame5;

/**
 * @author 丁聪
 * @version 1.0
 */
public class Tank {
    private int x;
    private int y;//坐标
    private int direct = 0;//方向 0123--上右下左
    private int speed = 1;//速度
    boolean isLive = true;

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void moveUP() {//上
        if (y > 0 )
            y -= speed;
    }

    public void moveDOWN() {//下
        if (y + 60 < 750)
            y += speed;
    }

    public void moveLEFT() {//左
        if (x > 0)
            x -= speed;
    }

    public void moveRIGHT() {//右
        if (x + 60 < 1000)
            x += speed;
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

    public int getDirect() {
        return direct;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
