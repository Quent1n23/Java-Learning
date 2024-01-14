package com.hspedu.homework;

import com.sun.corba.se.spi.orbutil.threadpool.Work;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * @author 丁聪
 * @version 1.0
 */
public class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("一般情况下,使用马儿前进...");
    }
}
