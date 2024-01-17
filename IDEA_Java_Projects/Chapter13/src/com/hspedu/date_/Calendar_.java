package com.hspedu.date_;

import java.util.Calendar;

//第二代日期类-----日历Calendar
/**
 * @author 丁聪
 * @version 1.0
 */
public class Calendar_ {
    public static void main(String[] args) {
        //1. Calendar是一个抽象类,并且构造器是protected
        //2. 通过 getInstance() 来获取实例
        //3. 提供了大量的方法和字段
        //4. Calendar 没有专门的格式化方法, 所以需要自己组合
        //5. 24小时制进制  Calendar.HOUR --> Calendar.HOUR_OF_DAY

        Calendar c = Calendar.getInstance();//创建日历类对象
        System.out.println("c=" +c);
        //2. 获取日历对象的某个日历字段
        System.out.println("年: " +c.get(Calendar.YEAR));
        //Calendar返回月的时候, 是 0-11 所以要+1
        System.out.println("月: " +(c.get(Calendar.MONTH)+1));
        System.out.println("日: " +c.get(Calendar.DAY_OF_MONTH));
        System.out.println("小时: " +c.get(Calendar.HOUR));
        System.out.println("分钟: " +c.get(Calendar.MINUTE));
        System.out.println("秒: " +c.get(Calendar.SECOND));
        //Calendar 没有专门的格式化方法, 所以需要自己组合

        System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"
        +c.get(Calendar.HOUR_OF_DAY) + "时");
    }
}
