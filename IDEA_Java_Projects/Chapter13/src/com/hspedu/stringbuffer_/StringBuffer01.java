package com.hspedu.stringbuffer_;

/**
 * @author 丁聪
 * @version 1.0
 */
public class StringBuffer01 {
    public static void main(String[] args) {
        //1. StringBuffer 的 直接父类是 AbstractStringBuffer
        //2. StringBuffer 实现了 Serializable, 即StringBuffer的对象 可串行化
        //3. 在父类中AbstractStringBuffer 有属性 char[] value, 不是final
        // 该value数组 存放 字符串内容,因此 存放在堆中
        //4. StringBuffer 是 final类, 不能被继承
        //5. 因为StringBuffer 字符内容是存在 char[] value,
        //所以在变化(增加/删除)时,不用每次都更换地址(即 不是每次都创建新对象)
        //效率高于String
        //StringBuffer 存放的是字符串变量
        StringBuffer hello = new StringBuffer("hello");
    }
}
