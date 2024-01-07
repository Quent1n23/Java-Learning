

public class ThisDetail {
	//编写一个main方法
	public static void main(String[] args) {
		// T t1 = new T();
		// t1.f2();

		T t2 = new T();
		t2.f3();
		
	}
}

class T {
	String name = "jack";
	int age = 100;

	/*
	细节：访问构造器语法：this(参数列表);
	注意直接能在构造器中使用（即 只能在构造器中 访问另外一个 构造器）

	注意：如果有this() this访问构造器
		必须放在第一条语句
	*/

	public T() {
		this("jack", 100);//这里去访问 T(String name, int age)构造器
		System.out.println("T() 构造器");	
	}

	public T(String name, int age) {
		System.out.println("T(String name, int age)构造器");
	}


	//细节：this可以访问 本类的属性
	public void f3() {
		String name = "smith";
		//传统方式   就近原则
		System.out.println("传统方式");
		System.out.println("name="+ name + " age=" + age);
		//可以使用this访问属性
		System.out.println("使用this访问属性");
		System.out.println("name="+ this.name + " age=" + this.age);
	}


	//细节：访问成员方法的语法：this.方法名(参数列表);
	public void f1() {
		System.out.println("f1() 方法...");
	}

	public void f2() {
		System.out.println("f2() 方法...");
		//调用本类的 f1
		//第一种方式
		f1();
		//第二种方式
		this.f1();
	}
}