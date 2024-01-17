package com.hspedu.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author 丁聪
 * @version 1.0
 */
public class ArrayExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("红楼梦",100);
        books[1] = new Book("金瓶梅新",90);
        books[2] = new Book("青年文摘20",5);
        books[3] = new Book("Java从入门到放弃",300);

        //按price 从小到大
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book o11 = (Book) o1;
                Book o22 = (Book) o2;
                return o11.getPrice() - o22.getPrice();
            }
        });
        System.out.println("===price从小到大===");
        System.out.println(Arrays.toString(books));

        //按price 从大到小
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book o11 = (Book) o1;
                Book o22 = (Book) o2;
                return o22.getPrice() - o11.getPrice();
            }
        });
        System.out.println("===price从大到小===");
        System.out.println(Arrays.toString(books));

        //按书名长度
        Arrays.sort(books, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Book o11 = (Book) o1;
                Book o22 = (Book) o2;
                return o11.getName().length() - o22.getName().length();
            }
        });
        System.out.println("===按书名长度短到长===");
        System.out.println(Arrays.toString(books));

    }
}
class Book {
    private String name;
    private int price;

    public Book(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " " + price ;
    }
}