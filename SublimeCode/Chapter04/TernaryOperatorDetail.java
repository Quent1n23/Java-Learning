//三元运算符细节

public class TernaryOperatorDetail{

	//编写一个main方法
	public static void main(String[] args) {
		//表达式1 和 表达式2 要为 可以赋给接受变量的类型（或可以自动转换/或者强制转换）
		int a = 3;
		int b = 8;
		// int c = a > b ? 1.1 : 3.8;错误编译不通过
		int c = a > b ? (int)1.1 : (int)3.8;
		double d = a > b ? a : b;

		

	}
}