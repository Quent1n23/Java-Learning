package com.hspedu.regexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author 丁聪
 * @version 1.0
 * 结巴去重案例
 */
public class RegExp13 {
    public static void main(String[] args) {
        String content = "我....我要....学学学学....编程java!";

        //1. 去掉所有的.

        Pattern pattern = Pattern.compile("\\.");
        Matcher matcher = pattern.matcher(content);
        content = matcher.replaceAll("");

        //       System.out.println("content=" + content);

        //2. 去掉重复的字  我我要学学学学编程java!
        // 思路
        //(1) 使用 (.)\\1+
        //(2) 使用 反向引用$1 来替换匹配到的内容
        // 注意：因为正则表达式变化，所以需要重置 matcher
        //pattern = Pattern.compile("(.)\\1+");
        //pattern = Pattern.compile("(.)");
        /**
         * 分组的捕获内容 即 (.) 记录到 $1
         *
         * 这里使用的 规则
         * .表示依次匹配所有字符
         * (.)      分组, 1个字符
         * \\1      反向引用分组1,1个字符
         * +        表示 1个或多个反向引用, \\1+ 最少1一个字符
         * (.)\\1+      连起来则表示 (.)捕获到1个字符, \\1+反向引用最少1个字符,  即最少2个字符
         * 所以 匹配到 我我  学学学学
         * 而          要 编 程 j a v a ! 则没有匹配到,因为他们都是1个字符
         */

//        matcher = pattern.matcher(content);
//        while (matcher.find()) {
//            System.out.println("找到=" + matcher.group(0));
//        }

        /**
         * 使用 反向引用$1 来替换匹配到的内容
         *  $1是与正则表达式中的第 1 个子表达式相匹配的文本,即分组内的内容,即(.)
         *  以此类推$2是第二个分组内的内容
         *  这里 replaceAll("$1")  使用第一个分组内的 内容 来替换 匹配的内容
         *  (.) 我  替换 (.)\\1+ 我我
         *  (.) 学  替换 (.)\\1+ 学学学学
         */

//        content = matcher.replaceAll("$1");
//        System.out.println("content=" + content);

        //3. 使用一条语句 去掉重复的字  我我要学学学学编程java!
        content = Pattern.compile("(.)\\1+").matcher(content).replaceAll("$1");

        System.out.println("content= " + content);

    }
}
