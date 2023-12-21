//判断闰年
//（1）4的倍数，并且不是100的倍数，  
//（2）是400的倍数
import  java.util.Scanner;
public class Homework03{

	//编写一个main方法
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入年份");
		int year = myScanner.nextInt();
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			System.out.println(year + "是闰年");
		}else{
			System.out.println(year + "不是闰年");
		}
	}
}