//演示 |  和 ||  的使用

public class LogicOperator02{

	//编写一个main方法
	public static void main(String[] args) {
		
		//短路或  ||
		int age = 50;
		if(age > 20 || age < 30) {
			System.out.println("ok100");
		}

		//逻辑或 |
		if(age > 20 | age < 30) {
			System.out.println("ok200");
		}


		/*
		区别
		|| 短路或：第一个条件T，第二个条件不会判断，效率高
		|  逻辑或：第二个条件必须判断
		*/
		int a = 4;
		int b = 9;
		if(a > 1 || ++b > 4) {
			System.out.println("ok300");
		}
		System.out.println("a=" + a + " b=" + b);

	}
}