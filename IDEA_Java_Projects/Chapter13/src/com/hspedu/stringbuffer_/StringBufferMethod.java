package com.hspedu.stringbuffer_;

/**
 * @author 丁聪
 * @version 1.0
 */
public class StringBufferMethod {
    public static void main(String[] args) {

        StringBuffer s = new StringBuffer("hello");

        //增  append
        s.append(',');
        s.append("张三丰");
        s.append("赵敏").append("100").append(true).append(10.5);
        System.out.println(s);

        //删  delete
        s.delete(11,14);// 删除 [11,14)
        System.out.println(s);

        //改 replace
        //使用 周芷若 替换 索引9-11的字符 [9,11)
        s.replace(9,11,"周芷若");
        System.out.println(s);

        //查 indexOf
        //插 insert
        //在索引为9的位置 插入"赵敏", 原来索引为9的内容自动后移
        s.insert(9,"赵敏");

        //长度
        System.out.println(s.length());
    }
}
