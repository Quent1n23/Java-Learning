//2. 实现判断一个整数，属于哪个范围：大于0  小于0  等于 0
import  java.util.Scanner;

public class Homework02{

	//编写一个main方法
	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入一个整数");
		int n = myScanner.nextInt();
		if(n > 0){
			System.out.println(n + " > 0");
		} else if(n == 0) {
			System.out.println(n + " = 0");
		} else if(n < 0) {
			System.out.println(n + " < 0");
		} else{//输入 字符 或者 字符串 时， 会抛出异常，不加这个else也行
			System.out.println("输入错误，请重新输入");
		}
		
	}
}