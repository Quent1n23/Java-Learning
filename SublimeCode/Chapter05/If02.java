//if-else快速入门

import java.util.Scanner;

public class If02{

	//编写一个main方法
	public static void main(String[] args) {
		//编写一个程序，可以输入人的年龄，如果该同志的年龄大于18岁
		//则输出“你的年龄大于18，要对自己的行为负责，送入监狱”
		//否则“你的年龄不大，这次放过你了”
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入你的年龄");
		int age = myScanner.nextInt();
		if(age > 18){
			System.out.println("你的年龄大于18，要对自己的行为负责，送入监狱");
		} else{//双分支
			System.out.println("你的年龄不大，这次放过你了");
		}

		System.out.println("程序继续");
	}
}