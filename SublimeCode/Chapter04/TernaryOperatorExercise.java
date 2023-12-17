

public class TernaryOperatorExercise{

	//编写一个main方法
	public static void main(String[] args) {
		//实现三个数的最大数
		int n1 = 55;
		int n2 = 33;
		int n3 = 123;
		//1. 先得到 n1 和 n2 中最大数，保存到max1
		//2. 然后再 求出 max1 和 n3 中的最大数，保存到max2
		int max1 = n1 > n2 ? n1 : n2;
		int max2 = n3 > max1 ? n3 : max1;
		System.out.println("最大数=" + max2);

		//使用一条语句实现,推荐使用上面的方法
		//后面还有更好的方法
		int max = (n1 > n2 ? n1 : n2) > n3 ? (n1 > n2 ? n1 : n2) : n3;
		System.out.println("max=" + max);

		

	}
}