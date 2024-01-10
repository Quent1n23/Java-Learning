package com.hspedu.debug_;
//断掉调试，数组越界异常
public class Debug02 {
    public static void main(String[] args) {
        int[] arr = {1, 19, -1};
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("退出for");
    }
}
