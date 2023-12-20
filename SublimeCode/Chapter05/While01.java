
/*
	循环变量初始化;
	while(循环条件) {
		循环体(语句);
		循环变量迭代;
	}
*/

public class While01{

	//编写一个main方法
	public static void main(String[] args) {
		int i = 1;
		while(i <= 10){
			System.out.println("你好 ，韩顺平教育" + i);
			i++;
		}
		System.out.println("退出while循环，继续......");
	}
}