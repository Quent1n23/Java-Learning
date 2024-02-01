package com.hspedu.tankgame5;

import java.io.*;
import java.util.Vector;

/**
 * @author 丁聪
 * @version 1.0
 * 用于记录相关信息 和 文件交互
 */
public class Recorder {
    //定义变量,记录我方击毁敌人坦克数量
    private static int allEnemyTankNum = 0;
    //定义IO对象, 准备写数据到文件中
    private static BufferedReader br = null;
    private static BufferedWriter bw = null;
    private static String recordFile = "e:\\myRecord.txt";
    //定义Vector, 指向 MyPanel对象的 敌人坦克 的 Vector
    private static Vector<EnemyTank> enemyTanks = null;
    //定义一个Node的Vector,用于保存敌人的信息node
    private static Vector<Node> nodes = new Vector<>();

    public static void setEnemyTanks(Vector<EnemyTank> enemyTanks) {
        Recorder.enemyTanks = enemyTanks;
    }

    //读取 文件,恢复相关信息
    //该方法 在继续上局的时候 调用 即可
    public static Vector<Node> getNodesAndEnemyTankRec() {
        try {
            br = new BufferedReader(new FileReader(recordFile));
            allEnemyTankNum = Integer.parseInt(br.readLine());
            //循环读取文件,生成nodes集合
            String line = "";
            while ((line = br.readLine()) != null) {
                String[] xyd = line.split(" ");
                Node node = new Node(Integer.parseInt(xyd[0]), Integer.parseInt(xyd[1]), Integer.parseInt(xyd[2]));
                nodes.add(node);//放入到nodes(Vector)

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


        return nodes;
    }


    //增加一个方法,当游戏退出时,保存数据
    public static void keepRecord() {
        try {
            bw = new BufferedWriter(new FileWriter(recordFile));
            //保存击毁敌人的数量
            bw.write(allEnemyTankNum + "\r\n");
            //保存敌人坦克的坐标和方向
            //遍历敌人坦克的Vector,根据情况保存
            //OOP,定义一个属性,通过setXxx 得到敌人坦克的Vector
            for (int i = 0; i < enemyTanks.size(); i++) {
                //取出敌人坦克
                EnemyTank enemyTank = enemyTanks.get(i);
                if (enemyTank.isLive) {//建议判断一下
                    //保存该enemyTank信息
                    String record = enemyTank.getX() + " " + enemyTank.getY() + " " + enemyTank.getDirect();
                    //写入到文件
                    bw.write(record + "\r\n");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static int getAllEnemyTankNum() {
        return allEnemyTankNum;
    }

    public static void setAllEnemyTankNum(int allEnemyTankNum) {
        Recorder.allEnemyTankNum = allEnemyTankNum;
    }

    //当我方坦克击毁一个敌方坦克,allEnemyTankNum++
    public static void addAllEnemyTankNum() {
        Recorder.allEnemyTankNum++;
    }
}
