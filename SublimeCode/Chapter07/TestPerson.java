

public class TestPerson {
	//编写一个main方法
	public static void main(String[] args) {
		Person p1 = new Person("mary", 20);
		Person p2 = new Person("smith", 30);
		System.out.println(p1.compareTo(p2));
		
	}
}
//定义person类， 属性name age  提供compareTo比较方法
//用于判断是否和另一个人相等

class Person {
	String name;
	int age;
	//构造器
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//compareTo比较方法
	public boolean compareTo(Person p) {
		//名字和年龄完全一样
		// if(this.name.equals(p.name) && this.age == p.age) {
		// 	return true;
		// } else {
		// 	return false;
		// }
		return this.name.equals(p.name) && this.age == p.age;
		//this 谁调用 指向谁
	}
}