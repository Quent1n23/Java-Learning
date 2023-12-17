//三元运算符

public class TernaryOperator{

	//编写一个main方法
	public static void main(String[] args) {
		
		int a = 10;
		int b =99;

		//a > b 为false
		//返回b--，先返回b的值，然后再 b - 1
		//返回的结果是99
		int result = a > b ? a++ : b--;
		System.out.println("result=" + result);
		System.out.println("a=" + a);
		System.out.println("b=" + b);

	}
}