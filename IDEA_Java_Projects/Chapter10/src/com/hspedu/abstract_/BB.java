package com.hspedu.abstract_;

public class BB extends Template {
//    public void calculateTime() {
//        //得到开始时的时间
//        long start = System.currentTimeMillis();
//        job();
//        //得到结束的时间
//        long end = System.currentTimeMillis();
//        System.out.println("BB执行时间= "+ (end - start));
//    }
    @Override
    public void job(){//实现Template的抽象方法 job()
        long sum = 0;
        for (long i = 1; i <= 80000; i++) {
            sum *= i ;
        }
    }
}
