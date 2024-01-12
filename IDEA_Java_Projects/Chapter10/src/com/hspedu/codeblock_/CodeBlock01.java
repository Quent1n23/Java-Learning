package com.hspedu.codeblock_;
//代码块
//相当于另一种形式的构造器, 是对构造器的一种补充
public class CodeBlock01 {
    public static void main(String[] args) {
        Movie movie = new Movie("ironman");
        //代码块的调用 优先于 构造器
        Movie movie1 = new Movie("唐探", "陈思成", 100);
    }
}
class Movie {
    private String name;
    private String director;
    private double price;

    //不管调用哪个构造器,创建对象,都会先调用代码块
    {
        System.out.println("屏幕打开...");
        System.out.println("广告开始...");
        System.out.println("电影开始...");
    };

    //3个构造器->重载
    public Movie(String name) {
        System.out.println("Movie(String name)");
        this.name = name;
    }

    public Movie(String name, double price) {
        System.out.println("Movie(String name, double price)");
        this.name = name;
        this.price = price;
    }

    public Movie(String name, String director, double price) {
        System.out.println("Movie(String name, String director, double price)");
        this.name = name;
        this.director = director;
        this.price = price;
    }
}
