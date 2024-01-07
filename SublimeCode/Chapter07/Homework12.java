

public class Homework12 {
	//编写一个main方法
	public static void main(String[] args) {
		
		
	}
}
//提供3个构造方法，可以初始化属性
//1. 名字，性别，年龄，职位，薪水
//2. 名字，性别，年龄
//3. 职位，薪水
//要求 充分复用构造器
class Employee {
	String name;
	char gender;
	int age;
	String job;
	double sal;
	//名字，性别，年龄
	public Employee(String name, char gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	//职位，薪水
	public Employee(String job, double sal) {
		this.job = job;
		this.sal = sal;
	}
	//名字，性别，年龄，职位，薪水
	public Employee(String name, char gender, int age, String job, double sal) {
		this(name, gender, age); //this调用构造器
		this.job = job;
		this.sal = sal;
	}
}
