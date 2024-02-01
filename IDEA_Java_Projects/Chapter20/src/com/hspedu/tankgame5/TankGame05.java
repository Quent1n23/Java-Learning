package com.hspedu.tankgame5;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

/**
 * @author 丁聪
 * @version 1.0
 */
public class TankGame05 extends JFrame {

    MyPanel mp = null;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        TankGame05 tankGame05 = new TankGame05();
    }

    public TankGame05(){
        System.out.println("请输入选择1: 新游戏 2:继续上局");
        String key = scanner.next();
        mp = new MyPanel(key);
        //启动mp的线程
        new Thread(mp).start();
        this.add(mp);
        this.setSize(1600,900);
        this.addKeyListener(mp);// 画板mp传入监听器
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        //在JFrame中 增加响应关闭窗口的处理
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                Recorder.keepRecord();
                System.exit(0);
            }
        });

    }

}
