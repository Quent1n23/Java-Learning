

public class ConstructorExercise {
	//编写一个main方法
	public static void main(String[] args) {
		Person p1 = new Person();//第一个 无参构造器
		System.out.println("p1的信息 name=" + p1.name + " age=" + p1.age);

		Person p2 = new Person("scott", 50);//第二个 带参构造器
		System.out.println("p2的信息 name=" + p2.name + " age=" + p2.age);
	}
}

class Person {
	String name;// null
	int age;// 0

	//添加两个构造器

	//第一个无参构造器：利用构造器设置 所有人的 age属性 初始值为18
	public Person() {
		age = 18;
	}

	//第二个带pName和pAge的构造器：
	//使得每次创建Person对象的同时，初始化对象的age属性值和name属性值
	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;
	}
}