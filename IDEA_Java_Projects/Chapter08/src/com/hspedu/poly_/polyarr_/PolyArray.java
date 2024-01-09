package com.hspedu.poly_.polyarr_;

public class PolyArray {
    public static void main(String[] args) {
        //应用实例：
        //要求创建1个Person对象、2个Student对象、2个Teacher对象
        //统一放在数组中，并调用 每个对象 say()方法
        Person[] persons = new Person[5];
        persons[0] = new Person("jack",20);
        persons[1] = new Student("tom",18,100);
        persons[2] = new Student("smith",19,30.1);
        persons[3] = new Teacher("scott",30,20000);
        persons[4] = new Teacher("king",50,25000);

        //循环遍历多态数组,调用 say()
        for (int i = 0; i < persons.length; i++) {
            //person[i]编译类型 是 Person
            //运行类型 根据实际情况由JVM来判断
            System.out.println(persons[i].say());//动态绑定机制
            if(persons[i] instanceof Student) {//判断persons[i] 的运行类型 是不是Student
                ((Student)persons[i]).study();//向下转型
            } else if(persons[i] instanceof Teacher) {
                ((Teacher)persons[i]).teach();//向下转型
            } else if(persons[i] instanceof Person) {
//                System.out.println("你的类型有误，请自己检查...");
            } else {
                System.out.println("你的类型有误，请自己检查...");
            }
        }
    }
}
