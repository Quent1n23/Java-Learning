package com.hspedu.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author 丁聪
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class MapExercise {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1, new Employee(1, "jack", 15000));
        map.put(2, new Employee(2, "mary", 18000));
        map.put(3, new Employee(3, "tom", 20000));

        //遍历
        //1. 通过 Key遍历
        Set keySet = map.keySet();
        for (Object key : keySet) {
            Employee emp = (Employee) map.get(key);
            if (emp.getSal() > 18000) {
                System.out.println(key + "-" + map.get(key));
            }
        }
        // 迭代器
        Iterator iterator1 = keySet.iterator();
        while (iterator1.hasNext()) {
            Object key = iterator1.next();
            Employee emp = (Employee) map.get(key);
            if (emp.getSal() > 18000) {
                System.out.println(emp);
            }
        }

        //2. entrySet
        System.out.println("===========================");
        Set entrySet = map.entrySet();
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator2.next();
            //通过entry取得k-y
            Employee emp = (Employee)entry.getValue();
            if (emp.getSal() > 18000) {
                System.out.println(emp);
            }
        }


    }
}

class Employee {
    private int id;
    private String name;
    private double sal;

    public Employee(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}
