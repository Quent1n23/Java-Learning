package tankgame4;

import javax.swing.*;

/**
 * @author 丁聪
 * @version 1.0
 */
public class TankGame4 extends JFrame {
    MyPanel mp = null;

    public static void main(String[] args) {

        TankGame4 tankGame4 = new TankGame4();
    }

    public TankGame4(){
        mp = new MyPanel();
        //启动mp的线程
        new Thread(mp).start();
        this.add(mp);
        this.setSize(1600,900);
        this.addKeyListener(mp);// 画板mp传入监听器
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
