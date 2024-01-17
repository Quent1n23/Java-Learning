package com.hspedu.system_;

import java.util.Arrays;

/**
 * @author 丁聪
 * @version 1.0
 */
public class SystemMethod {
    public static void main(String[] args) {

        //exit 退出当前程序
//        System.out.println("ok1");
        //1. exit(0) 表示程序状态
        //2. 0 表示一个状态,正常的状态
//        System.exit(0);
//        System.out.println("ok2");

        //arraycopy : 复制数组元素,比较适合底层调用
        //一般使用 Arrays.copyOf()完成复制数组
        int[] src = {1, 2, 3};
        int[] dest = new int[3];// dest当前是{0,0,0}

        //1. 主要搞清楚 五个参数
        // src 源数组 ,
        // srcPos 从源数组的哪个索引位置开始拷贝
        // dest 目标数组,
        // destPos 把数据拷贝到目标数组的 哪个索引
        // length 从源数组拷贝多少个数据
        System.arraycopy(src, 1, dest, 1, 2);
        System.out.println("dest=" + Arrays.toString(dest));

        //currentTimeMillis  1970.1.1 距今的 毫秒数
        System.out.println(System.currentTimeMillis());

        //gc() 垃圾回收机制

    }
}
