

public class Homework08 {//公有类
	int count = 9;//属性


	public void count1() {//homework08类的成员方法
		count = 10;//这个count就是属性
		System.out.println("count=" + count);//10
	}


	public void count2() {//homework08类的成员方法
		System.out.println("count=" + count++);
	}



	//这是homework08类的main方法，任何一个类，都可有main
	public static void main(String[] args) {
		//1. new Homework08() 是匿名对象 ，开辟空间，没有名字
		//	匿名对象只能用一次，用完后销毁空间
		//2. new Homework08().count1() 创建好匿名对象后，就调用count1()
		new Homework08().count1();

		Homework08 h1 = new Homework08();
		h1.count2();
		h1.count2();

		
	}
}