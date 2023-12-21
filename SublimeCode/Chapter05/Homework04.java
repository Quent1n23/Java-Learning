/*
判断一个整数是否是水仙花数
所谓水仙花数是指一个 3位数，其各个位数上 数字 立方和 等于其本身
例如：153 = 1*1*1 + 3*3*3 + 5*5*5
*/
import  java.util.Scanner;
public class Homework04{

	//编写一个main方法
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个三位数");
		int n = myScanner.nextInt();
		//int n = 123;
		// n%10 个位		
		//n/100 百位 
		//n/10/10 十位		n % 100 / 10 十位
		int n1 = n / 100;//百位
		int n2 = n / 10 % 10;//十位 153/10 = 15
		int n3 = n % 10;//个位
		int sum = (n%10)*(n%10)*(n%10) + (n/10%10)*(n/10%10)*(n/10%10) + (n/100)*(n/100)*(n/100);

		if(n < 100 || n > 999){
			System.out.println( "输入错误");
		} else if(sum == n){
			System.out.println(n + "是水仙数");
		} else {
			System.out.println(n + "不是水仙数");
		}

		
		 
	}
}