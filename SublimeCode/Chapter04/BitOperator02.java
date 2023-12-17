//位运算

public class BitOperator02{

	//编写一个main方法
	public static void main(String[] args) {
		int a = 1 >> 2; //00000001 右移 2位 1 / 2 / 2 = 0
		int c = 1 << 2; //00000001 左移 2位 1 * 2 * 2 = 4

		System.out.println("a=" + a);
		System.out.println("c=" + c);
		System.out.println(4 << 3);

	}
}