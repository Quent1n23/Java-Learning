package com.hspedu.date_;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//第一代日期类 Date

/**
 * @author 丁聪
 * @version 1.0
 */
public class Date01 {
    public static void main(String[] args) throws ParseException {

        //1. Date类 是在 java.util 包下
        //2. 获取当前系统时间
        //3. 默认格式是国外方式,通常需要对格式进行转换
        Date d1 = new Date();
        System.out.println("当前日期=" + d1);

        Date d2 = new Date(9234567);//通过指定毫秒数得到时间
        System.out.println("d2=" + d2);//获取某个时间对应的毫秒数


        //1. 创建 SimpleDateFormat 对象, 可以指定相应的格式
        //2. 不能乱写
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E" );
        String format = sdf.format(d1);//format 将日期转换成指定格式的字符串
        System.out.println("当前日期=" +format);

        //1. 可以把一个 格式化的 String 转换成对应的 Date
        //2. 得到的 Date仍然是国外格式
        //3. String -> Date时, 使用的 sdf格式 需要和 String格式 一样,否则会抛出异常
        String s = "1996年01月01日 10:20:30 星期一";
        Date parse = sdf.parse(s);
        System.out.println("parse=" + parse);
        System.out.println("parse=" + sdf.format(parse));

    }
}
