package com.hspedu;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author 丁聪
 * @version 1.0
 */
public class HorseChessBoard {

    //定义属性
    private static int X = 6; //表示col 列
    private static int Y = 6; //row 行
    private static int[][] chessBoard = new int[Y][X]; //棋盘
    private static boolean[] visited = new boolean[X * Y]; //记录某个位置是否走过
    private static boolean finished = false; //记录马儿是否遍历完棋盘

    public static void main(String[] args) {

        int row = 2;
        int col = 2;

        long start = System.currentTimeMillis();
        traversalChessBoard(chessBoard, row - 1, col - 1, 1);
        long end = System.currentTimeMillis();
        System.out.println("遍历耗时 = " + (end - start));
        //
        for (int[] rows : chessBoard) {
            for (int step : rows) {//step 表示 该位置 是马儿应该走的第几步
                System.out.print(step + "\t");
            }
            System.out.println();
        }


    }

    //写一个方法,对ps的各个位置, 可以走的下一个位置的次数进行排序, 可能走的下一个位置  从小到大排序

    /**
     * 当前位置 下一步有八个选择, 每个选择后还有多个选择 (第 1 步 -> 第 2 步 -> 第 3 步...)
     * 当有一步走不通时, 需要回溯, 这时我们希望尽可能的先回溯步数少的选择
     * 比如 当我们已经走过一步 下一步可以走 p1,p2 这两个点
     * 而 p1 这个点 可以走 a b c d e 这五个
     * p2 这个点 可以走 a b g 这三个
     * 则我们希望优先走 p2 这个点
     *
     * @param ps
     */

    //贪心算法
    public static void sort(ArrayList<Point> ps){
        /**
         * next(o1),next(o2) 返回的结果都是 集合
         * 这里用size()方法 可以知道哪个集合中的数据少
         * 即 o1,o2这两个点 的 下一步选择 的多少
         */
        ps.sort(new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                return next(o1).size() - next(o2).size();
            }
        });
    }

    //编写最核心的算法,遍历棋盘, 如果遍历成功,就把finished 设置为 true,
    //并且,将马儿走的每一步step 记录到 chessBoard
    public static void traversalChessBoard(int[][] chessBoard, int row, int col, int step) {
        //先把step记录到chessBoard
        chessBoard[row][col] = step;
        //把这个位置,设置为已经访问
        visited[row * X + col] = true;
        //获取当前这个位置可以走的下一个位置有哪些
        ArrayList<Point> ps = next(new Point(col, row)); // col - X, row - Y
        sort(ps);
        //遍历
        while (!ps.isEmpty()) {
            //取出一个点     remove() 返回的是 对应位置的数据 这里取出了一个point
            Point p = ps.remove(0);
            //判断该位置是否走过,如果没有走过, 就递归遍历
            if (!visited[p.y * X + p.x]) {//没走过
                //递归遍历
                traversalChessBoard(chessBoard, p.y, p.x, step + 1);
            }
        }

        //退出while后,看看是否遍历成功,如果没有成功,就重置相应的值,然后进行回溯
        if (step < X * Y && !finished) {
            //重置
            chessBoard[row][col] = 0;
            visited[row * X + col] = false;
        } else {
            finished = true;
        }
    }

    //编写方法,可以获取当前位置, 可以走的 下一步的 所有位置 Point(x,y)
    public static ArrayList<Point> next(Point curPoint) {
        //创建一个ArrayList
        ArrayList<Point> ps = new ArrayList<>();

        //创建一个Point对象(点/位置),准备放入到ps
        Point p1 = new Point();

        // 判断在 curPoint 这个位置时 是否可以走下一步
        // 如果可以走,就将要走的点(位置Point) 放入到ps
        /**
         * C表示当前位置,
         * 0-7表示可以走的位置,马走日
         * .    .    .    .    .    .    .    .
         * .    .    .    .    .    .    .    .
         * .    .    .    6    .    7    .    .
         * .    .    5    .    .    .    0    .
         * .    .    .    .    C    .    .    .
         * .    .    4    .    .    .    1    .
         * .    .    .    3    .    2    .    .
         * .    .    .    .    .    .    .    .
         *ps集合中记录了 这个点 下一个位置的 全部位置  0-7可以走,就记录0-7个位置(8个)
         *
         */
        //判断是否可以走5位置
        if ((p1.x = curPoint.x - 2) >= 0 && (p1.y = curPoint.y - 1) >= 0) {
            ps.add(new Point(p1)); //这里一定要 new Point  放入新的点到集合中
        }
        //判断是否可以走6位置
        if ((p1.x = curPoint.x - 1) >= 0 && (p1.y = curPoint.y - 2) >= 0) {
            ps.add(new Point(p1));
        }
        //判断是否可以走7位置
        if ((p1.x = curPoint.x + 1) < X && (p1.y = curPoint.y - 2) >= 0) {
            ps.add(new Point(p1));
        }
        //判断是否可以走0位置
        if ((p1.x = curPoint.x + 2) < X && (p1.y = curPoint.y - 1) >= 0) {
            ps.add(new Point(p1));
        }
        //判断是否可以走1位置
        if ((p1.x = curPoint.x + 2) < X && (p1.y = curPoint.y + 1) < Y) {
            ps.add(new Point(p1));
        }
        //判断是否可以走2位置
        if ((p1.x = curPoint.x + 1) < X && (p1.y = curPoint.y + 2) < Y) {
            ps.add(new Point(p1));
        }
        //判断是否可以走3位置
        if ((p1.x = curPoint.x - 1) >= 0 && (p1.y = curPoint.y + 2) < Y) {
            ps.add(new Point(p1));
        }
        //判断是否可以走4位置
        if ((p1.x = curPoint.x - 2) >= 0 && (p1.y = curPoint.y + 1) < Y) {
            ps.add(new Point(p1));
        }

        return ps;
    }
}

