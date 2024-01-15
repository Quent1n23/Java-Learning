package com.hspedu.exception_.homework;

/**
 * @author 丁聪
 * @version 1.0
 */
public class Homework01 {
    public static void main(String[] args) {
        /*
        接收命令行的两个参数  设置的 String[] args接受的
        数据格式不正确, 缺少命令行参数, 除0  进行异常处理
         */
        try {
        //检查参数个数,2个
        if(args.length!= 2){
            throw new ArrayIndexOutOfBoundsException("输入参数个数不对");
            //如果不catch, 出现红字,抛出异常
        }
            //把接受的数据 转成int型,可能会出错
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);

            double res = cal(n1,n2);//接收结果,可能会 除0
            System.out.println("计算结果=" + res);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (NumberFormatException e) {
            System.out.println("参数格式不正确,需要整数");
        } catch(ArithmeticException e){
            System.out.println("除数不能为0");
        }

    }

    public static double cal(int n1, int n2){
        return n1/n2;
    }
}
