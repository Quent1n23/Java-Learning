//引用数据类型传参机制

public class MethodParameter02{

	//编写一个main方法
	public static void main(String[] args) {
		B b = new B();

		// int[] arr = {1,2,3};
		// b.test100(arr);
		
		// System.out.println("main的 arr数组");
		// for(int i = 0; i < arr.length; i++) {
		// 	System.out.print(arr[i] + "\t");
		// }
		// System.out.println();
		

		//测试
		Person p = new Person();
		p.name = "jack";
		p.age = 10;

		b.test200(p);
		System.out.println("main 的p.age=" + p.age);//10000
	}
}

class Person {
	String name;
	int age;
}



class B {

	public void test200(Person p) {
		//p.age = 10000;//修改对象属性

		//思考
		//p = null;

		//思考
		p = new Person();//在 堆 里 产生新对象（空间）;此时p指向新空间
		p.name = "tom";
		p.age = 99;
		//未被引用，退出后，新空间被当作垃圾 回收
	}


	//可以接收一个数组，在方法中修改该数组
	public void test100(int[] arr) {
		arr[0] = 200;//修改元素
		//遍历
		System.out.println("test100的 arr数组");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
	
}