package com.hspedu.math_;

/**
 * @author 丁聪
 * @version 1.0
 */
public class MathMethod {
    public static void main(String[] args) {
        //math常用方法 (静态方法)
        //1. abs 绝对值
        int abs = Math.abs(-9);
        //2. pow 求幂
        double pow = Math.pow(2, 4);//2的4次方
        //3. ceil 向上取整 返回 >=该参数的 最小整数(转成double)
        double ceil = Math.ceil(-3.1);//-3.0
        //4. floor 向下取整 返回 <=该参数的 最大整数(转成double)
        double floor = Math.floor(4.5);//4.0
        //5. round 四舍五入
        long round = Math.round(5.5);//6
        //6. sqrt 开方
        double sqrt = Math.sqrt(9.0);//3.0
        double sqrt1 = Math.sqrt(-9.0);// NaN
        //7. random 求随机数
        //   random 返回的是 0-1 之间的 随机小数  [0,1)
        for (int i = 0; i < 2; i++) {
            System.out.println(Math.random());
        }
        //获取 a---b 随机整数,a,b均为整数   比如 a = 2, b = 7
        //即  2 <= x <= 7
        //  (int)(a) <= x <= (int)(a + Math.random() * (b-a+1) )  公式
        //  Math.random() * 6  (7-2+1)   ---->  [0,6)
        //  +a(2)   ---->   [2,8)
        //  (int)   ---->   [2,7] 取整
        int a = 2;
        int b = 7;
        for (int i = 0; i < 10; i++) {
            System.out.println((int) (a + Math.random() * (b - a + 1)));
        }

        //8. max,min
        int min = Math.min(1,9);
        int max = Math.max(10,99);

    }
}
