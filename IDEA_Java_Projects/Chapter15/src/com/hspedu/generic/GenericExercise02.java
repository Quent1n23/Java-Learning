package com.hspedu.generic;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author 丁聪
 * @version 1.0
 */

/**
 * 定义Employee类
 * 1) 该类包含：private成员变量name,sal,birthday，其中 birthday 为 MyDate 类的对象；
 * 2) 为每一个属性定义 getter, setter 方法；
 * 3) 重写 toString 方法输出 name, sal, birthday
 * 4) MyDate类包含: private成员变量month,day,year；并为每一个属性定义 getter, setter 方法；
 * 5) 创建该类的 3 个对象，并把这些对象放入 ArrayList 集合中（ArrayList 需使用泛型来定义），对集合中的元素进行排序，并遍历输出：
 * <p>
 * 排序方式： 调用ArrayList 的 sort 方法 ,
 * 传入 Comparator对象[使用泛型]，先按照name排序，如果name相同，则按生日日期的先后排序。【即：定制排序】
 */
@SuppressWarnings({"all"})
public class GenericExercise02 {
    public static void main(String[] args) {
        //Employee jack = new Employee("jack", 20000, new MyDate(2001, 1, 1));
        //Employee mary = new Employee("hsp", 30000, new MyDate(1980, 2, 2));
        //Employee tom = new Employee("tom", 20000, new MyDate(2003, 3, 3));

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("tom", 30000, new MyDate(1980, 10, 2)));
        employees.add(new Employee("jack", 20000, new MyDate(2001, 1, 1)));
        employees.add(new Employee("tom", 20000, new MyDate(1980, 8, 3)));

        //排序
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee emp1, Employee emp2) {
                //先按照name排序，如果name相同，则按生日日期的先后排序。【即：定制排序】
                //先对传入的参数进行验证
                if (!(emp1 instanceof Employee && emp2 instanceof Employee)){
                    return 0;//传入参数不对
                }
                //比较name
                int i = emp1.getName().compareTo(emp2.getName());
                if(i != 0){
                    return i;
                }
                //是对 birthday的比较,最好放在MyDate类
                //封装后,维护性和复用性,大大 增强
                return emp1.getBirthday().compareTo(emp2.getBirthday());
            }
        });

        System.out.println(employees);


    }
}
