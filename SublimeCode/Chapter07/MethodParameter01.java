//基本数据类型的传参机制 
//基本数据类型，传递的是值（值拷贝），形参的任何改变不影响实参

public class MethodParameter01{

	//编写一个main方法
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		AA obj = new AA();
		obj.swap(a,b);//调用swap方法

		System.out.println("main方法 a=" + a + "\tb=" + b);
		
	}
}

class AA {

	public void swap(int a,int b) {
		System.out.println("a,b交换前");
		System.out.println("a=" + a + "\tb=" + b);
		//完成a,b的交换
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a,b交换后");
		System.out.println("a=" + a + "\tb=" + b);
	}
}