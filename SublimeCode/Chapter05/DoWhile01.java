
/*
循环变量初始化
do{
	循环体(语句);
	循环变量迭代;
}while(循环条件);
*/

public class DoWhile01{

	//编写一个main方法
	public static void main(String[] args) {
		int i = 1;
		do {
			System.out.println("你好，韩顺平教育" + i);
			i++;
		}while(i <= 10);

		System.out.println("退出do..while 继续执行");
		
	}
}