package com.hspedu.tankgame6;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.Vector;

/**
 * @author 丁聪
 * @version 1.0
 */

//
//画板 继承 JPanel
//想要 监听键盘事件 , 需要实现 KeyListener
//为了让Panel不停地重绘子弹,需要将MyPanel 实现 Runnable,当作一个线程使用
public class MyPanel extends JPanel implements KeyListener, Runnable {
    //定义我方坦克
    Hero hero = null;

    //定义敌方坦克(3个),放入到Vector中
    Vector<EnemyTank> enemyTanks = new Vector<>();
    int enemyTankSize = 3;

    //定义一个存放Node对象的Vector,用于恢复敌人坦克的坐标和方向
    Vector<Node> nodes = new Vector<>();

    //定义炸弹,放入到Vector中
    // 当子弹击中坦克时, 加入一个Bomb对象到bombs
    Vector<Bomb> bombs = new Vector<>();
    //定义三张炸弹图片,用于显示爆炸效果
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;

    //初始化
    public MyPanel(String key) {
        //判断记录文件是否存在
        //存在:正常执行       不存在:提示,并把key=1
        File file = new File(Recorder.getRecordFile());
        if (file.exists()) {
            nodes = Recorder.getNodesAndEnemyTankRec();
        } else {
            System.out.println("文件不存在,只能开启新游戏");
            key = "1";
        }

        //将MyPanel对象的 enemyTanks 设置给  Recorder 的 enemyTanks
        Recorder.setEnemyTanks(enemyTanks);
        //初始化自己坦克
        hero = new Hero(500, 100);

        switch (key) {
            case "1"://新游戏
                //初始化敌方坦克
                for (int i = 0; i < enemyTankSize; i++) {
                    EnemyTank enemyTank = new EnemyTank(100 * (i + 1), 0);//创建一个坦克
                    //把 enemyTanks这个集合 设置给 enemyTank
                    //EnemyTank类中 有一个set方法,setEnemyTanks
                    // 这样 通过循环,每次创建的新的enemyTank, 就会有一个属性 enemyTanks
                    enemyTank.setEnemyTanks(enemyTanks);
                    //设置方向
                    enemyTank.setDirect(2);
                    //启动敌人坦克线程,让他动起来
                    new Thread(enemyTank).start();
                    //给enemyTank加入一颗子弹
                    Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());
                    //把子弹shot加入到shots-------Vector<Shot> shots = new Vector<>();
                    enemyTank.shots.add(shot);
                    //启动shot对象
                    new Thread(shot).start();
                    enemyTanks.add(enemyTank);//把坦克加入到Vector集合中
                }
                break;
            case "2"://继续上局游戏
                //初始化敌方坦克
                for (int i = 0; i < nodes.size(); i++) {
                    Node node = nodes.get(i);
                    EnemyTank enemyTank = new EnemyTank(node.getX(), node.getY());//创建一个坦克(老坦克的位置)
                    //把 enemyTanks这个集合 设置给 enemyTank
                    //EnemyTank类中 有一个set方法,setEnemyTanks
                    // 这样 通过循环,每次创建的新的enemyTank, 就会有一个属性 enemyTanks
                    enemyTank.setEnemyTanks(enemyTanks);
                    //设置方向
                    enemyTank.setDirect(node.getDirect());
                    //启动敌人坦克线程,让他动起来
                    new Thread(enemyTank).start();
                    //给enemyTank加入一颗子弹
                    Shot shot = new Shot(enemyTank.getX() + 20, enemyTank.getY() + 60, enemyTank.getDirect());
                    //把子弹shot加入到shots-------Vector<Shot> shots = new Vector<>();
                    enemyTank.shots.add(shot);
                    //启动shot对象
                    new Thread(shot).start();
                    enemyTanks.add(enemyTank);//把坦克加入到Vector集合中
                }
                break;
            default:
                System.out.println("你的输入有误");

        }


        //初始化图片对象
        image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_1.gif"));
        image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_2.gif"));
        image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_3.gif"));

        //这里播放指定的音乐
        new AePlayWave("src\\111.wav").start();

    }

    //编写方法,显示我方击毁敌方坦克的信息
    public void showInfo(Graphics g) {
        //画出玩家的总成绩
        g.setColor(Color.BLACK);
        Font font = new Font("宋体", Font.BOLD, 25);
        g.setFont(font);

        g.drawString("您累计击毁敌方坦克", 1020, 30);
        drawTank(1020, 60, g, 0, 0);//画出一个敌方坦克
        g.setColor(Color.BLACK);//这里需要重新设置颜色,因为调用drawTank(1020,60,g,0,0)时,颜色改变了
        g.drawString(Recorder.getAllEnemyTankNum() + "", 1080, 100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //画板背景
        g.fillRect(0, 0, 1000, 750);
        showInfo(g);

        //画出 我方坦克
        if (hero != null && hero.isLive) {
            drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 1);
        }
        //画出 hero射击的子弹
//        if (hero.shot != null && hero.shot.isLive == true) {
//            System.out.println("子弹被绘制");
//            g.draw3DRect(hero.shot.x, hero.shot.y, 1, 1, false);
//        }
        //将hero的子弹集合shots,遍历取出绘制
        for (int i = 0; i < hero.shots.size(); i++) {
            Shot shot = hero.shots.get(i);
            if (shot != null && shot.isLive) {
                g.draw3DRect(shot.x, shot.y, 1, 1, false);
            } else {//如果该shot对象已经无效,就从shots集合中拿掉
                hero.shots.remove(shot);
            }
        }

        //如果bombs集合中 有对象,就画出来
        for (int i = 0; i < bombs.size(); i++) {
            //取出炸弹
            Bomb bomb = bombs.get(i);
            //根据当前这个bomb对象的life值 去画 相应的图片
            if (bomb.life > 6) {
                g.drawImage(image1, bomb.x, bomb.y, 60, 60, this);
            } else if (bomb.life > 3) {
                g.drawImage(image2, bomb.x, bomb.y, 60, 60, this);
            } else {
                g.drawImage(image3, bomb.x, bomb.y, 60, 60, this);
            }
            //让炸弹的生命值减少
            bomb.lifeDown();
            //bomb life 为0,就从集合中删除
            if (bomb.life == 0) {
                bombs.remove(bomb);
            }
        }

        //画出 敌方坦克
        for (int i = 0; i < enemyTanks.size(); i++) {
            //从集合中取出坦克,赋给EnemyTank enemyTank
            EnemyTank enemyTank = enemyTanks.get(i);
            //判断当前坦克是否存活
            if (enemyTank.isLive) {//敌方坦克是存活的,可以画出
                //画出来
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirect(), 0);
                //画出 enemyTank所有子弹
                for (int j = 0; j < enemyTank.shots.size(); j++) {
                    //取出子弹
                    Shot shot = enemyTank.shots.get(j);
                    //shot.setSpeed(5);
                    //绘制子弹
                    if (shot.isLive) {//子弹还存活
                        g.draw3DRect(shot.x, shot.y, 1, 1, false);
                    } else {
                        //子弹已经死亡,需要移除
                        enemyTank.shots.remove(shot);
                    }
                }
            }

        }
    }

    //画坦克的方法

    /**
     * @param x      坦克的左上角x坐标
     * @param y      坦克的左上角y坐标
     * @param g      画笔
     * @param direct 坦克方向（上下左右）
     * @param type   坦克类型
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {
        //根据不同类型,用不同颜色
        switch (type) {
            case 0://敌人坦克
                g.setColor(Color.cyan);
                break;
            case 1://我方坦克
                g.setColor(Color.yellow);
                break;
        }
        //根据不同方向,画坦克
        //direct 表示方向(0: 向上 1 向右 2 向下 3 向左 )
        switch (direct) {
            case 0: //表示向上
                g.fill3DRect(x, y, 10, 60, false);//画出坦克左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//画出坦克右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出坦克盖子
                g.fillOval(x + 10, y + 20, 20, 20);//画出圆形盖子
                g.drawLine(x + 20, y + 30, x + 20, y);//画出炮筒
                break;
            case 1: //表示向右
                g.fill3DRect(x, y, 60, 10, false);//画出坦克上边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克下边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);//画出圆形盖子
                g.drawLine(x + 30, y + 20, x + 60, y + 20);//画出炮筒
                break;
            case 2: //表示向下
                g.fill3DRect(x, y, 10, 60, false);//画出坦克左边轮子
                g.fill3DRect(x + 30, y, 10, 60, false);//画出坦克右边轮子
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//画出坦克盖子
                g.fillOval(x + 10, y + 20, 20, 20);//画出圆形盖子
                g.drawLine(x + 20, y + 30, x + 20, y + 60);//画出炮筒
                break;
            case 3: //表示向左
                g.fill3DRect(x, y, 60, 10, false);//画出坦克上边轮子
                g.fill3DRect(x, y + 30, 60, 10, false);//画出坦克下边轮子
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//画出坦克盖子
                g.fillOval(x + 20, y + 10, 20, 20);//画出圆形盖子
                g.drawLine(x + 30, y + 20, x, y + 20);//画出炮筒
                break;
            default:
                System.out.println("暂时没有处理");
        }
    }

    //编写方法,判断我方的子弹是否击中敌人坦克
    //什么时候判断?
    public void hitTank(Shot s, Tank tank) {
        //判断s击中坦克
        switch (tank.getDirect()) {
            case 0://坦克方向:上 下
            case 2://子弹s 进入敌方坦克区域
                if (s.x > tank.getX() && s.x < tank.getX() + 40
                        && s.y > tank.getY() && s.y < tank.getY() + 60) {
                    s.isLive = false;
                    tank.isLive = false;
                    //当我方子弹击中敌方坦克后,将敌方坦克从集合中移除
                    enemyTanks.remove(tank);
                    //我方击毁一个敌人坦克,就  allEnemyTankNum++
                    if (tank instanceof EnemyTank) {
                        Recorder.addAllEnemyTankNum();
                    }
                    //创建Bomb对象,加入到bombs集合
                    Bomb bomb = new Bomb(tank.getX(), tank.getY());
                    bombs.add(bomb);
                }
                break;
            case 1:
            case 3://坦克方向 左右
                if (s.x > tank.getX() && s.x < tank.getX() + 60
                        && s.y > tank.getY() && s.y < tank.getY() + 40) {
                    s.isLive = false;
                    tank.isLive = false;
                    //当我方子弹击中敌方坦克后,将敌方坦克从集合中移除
                    enemyTanks.remove(tank);
                    //我方击毁一个敌人坦克,就  allEnemyTankNum++
                    if (tank instanceof EnemyTank) {
                        Recorder.addAllEnemyTankNum();
                    }
                    //创建Bomb对象,加入到bombs集合
                    Bomb bomb = new Bomb(tank.getX(), tank.getY());
                    bombs.add(bomb);
                }
                break;
        }
    }

    //如果我们的坦克可以发射多个子弹
    //在判断我方子弹是否击中敌人坦克时，就需要把我们的子弹集合中
    //所有的子弹，都取出和敌人的所有坦克，进行判断
    public void hitEnemyTank() {
        //取出所有子弹
        for (int j = 0; j < hero.shots.size(); j++) {
            Shot shot = hero.shots.get(j);
            //判断是否击中了敌人坦克
            if (shot != null && shot.isLive) {//我方子弹存活
                //遍历敌人所有坦克
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    hitTank(shot, enemyTank);
                }
            }
        }
    }

    //编写方法,判断敌人坦克是否击中我方坦克
    public void hitHero() {
        //遍历所有的敌人坦克
        for (int i = 0; i < enemyTanks.size(); i++) {
            //取出敌人坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            //遍历enemyTank对象 的所有子弹
            for (int j = 0; j < enemyTank.shots.size(); j++) {
                //取出子弹
                Shot shot = enemyTank.shots.get(j);
                //判断shot是否击中我的坦克
                if (hero.isLive && shot.isLive) {
                    hitTank(shot, hero);
                }
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println(e.getKeyCode());
        //改变坦克方向 + 修改坦克坐标(移动)
        if (e.getKeyCode() == KeyEvent.VK_W) {//W   上
            hero.setDirect(0);
            hero.moveUP();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {//D    右
            hero.setDirect(1);
            hero.moveRIGHT();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {//S    下
            hero.setDirect(2);
            hero.moveDOWN();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {//A    左
            hero.setDirect(3);
            hero.moveLEFT();
        }
        //用户按下J,发射子弹
        if (e.getKeyCode() == KeyEvent.VK_J) {//J    发射子弹
            //发射一颗子弹
            //判断hero的字段是否被销毁
//            if (hero.shot == null || !hero.shot.isLive) {
//                System.out.println("用户按下J,射击子弹...");
//                hero.shotEnemyTank();
//            }
            //发射多颗子弹
            System.out.println("用户按下J,射击子弹...");
            hero.shotEnemyTank();

        }
        //重绘画板
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {//每隔100ms,重绘
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //判断我方是否击中了敌方坦克
            hitEnemyTank();
            //判断敌方是否击中了我方坦克
            hitHero();
            //重绘
            this.repaint();
        }
    }


}
