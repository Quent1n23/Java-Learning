//	构造器/构造方法
//constructor
//主要作用：完成对 新对象的初始化

public class Constructor{
	//编写一个main方法
	public static void main(String[] args) {
		//当我们 new 一个对象时， 直接通过构造器 指定名字和年龄
		Person p1 = new Person("smith", 80);
		System.out.println("p1的信息如下");
		System.out.println("p1对象name=" + p1.name);
		System.out.println("p1对象age=" + p1.age);
	}
}

/*

[修饰符] 方法体(形参){
	方法体;
}

1. 修饰符，可以是默认的
2. 没有返回值, 也不能写void
3. 方法名 和 类名 必须一样
4. 形参列表 和 成员方法 一样的规则
5. 构造器 的调用，由系统完成
*/
class Person {
	String name;
	int age;
	//构造器
	public Person(String pName, int pAge) {
		System.out.println("构造器被调用~~ 完成 对象的属性初始化");
		name = pName;
		age = pAge;
	}
}