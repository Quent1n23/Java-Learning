package com.hspedu.homework;


import java.util.TreeSet;

/**
 * @author 丁聪
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class Homework04 {
    public static void main(String[] args) {
        /**
         * 试分析HashSet和TreeSet分别如何实现去重的
         *
         * HashSet的去重机制
         * hashCode() + equals(),底层先通过存入对象,进行运算得到一个hash值,
         * 通过hash值得到对应的索引,如果发现table索引所在的位置,没有数据,就直接存放
         * 如果有数据,就进行equals比较(遍历比较),如果比较后,不相同,就加入,否则就不加入.
         *
         * TreeSet的去重机制
         * 如果传入了一个Comparator匿名对象,就使用实现的compare方法去重
         * 如果方法返回0,就认为是相同的元素/数据,就不添加
         *
         * 如果没有传入Comparator匿名对象
         * 则以添加的对象实现的Comparable接口的compareTo去重
         *
         */

        TreeSet treeSet = new TreeSet();
        treeSet.add("hsp");
        treeSet.add("tom");
        treeSet.add("king");
        treeSet.add("hsp");
        System.out.println(treeSet);
    }
}
