package com.hspedu.tankgame6;

/**
 * @author 丁聪
 * @version 1.0
 * 炸弹
 */
public class Bomb {
    //炸弹的坐标
    int x;
    int y;
    int life = 9;//炸弹的生命周期
    boolean isLive = true;//是否还存活

    //
    public Bomb(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //
    //减少生命值
    public void lifeDown() {//配合图片的爆炸效果
        if (life > 0) {
            life--;
        } else {
            isLive = false;
        }
    }
}
