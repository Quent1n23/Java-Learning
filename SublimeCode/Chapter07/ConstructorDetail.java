

public class ConstructorDetail{
	//编写一个main方法
	public static void main(String[] args) {
		Person p1 = new Person("king",  40);
		Person p2 = new Person("tom");

		Dog dog1 = new Dog();//使用的是 默认构造器
		
	}
}
//一个类可以有多个构造器，即 构造器的重载
class Person {
	String name;
	int age;
	//第 1 个构造器
	public Person(String pName, int pAge) {
		System.out.println("第 1 个构造器被调用~~");
		name = pName;
		age = pAge;
	}
	//第 2 个构造器
	public Person(String pName) {
		System.out.println("第 2 个构造器被调用~~");
		name = pName;
	}
}

class Dog{
	//一个类 没有定义构造器，系统会自动给类生成一个 
	//默认无参构造器(默认构造器)
	/*
		默认构造器
		Dog() {
		
		}

	javap 反编译 Dog.class
	*/

	//一旦定义了构造器，默认构造器就被覆盖，不能再使用默认构造器，
	//除非显示的再定义一下
	public Dog(String dName) {

	}
	Dog() {//显示的再定义一下 默认构造器

	}
}