//对象克隆

public class MethodExercise02{

	//编写一个main方法
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "milan";
		p.age = 100;

		//创建tools
		MyTools tools = new MyTools();
		Person p2 = tools.copyPerson(p);

		//到此 p 和 p2 是两个不同的Person对象
		System.out.println("p的属性  age=" + p.age + " name=" + p.name);
		System.out.println("p2的属性  age=" + p2.age + " name=" + p2.name);
		//比较
		System.out.println(p == p2);//false
		
	}
}


class Person {
	String name;
	int age;
}


class MyTools {
	//编写一个方法copyPerson，可以复制一个Person对象。返回复制的对象，克隆对象
	//注意要求得到的 新对象和原来的对象 是两个独立的对象，只是他们的属性相同

	//1. 返回类型 Person
	//2. 方法名字 copyPerson
	//3. 形参 (Person p)
	//4. 方法体
	public Person copyPerson(Person p) {
		//创建一个新的对象
		Person p2 = new Person();
		p2.name = p.name;
		p2.age = p.age;

		return p2;//如何接收？
	}
}
