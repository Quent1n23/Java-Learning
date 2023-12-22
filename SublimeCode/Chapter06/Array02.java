

import java.util.Scanner;

public class Array02{

	//编写一个main方法
	public static void main(String[] args) {
		//演示    数据类型 数组名[] = new 数据类型[大小]
		//循环输入5个成绩，保存到double数组，并输出


		//(1) 动态初始化1
		double scores[] = new double[5];
		// double[] scores = new double[5];

		//(2) 动态初始化2
		//double scores[];// 声明数组，这时 scores 是 null（控）
		//scores = new double[5]; //分配内存空间，可以存放数据

		Scanner myScanner = new Scanner(System.in);
		//循环输入
		for(int i = 0; i < scores.length; i++){
			System.out.println("请输入第" + (i+1) + "个元素的值");
			scores[i] = myScanner.nextDouble();
		}
		//输出,遍历数组
		System.out.println("===当前数组的元素/值的情况如下===");
		for(int i = 0; i < scores.length; i++){
			System.out.println("第" + (i+1) + "个元素的值=" + scores[i]);
			
		}

	}
}