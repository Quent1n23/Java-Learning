package com.hspedu.encap;
//封装

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
//        person.name = "jack";
//        person.age = 3000; 私有化，不能直接赋值
        person.setName("jack");
        person.setAge(30);
        person.setSalary(30000);
        System.out.println(person.info());
        System.out.println(person.getSalary());

        Person smith = new Person("smith", 80, 50000);
        System.out.println("=====smith的信息=====");
        System.out.println(smith.info());


    }
}
class Person {
    //封装第一步：私有化属性
    //封装第二步：setXxx
    //封装第三步：getXxx
    public String name;//名字公开  长度2-6
    private int age; //年龄 私有  1-120
    private double salary;//薪水 私有，工资不能直接查看
    //构造器
    public Person() {
    }
    //三个属性构造器
    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        //可以将set方法写在构造器中，这样就可以验证
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        //加入对数据的校验
        if(name.length() >= 2 && name.length() <= 6){
            this.name = name;
        } else {
            System.out.println("名字长度不对，需要2-6字符，给默认名字");
            this.name = "无名人";
        }

    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        //判断
        if(age >= 1 && age <=120){//如果是合理范围
            this.age = age;
        } else {
            System.out.println("设置的年龄不对，需要在 1-120，给默认年龄18");
            this.age = 18;//给一个默认年龄
        }

    }

    public double getSalary() {
        //这里可以增加对当前对象的权限判断
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    //写一个方法，返回属性信息
    public String info() {
        return "信息为 name=" + name + " age=" + age + " salary=" + salary;
    }
}
