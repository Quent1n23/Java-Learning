package com.hspedu.map_;

import java.util.*;

/**
 * @author 丁聪
 * @version 1.0
 */
@SuppressWarnings({"all"})
public class MapFor {
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("邓超", "孙俪");
        map.put("王宝强", "马蓉");
        map.put("宋喆", "马蓉");
        map.put("刘令博", null);
        map.put(null, "刘亦菲");
        map.put("鹿晗", "关晓彤");

        //第一组: 先取出 所有的Key,通过Key 取出对应的Value
        Set keyset = map.keySet();

        //(1) 增强for
        System.out.println("=====keySet:第一种方式--增强for=====");
        for (Object key : keyset) {
            System.out.println(key + "-" + map.get(key));
        }
        //(2) 迭代器
        System.out.println("=====keySet:第二种方式--迭代器=====");
        Iterator iterator = keyset.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key + "-" + map.get(key));
        }

        //第二组: 把所有的values取出
        Collection values = map.values();
        //这里可以使用所有的Collection使用的遍历方法
        //(1) 增强for
        System.out.println("=====values:第一种方式--增强for=====");
        for (Object value : values) {
            System.out.println(value);
        }
        //(2) 迭代器
        System.out.println("=====values:第二种方式--迭代器=====");
        Iterator iterator2 = values.iterator();
        while (iterator2.hasNext()) {
            Object value = iterator2.next();
            System.out.println(value);
        }

        //第三组: 通过EntrySet 来获取 k-y
        Set entrySet = map.entrySet();// EntrySet<Map.Entry<K,V>>
        //调用 Map接口 中的  Set<Map.Entry<K, V>> entrySet();
        //返回的 是 Set<Map.Entry<K, V>>------Set集合,里面存放Map.Entry<K, V>
        //System.out.println(entrySet.getClass());//class java.util.HashMap$EntrySet

        //(1) 增强for
        System.out.println("=====entrySet:第一种方式--增强for=====");
        for (Object entry : entrySet) {
            //将entry 转成 Map.Entry
            Map.Entry m = (Map.Entry) entry;
            //System.out.println(m.getClass());//class java.util.HashMap$Node
            System.out.println(m.getKey() + "-" + m.getValue());
        }
        //(2)  迭代器
        System.out.println("=====entrySet:第二种方式--迭代器=====");
        Iterator iterator3 = entrySet.iterator();
        while (iterator3.hasNext()) {
            Object entry = iterator3.next();
            //System.out.println(entry.getClass());//HashMap$Node -实现-> Map.Entry (getKey,getValue)
            //也可以转成 HashMap$Node , 但是 HashMap$Node 没有 相应的 得到 k-y 的方法
            //向下转型 Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());

        }


    }
}
