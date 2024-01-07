//可变参数
//Java中允许将 同一个类中 多个同名 同功能 但参数个数不同 的方法 封装成一个方法。	
//可以通过可变参数实现

//基本语法
//访问修饰符 返回类型 方法名(数据类型... 形参名){}


public class VarParameter01 {

	//编写一个main方法
	public static void main(String[] args) {
		DcMethod m = new DcMethod();
		m.sum();
		System.out.println(m.sum(1, 5, 25));
		
	}
}

class DcMethod {
	//可以计算 2个数的和， 3个数的和，4个数的和， 5个，6个...
	// public int sum(int n1, int n2) {
	// 	return n1 + n2;
	// }
	// public int sum(int n1, int n2, int n3) {
	// 	return n1 + n2 + n3
	// }
	// public int sum(int n1, int n2, int n3, int n4) {
	// 	return n1 + n2 + n3 + n4;
	// }


	//1. int...表示 接收的是可变参数，类型是int，即可以接收多个int(0-n)
	//2. 使用可变参数时，可以当作数组来使用
	//3. 遍历求和
	public int sum(int... nums) {
		System.out.println("接收的参数个数=" + nums.length);
		int res = 0;
		for(int i = 0; i < nums.length; i++) {
			res += nums[i];
		}
		return res;
	}
}