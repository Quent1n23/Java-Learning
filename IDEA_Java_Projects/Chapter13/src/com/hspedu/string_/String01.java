package com.hspedu.string_;

/**
 * @author 丁聪
 * @version 1.0
 */
public class String01 {
    public static void main(String[] args) {
        //2. "jack" 是字符串常量
        //3. 字符串的 字符 使用Unicode字符编码,每个字符占两个字节
        //4. String类 有很多构造器
        //5. String类 实现了 Serializable接口, String可以串行化/序列化:可以在网络传输
        //            实现了 Comparable接口,  可以相互比较
        //6. String类 是 final类
        //7. String 有属性 private final char value[];用于存放字符串内容
        //8. value是 final类型,  不可以修改(value地址):
        //   即value不能指向新的地址,但是单个字符的内容可以变化
        String name = "jack";
        name = "tom";

        final char[] value = {'a','b','c'};
        char[] v2 = {'t','o','m'};
        value[0] = 'H';
        //value = v2; 不可以修改value的地址

    }
}
