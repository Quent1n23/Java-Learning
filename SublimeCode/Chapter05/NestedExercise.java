
import java.util.Scanner;

public class NestedExercise{

	//编写一个main方法
	public static void main(String[] args) {
		//出票系统：根据淡旺季的月份和年龄，打印票价
		//4-10旺季
		//成人18-60：60
		//儿童<18 ：半价30
		//老人>60 ： 20
		//淡季
		//成人40，其他20
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入月份");
		int month = myScanner.nextInt();
		System.out.println("请输入年龄");
		int age = myScanner.nextInt();

		

		if(month >= 4 && month <= 10) {
			//旺季
			System.out.println("现在是" + month + "月，是旺季");
			if(age >= 1 && age < 18) {
				System.out.println("儿童，您的票价为30元");
			}else if(age >= 18 && age <= 60) {
				System.out.println("成人，您的票价为60元");
			}else if(age > 60 && age <= 150) {
				System.out.println("老人，您的票价为20元");
			}else {
				System.out.println("您的年龄有误，请重新输入");
			}
		}else if((month >= 1 && month <= 4) || (month >= 10 && month <= 12) ) {
			//淡季
			System.out.println("现在是" + month + "月，是淡季");
			if(age >= 18 && age <= 60) {
				System.out.println("成人，您的票价为40元");
			}else if((age >= 1 && age < 18) || (age > 60 && age <= 150) ) {
				System.out.println("老人或者儿童，您的票价为20元");
			}else {
				System.out.println("您的年龄有误，请重新输入");
			}


		}else {
			System.out.println("输入的月份错误，请重新输入");
		}
		
	}
}