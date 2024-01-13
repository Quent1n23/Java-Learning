package com.hspedu.interface_;

//A程序员连接Mysql
public class MysqlDb implements DBInterface{
    @Override
    public void connect() {
        System.out.println("连接Mysql");
    }

    @Override
    public void close() {
        System.out.println("关闭Mysql");
    }
}
