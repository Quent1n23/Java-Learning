// ! 和 ^ 案例演示

public class InverseOperator{

	//编写一个main方法
	public static void main(String[] args) {
		
		// ! 取反操作
		System.out.println(60 > 20); //T
		System.out.println(!(60 > 20)); //F


		//a^b 逻辑异或，a b 不同时，为T，否则为F
		boolean b = (10 > 1) ^ (3 < 5);
		System.out.println("b=" + b);
	}
}