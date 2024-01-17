package com.hspedu.date_;

import java.time.Instant;
import java.util.Date;

/**
 * @author 丁聪
 * @version 1.0
 */
public class Instant_ {
    public static void main(String[] args) {

        //时间戳
        //1. 通过静态方法 now() 获取表示当前时间戳的对象
        Instant now = Instant.now();
        System.out.println(now);

        //2. 通过 from 可以把 Instant转成Date
        Date date = Date.from(now);

        //3. 通过 toInstant  可以把 Date 转成 Instant对象
        Instant instant = date.toInstant();


    }
}
