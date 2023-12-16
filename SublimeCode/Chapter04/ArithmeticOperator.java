
/**
	演示算数运算符的使用
*/

public class ArithmeticOperator{

	//编写一个main方法
	public static void main(String[] args) {
		// /使用
		System.out.println(10 / 4); //从数学来看是2.5，java中 2
		System.out.println(10.0 / 4); //java中是2.5

		double d = 10 / 4; //java中 10 / 4 = 2 => 2.0
		System.out.println(d); // 2.0

		// % 取模，取余数
		// % 的本质，看一个公式 a % b = a - a / b * b
		System.out.println(10 % 3); //1
		System.out.println(-10 % 3); //-1
		System.out.println(10 % -3); //1
		System.out.println(-10 % -3); //-1

		//++ 的使用

		int i = 10;
		i++;
		++i;
		System.out.println("i=" + i);//12

		/*
		作为表达式使用
		前++： ++i 先自增 后赋值
		后++： i++ 先赋值 后自增
		*/

		int j = 8;
		//int k = ++j; // j = j+1; k=j
		int k = j++; // k = j; j = j+1
		System.out.println("k=" + k + "j=" + j);

	}
}