package com.hspedu.Object_;

public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        /**
         * == ,若是引用数据类型作比较
         * 比较的是 地址
         */
        System.out.println(a == c);//T
        System.out.println(b == c);//T
        B bObj = a;
        System.out.println(bObj == c);//T

        int num1 = 10;
        double num2 = 10.0;
        System.out.println(num1 == num2);

        //equals 方法,源码怎么看
        "hello".equals("abc");
        /**
         * "hello" 作为 String类的 对象，调用了String类 重写 后的 equals()方法
         * this == anObject :
         * this就是"hello", 因为是 "hello" 调用的
         * anObject 是 "abc" , 因为是 参数
         * == 比较的是地址， 地址相同，就是 一个对象的 不同引用
         */
//        String类中的 equals() 重写了 Object类中的 equals()

//        public boolean equals(Object anObject) {
//            if (this == anObject) {
//                return true;
//            }
//            if (anObject instanceof String) {
//                String anotherString = (String)anObject;
//                int n = value.length;
//                if (n == anotherString.value.length) {
//                    char v1[] = value;
//                    char v2[] = anotherString.value;
//                    int i = 0;
//                    while (n-- != 0) {
//                        if (v1[i] != v2[i])
//                            return false;
//                        i++;
//                    }
//                    return true;
//                }
//            }
//            return false;
//        }

        Integer integer1 = new Integer(1000);
        Integer integer2 = new Integer(1000);
        System.out.println(integer1 == integer2);//F 判断地址
        System.out.println(integer1.equals(integer2));//T 判断值

        String str1 = new String("hspedu");
        String str2 = new String("hspedu");
        System.out.println(str1 == str2);//判断地址 F
        System.out.println(str1.equals(str2));//判断值 T




    }
}
class B { }
class A extends B{ }



