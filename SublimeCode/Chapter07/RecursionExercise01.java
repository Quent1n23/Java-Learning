

public class RecursionExercise01{

	//编写一个main方法
	public static void main(String[] args) {
		T t1 = new T();
		int n = 0;
		int res = t1.Fibonacci(n);
		if(res != -1){
			System.out.println("当n="+ n + " 对应的斐波那契数=" + res);
		}
		

	}
}

class T {
		/*
		使用递归的方式求出斐波那契数1，1，2，3，5，8，13....给一个数n，求出它的值是多少

		1. n = 1 斐波那契数是1
		2. n = 2 斐波那契数是1
		3. n >= 3 斐波那契数是前两个数的和
		4. 这里就是一个递归的思路
		*/
		public int Fibonacci(int n) {
			if(n >= 1) {
				if(n == 1 || n == 2){
					return 1;
				} else {
					return Fibonacci(n-1) + Fibonacci(n-2);
				}
			} else {
				System.out.println("请输入一个大于1的整数");
				return -1;
			}
			
		}
}