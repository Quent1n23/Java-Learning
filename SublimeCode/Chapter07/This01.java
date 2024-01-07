//				this关键字

public class This01 {
	//编写一个main方法
	public static void main(String[] args) {
		Dog dog1 = new Dog("大壮", 3);
		System.out.println("dog1的hashcode=" + dog1.hashCode());//哈希值，不是真正的地址
		dog1.info();

		Dog dog2 = new Dog("大黄", 2);
		System.out.println("dog2的hashcode=" + dog2.hashCode());
		dog1.info();
		
	}
}

class Dog {

	String name;
	int age;
	// public Dog(String dName, int dAge) {//构造器
	// 	name = dName;
	// 	age = dAge;
	// }

	//dName 和 dAge 改成 name age

	public Dog(String name, int age) {//构造器
		//this.name 就是 当前对象 的 属性name
		this.name = name;
		//this.age 就是 当前对象 的 属性age
		this.age = age;
		System.out.println("this.hashcode=" + this.hashCode());
	}

	public void info() {
		System.out.println("this.hashcode=" + this.hashCode());
		System.out.println(name + "\t" + age + "\t");
	}
}