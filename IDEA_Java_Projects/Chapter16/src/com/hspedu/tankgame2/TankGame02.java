package com.hspedu.tankgame2;


import javax.swing.*;
import java.awt.event.KeyListener;

/**
 * @author 丁聪
 * @version 1.0
 */
public class TankGame02 extends JFrame {

    //定义 MyPanel
    MyPanel mp = null;
    public static void main(String[] args) {
        TankGame02 tankGame01 = new TankGame02();

    }

    public TankGame02(){
        mp = new MyPanel();
        this.add(mp);//把面板(就是游戏的绘图区域)
        this.setSize(1000,750);
        this.addKeyListener(mp);//让JFrame监听键盘事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
