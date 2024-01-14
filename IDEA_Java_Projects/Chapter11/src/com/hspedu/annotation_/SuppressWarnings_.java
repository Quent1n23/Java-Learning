package com.hspedu.annotation_;


import java.util.ArrayList;
import java.util.List;

/**
 * @author 丁聪
 * @version 1.0
 */
public class SuppressWarnings_ {

    //1. 不希望看到这些警告, 可以使用SuppressWarnings注解来抑制警告信息
    //2. 在{""}中,写入 希望抑制哪些信息
    //3. 作用范围 和 放置的位置 有关
    @SuppressWarnings({"rawtypes","unchecked"})//"all"
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        int i;
        System.out.println(list.get(1));
    }
}
