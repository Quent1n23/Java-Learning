//赋值运算符

public class AssignOperator{

	//编写一个main方法
	public static void main(String[] args) {
		
		int n1 = 10;
		n1 += 4;
		System.out.println(n1);

		//复合赋值运算符 会进行类型转换
		byte b = 3;
		b += 2;//等价 b = (byte)(b + 2)
		b++;// b = (byte)(b + 1)
		//b = b + 2 错误，类型不兼容
	}
}