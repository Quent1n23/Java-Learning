package com.hspedu.enum_;

/**
 * @author 丁聪
 * @version 1.0
 *
 * 演示Enum类的 各种方法
 */
public class EnumMethod {
    public static void main(String[] args) {
        //使用 Season3枚举类 ,演示各种方法
        Season3 autumn = Season3.AUTUMN;

        //输出 枚举对象的 名字
        System.out.println(autumn.name());

        //ordinal(),输出枚举对象的编号,从0开始
        System.out.println(autumn.ordinal());

        //values(),返回一个 Season3[]数组
        //含有定义的所有枚举对象
        Season3[] values = Season3.values();//隐藏起来的方法, 反编译可以看到
        for(Season3 season: values){//增强for循环
            System.out.println(season);
        }

        //valueOf: 将字符串转换成枚举对象
        //要求字符串,必须,为已有的常量名, 否则报异常
        Season3 autumn1 = Season3.valueOf("AUTUMN");
        System.out.println("autumn1=" +autumn1);
        System.out.println(autumn == autumn1);

        //compareTo:比较两个枚举常量,比较的就是编号
        //return self.ordinal - other.ordinal  (编号相减)
        System.out.println(Season3.AUTUMN.compareTo(Season3.SUMMER));

//        int[] nums = {1,2,9};
//        //普通for循环
//        for (int i = 0; i < nums.length; i++) {
//            System.out.println(nums[i]);
//        }
//        //增强for循环
//        for (int i : nums){//执行流程: 依次从nums数组中,取出数据,赋给i
//            System.out.println(i);
//        }


    }
}
