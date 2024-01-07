

public class VarScopeDetail{

	//编写一个main方法
	public static void main(String[] args) {
		
		Person p1 = new Person();
		/*
		属性
		生命周期较长，伴随着对象的创建而创建，伴随着对象的销毁而销毁
		局部变量，
		生命周期较短，伴随着它的代码块的执行而创建，伴随着代码块的结束而销毁
		*/
		p1.say();
		T t1 = new T();

		t1.test();//第1种 跨类访问 对象属性 的方式

		t1.test2(p1);//第2种 跨类访问 对象属性 的方式
	}
}

class Person {
	//属性 		可以加修饰符
	//局部变量 	不能加修饰符 
	public int age = 20;

	String name = "jack";

	public void say() {
		//细节：属性和局部变量可以重名，访问时遵循就近原则
		String name = "king";
		System.out.println("say() name = " + name);
	}
	//细节
	//同一个作用域中，两个局部变量不同重名
}


class T {
	public void test() {
		//全局变量可以/属性：可以在本类使用，或其他类使用
		Person p1 = new Person();
		System.out.println(p1.name);
	}

	public void test2(Person p) {
		System.out.println(p.name);
	}
}