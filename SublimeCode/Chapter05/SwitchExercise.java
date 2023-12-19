
import java.util.Scanner;

public class SwitchExercise{

	//编写一个main方法
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		//1.
		// System.out.println("请输入一个字符(a-e)");
		// char ch = myScanner.next().charAt(0);
		// switch(ch){
		// 	case 'a' :
		// 	System.out.println((char)(ch - 32));
		// 	break;
		// 	case 'b' :
		// 	System.out.println((char)(ch - 32));
		// 	break;
		// 	case 'c' :
		// 	System.out.println("C");
		// 	break;
		// 	case 'd' :
		// 	System.out.println("D");
		// 	break;
		// 	case 'e' :
		// 	System.out.println("E");
		// 	break;
		// 	default :
		// 	System.out.println("你的输入有误");
		// }

		//2.
		//成绩大于60，输出合格，低于60，输出不合格。（不能大于100）提示：成绩/60
		//使用switch
		//需要进行转换：
		//大于60  (int)(成绩/60) = 1

		// double score = 188.5;
		// if(score >= 0 && score <= 100) {
		// 	switch((int)(score / 60)) {
		// 		case 0 :
		// 			System.out.println("不及格");
		// 			break;
		// 		case 1 :
		// 			System.out.println("及格");
		// 			break;
		// 		// default :
		// 		// 输入有误	
		// 	}
		// } else {
		// 	System.out.println("输入有误");
		// }
		
		

		//3.
		//345春季，678夏季，9，10，11秋季，12，1，2冬季
		//使用穿透

		System.out.println("输入月份");
		int month = myScanner.nextInt();
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("这是春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("这是夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("这是秋季");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("这是冬季");
				break;
			default :
				System.out.println("输入的月份不对");
		}
	}
}