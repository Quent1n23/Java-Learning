package com.hspedu.date_;
//第三代日期

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author 丁聪
 * @version 1.0
 */
public class LocalDate_ {
    public static void main(String[] args) {

        //1. now() 返回当前日期时间的 对象
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        //2. DateTimeFormatter 格式日期类
        //创建DateTimeFormatter对象
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        String format = dateTimeFormatter.format(ldt);
        System.out.println("格式化的日期=" + format);

        System.out.println("年=" + ldt.getYear());
        System.out.println("月=" + ldt.getMonth());//英文
        System.out.println("月=" + ldt.getMonthValue());//数字
        System.out.println("日=" + ldt.getDayOfMonth());
        System.out.println("时=" + ldt.getHour());
        System.out.println("分=" + ldt.getMinute());
        System.out.println("秒=" + ldt.getSecond());

        LocalDate now = LocalDate.now();//年 月 日
        LocalTime now1 = LocalTime.now();//时 分 秒


        //提供 plus 和 minus方法  可以对当前时间 进行 加减
        //890天后
        LocalDateTime localDateTime = ldt.plusDays(890);
        System.out.println("890天后是: " + dateTimeFormatter.format(localDateTime));

        //3456分钟前
        LocalDateTime localDateTime1 = ldt.minusMinutes(3456);
        System.out.println("3456分钟前" + dateTimeFormatter.format(localDateTime1));
    }
}
