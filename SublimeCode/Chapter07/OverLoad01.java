//方法重载
//同一个类中，多个同名方法的存在，要求形参列表不一致
//
//1. 减轻了起名的麻烦
//2. 减轻了记名的麻烦

public class OverLoad01 {

	//编写一个main方法
	public static void main(String[] args) {
		// out 是 PrintStream 的对象
		// System.out.println(100);
		// System.out.println("hello,world");
		// System.out.println('h');
		// System.out.println(1);
		// System.out.println(true);
		MyCalculator mc = new MyCalculator();
		System.out.println(mc.calculate(1, 2));
		System.out.println(mc.calculate(1.1, 2));
		
	}
}

class MyCalculator {
	//下面的四个calculate方法 构成了重载
	//两个整数的和
	public int calculate(int n1,int n2){
		System.out.println("calculate(int n1,int n2)被调用");
		return n1 + n2;
	}
	
	//没有构成重载，形参列表 必须不一样
	// public void calculate(int n1,int n2){
	// 	System.out.println("calculate(int n1,int n2)被调用");
	// 	return n1 + n2;
	// }

	//一个整数，一个double的和
	public double calculate(int n1,double n2){
		System.out.println("calculate(int n1,double n2)被调用");
		return n1 + n2;
	}
	//一个double，一个int
	public double calculate(double n1,int n2){
		System.out.println("calculate(double n1,int n2)被调用");
		return n1 + n2;
	}
	//三个int和
	public int calculate(int n1,int n2, int n3){
		System.out.println("calculate(int n1,int n2, int n3)被调用");
		return n1 + n2 + n3;
	}
}