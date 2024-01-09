package com.hspedu.poly_.detail_;

public class PolyDetail03 {
    public static void main(String[] args) {
        BB bb = new BB();
        //instanceof 判断对象的 运行类型 是否 为XX类型 或 XX类型的子类型
        System.out.println(bb instanceof BB);//true
        System.out.println(bb instanceof AA);//true

        AA aa = new BB();//aa 编译类型AA，运行类型BB
        System.out.println(aa instanceof AA);//true
        System.out.println(aa instanceof BB);//true

        Object obj = new Object();
        System.out.println(obj instanceof AA);//false
        String str = "hello";
        System.out.println(str instanceof Object);//true

    }
}
class AA {}
class BB extends AA {}
