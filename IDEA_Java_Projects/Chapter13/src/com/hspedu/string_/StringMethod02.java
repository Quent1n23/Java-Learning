package com.hspedu.string_;

/**
 * @author 丁聪
 * @version 1.0
 */
public class StringMethod02 {
    public static void main(String[] args) {
        //1. toUpperCase  转大写
        String s = "heLLo";
        System.out.println(s.toUpperCase());
        //2. toLowerCase  转小写
        System.out.println(s.toLowerCase());
        //3. concat  拼接
        String s1 = "宝玉";
        s1 = s1.concat("林黛玉").concat("薛宝钗").concat("together");
        System.out.println(s1);
        //4. replace  替换字符串中的字符
        s1 = "宝玉 and 林黛玉 林黛玉 林黛玉";
        //在s1中,将所有的 林黛玉 替换成 薛宝钗
        //如果 s1.replace 没有被接收, s1 不会改变
        String s11 = s1.replace("林黛玉", "薛宝钗");
        System.out.println(s1);
        System.out.println(s11);
        //5. split 分割字符串, 有时需要转义符
        String poem = "锄禾日当午,汗滴禾下土,谁知盘中餐,粒粒皆辛苦";
        //以 , 为标准 对poem 进行分割,返回一个数组
        String[] split = poem.split(",");
        System.out.println("这首诗的内容是");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }

        String pwd = "E:\\aaa\\bbb";
        String[] split2 = pwd.split("\\\\");//转义
        System.out.println("==========分割后==========");
        for (int i = 0; i < split2.length; i++) {
            System.out.println(split2[i]);
        }

        //6. toCharArray 转换成字符数组
        s = "happy";
        char[] chs = s.toCharArray();
        for (int i = 0; i < chs.length; i++) {
            System.out.print(chs[i] + "\t");
        }
        System.out.println();

        //7. compareTo 比较两个字符串的大小
        // 前者大 返回正数, 后者大,返回负数,相等返回0
        //长度不相等---长度值相减
        String a = "jchn";
        String b = "jack";
        System.out.println(a.compareTo(b));

        //8. format 格式化字符串
        String name = "jack";
        int age = 15;
        double score = 87.7;
        char gender = '男';
        // 占位符 %s  %d  %.2f  %c
        String info = String.format("我的姓名是%s 年龄是%d 成绩是%.2f 姓名是%c.", name, age, score, gender);
        System.out.println("info: " + info);
        String formatStr = "我的姓名是%s 年龄是%d 成绩是%.2f 姓名是%c.希望大家喜欢我!";
        String info2 = String.format(formatStr, name, age, score, gender);
        System.out.println("info2: " + info2);

    }
}
