package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author 丁聪
 * @version 1.0
 */
public class Collection_ {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        //1. 集合主要是两组(单列集合 , 双列集合)
        //2. Collection接口 有两个重要的子接口 List,Set 他们的实现子类都是单列集合
        //3. Map接口 的实现子类 是 双列集合 存放的 K-V  key-value 键值对
        //4.
        ArrayList arrayList = new ArrayList();
        arrayList.add("jack");
        arrayList.add("tom");//单列数据

        HashMap hashMap = new HashMap();
        hashMap.put("NO1","北京");
        hashMap.put("NO2","上海");//双列数据
    }
}
