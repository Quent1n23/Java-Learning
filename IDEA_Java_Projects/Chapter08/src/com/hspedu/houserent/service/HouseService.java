package com.hspedu.houserent.service;

import com.hspedu.houserent.domain.House;

public class HouseService {

    private House[] houses;//保存House对象
    private int houseNums = 1;//记录当前有多少个房屋信息
    private int idCounter = 1;//记录当前的id增长到哪个值
    //构造器
    public HouseService(int size) {
        houses = new House[size];//当创建HouseService对象,指定数组大小
        //为了配合测试列表信息,这里初始化一个House对象
        houses[0] = new House(1,"jack","112","海淀区",2000,"未出租");
    }

    //list方法,返回houses
    public House[] list() {
        return houses;
    }

    //add方法,添加新对象
    public boolean add(House newHouse){
        //判断是否还可以继续添加(暂时不考虑扩容)
        if(houseNums == houses.length){//满了
            System.out.println("数组已满,不能再添加");
            return false;
        }
        houses[houseNums++] = newHouse;
        //houseNums++;
        //设计一个id自增长机制
        //idCounter++;
        newHouse.setId(++idCounter);
        return true;
    }

    //del,删除一个房屋信息
    public boolean del(int delId) {
        //先找到 要删除的房屋 对应的下标
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if(delId == houses[i].getId()){
                index = i;
            }
        }
        if(index == -1){//说明delId在数组中不存在
            return false;
        }
        //如果找到,怎么删除
        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i+1];
        }
//        houses[houseNums-1] = null;
//        houseNums--;
        houses[--houseNums] = null;
        return true;
    }

    //find
    public House findById(int findId){
        //遍历数组
        for (int i = 0; i < houseNums; i++) {
            if(findId == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }


}
