//作用域
//scope 范围

public class VarScope {

	//编写一个main方法
	public static void main(String[] args) {
		
		
	}
}

class Cat {
	//全局变量：也就是属性，作用域 为 整个类体 Cat类
	//属性在定义时，可以直接赋值
	int age = 10;

	//全局变量(属性) 可以不赋值，直接使用，因为有默认值
	double weight;//默认值 0.0

	//局部变量必须赋值后，才能使用，没有默认值
	public void hi() {
		int num = 1;
		System.out.println("num=" + num);
		System.out.println("weight=" + weight);
		//错误: 可能尚未初始化变量num
	}


	public void cry() {
		//1. 局部变量一办是指在成员方法中定义的变量
		//2. n 和 name 就是局部变量
		//3. n 和 name 的作用域 在cry方法中
		int n = 10;
		String name = "jack";
		System.out.println("在cry中使用属性 age=" + age);
	}

	public void eat() {
		System.out.println("在eat中使用属性 age=" + age);
		// System.out.println("在cry中使用 cry的变量 name=" + name);错误
	}
}