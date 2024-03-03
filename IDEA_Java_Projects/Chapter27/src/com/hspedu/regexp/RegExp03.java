package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 丁聪
 * @version 1.0
 * //演示字符匹配符的使用
 */
public class RegExp03 {
    public static void main(String[] args) {
        String content = "a11c8abcABC aBcyY_@#$%^&*()";
        //String regStr = "[a-z]";  //匹配 a-z 之间任意一个字符
        //String regStr = "[A-Z]";  //匹配 A-Z 之间任意一个字符
        //String regStr = "abc";    //匹配 abc 字符串(默认区分大小写)
        //String regStr = "(?i)abc"; //匹配 abc 字符串( 不区分大小写)
        //String regStr = "a(?i)bc"; //匹配 abc 字符串( bc不区分大小写)
        //String regStr = "a((?i)b)c"; //匹配 abc 字符串( b不区分大小写)
        //String regStr = "[0-9]";      //匹配 0-9 之间任意一个字符
        //String regStr = "[^a-z]";     //匹配 不在 a-z 之间任意一个字符
        //String regStr = "[^a-z]{2}";  //匹配 不在 a-z 之间任意一个字符 {2}  连续2个
        //String regStr = "[^0-9]";     //匹配 不在 0-9 之间任意一个字符
        //String regStr = "\\D";    //匹配 不在 0-9 之间任意一个字符
        //String regStr = "[abcd]"; //匹配 abcd 中任意一个字符
        //String regStr = "\\w";    //匹配 任意 英文字符 数字 下划线
        //String regStr = "\\W";    //匹配 [^a-zA-Z0-9_]   与 \\w 相反
        //String regStr = "\\s";      //匹配 任何 空白字符(空格,制表符等)
        //String regStr = "\\S";      //匹配 任何 非空白字符
        String regStr = ".";      //匹配 除\n 之外所有字符  \\. 匹配.




        Pattern pattern = Pattern.compile(regStr);
        // 匹配时不区分字母大小写 ----  CASE_INSENSITIVE
        //Pattern pattern = Pattern.compile(regStr,Pattern.CASE_INSENSITIVE);

        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            System.out.println("找到 " + matcher.group(0));
        }
    }
}
