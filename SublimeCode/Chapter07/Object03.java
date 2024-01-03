

public class Object03{

	//编写一个main方法
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.age = 10;
		p1.name = "小明";
		Person p2 = p1; //把 p1 赋给了 p2 , 让 p2 指向 p1
		p1.age = 80;
		System.out.println(p2.age);

		
	}
}

class Person {
	String name;
	int age;
}