

public class Homework07 {
	//编写一个main方法
	public static void main(String[] args) {
		Dog dog1 = new Dog("小黄", "yellow", 2);
		dog1.show();
		Dog dog2 = new Dog("小白", "white", 3);
		dog2.show();
		
	}
}

class Dog {
	String name;
	String color;
	int age;
	public Dog(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	//输出方法show()显示其信息
	public void show() {
		System.out.println("name=" + this.name);
		System.out.println("color=" + this.color);
		System.out.println("age=" + this.age);
	}
}