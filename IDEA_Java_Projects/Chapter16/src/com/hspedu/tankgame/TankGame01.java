package com.hspedu.tankgame;

import javax.swing.*;

/**
 * @author 丁聪
 * @version 1.0
 */
public class TankGame01 extends JFrame {

    //定义 MyPanel
    MyPanel mp = null;
    public static void main(String[] args) {
        TankGame01 tankGame01 = new TankGame01();

    }

    public TankGame01(){
        mp = new MyPanel();
        this.add(mp);//把面板(就是游戏的绘图区域)
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
