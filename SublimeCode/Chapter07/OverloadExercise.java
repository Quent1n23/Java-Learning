

public class OverloadExercise {

	//编写一个main方法
	public static void main(String[] args) {
		Methods method = new Methods();
		method.m(10);
		method.m(10, 20);
		method.m("韩顺平教育 hello");

		System.out.println(method.max(10,24));//24
		System.out.println(method.max(10.5, 356.3));//
		System.out.println(method.max(36.1, 27.6, 45));//调用时，发生 类型自动转换
		
	}
}


//类 Methods
class Methods {
	//方法名m,重载，共有三个方法
	public void m(int n) {
		System.out.println("平方=" + (n * n));
	}

	public void m(int n1, int n2) {
		System.out.println("相乘=" + (n1 * n2));
	}

	public void m(String str) {
		System.out.println("传入的字符串为" + str);
		
	}

	//重载方法max()
	//两个int最大值
	public int max(int n1, int n2) {
		return n1 > n2 ? n1 : n2;
	}
	//两个double最大值
	public double max(double n1, double n2) {
		return n1 > n2 ? n1 : n2;
	}
	//三个double最大值
	public double max(double n1, double n2, double n3) {
		double max1 = n1 > n2 ? n1 : n2;
		return max1 > n3 ? max1 : n3;
	}
}