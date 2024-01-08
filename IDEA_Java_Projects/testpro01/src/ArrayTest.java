import java.util.Scanner;

public class ArrayTest {
    //模板main
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //自动分配变量名，快捷键
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        MyTools mt = new MyTools();
        int[] arr = {10, -1, 8, 0, 34};
        mt.bubble(arr);
        //输出排序后的arr
        System.out.println("===排序后的arr===");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        //在idea 当run一个文件时，会先编译成.class文件 -> 运行
    }
}

//创建一个类MyTools，编写一个方法，可以完成对int数组冒泡排序的功能

class MyTools {

    public void bubble(int[] arr) {
        //冒泡排序 从小到大
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

class Person {
    String name;
    int age;
    //构造器->快捷键
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
