package com.hspedu.homework.homework13;

public class Homework13 {
    public static void main(String[] args) {
        Student student = new Student("小明", '男', 15, "00023102");
        student.printInfo();

        System.out.println("================================================");
        Teacher teacher = new Teacher("张飞", '男', 30, 5);
        teacher.printInfo();

        //多态数组
        Person[] persons = new Person[4];
        persons[0] = new Student("jack", '男', 10, "0001");
        persons[1] = new Student("mary", '女', 20, "0002");
        persons[2] = new Teacher("smith", '男', 36, 5);
        persons[3] = new Teacher("scott", '女', 26, 1);

        Homework13 homework = new Homework13();
        homework.bubbleSort(persons);
//        new Homework13().bubbleSort(persons);
        for (int i = 0; i < persons.length; i++) {
            System.out.println(persons[i].toString());
        }

        //调用test
        System.out.println("================================");
        for (int i = 0; i < persons.length; i++) {//遍历多态数组
            homework.test(persons[i]);
        }

    }









    //方法,形参为 Person
    //功能:调用 学生的 study() 或 老师的 teach()
    public void test(Person p) {
        if (p instanceof Student) {
            ((Student) p).study();
        } else if (p instanceof Teacher) {
            ((Teacher) p).teach();
        } else {
            System.out.println("do nothing");
        }
    }


    //方法,完成年龄 从高到底排序
    public void bubbleSort(Person[] persons) {
        Person temp = null;
        for (int i = 0; i < persons.length - 1; i++) {
            for (int j = 0; j < persons.length - 1 - i; j++) {
                if (persons[j].getAge() < persons[j + 1].getAge()) {
                    temp = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp;
                }
            }
        }
    }
}
