
//求 1 + (1+2) + (1+2+3) + (1+2+3+4) + ... + (1+2+3+...+99+100)
public class Homework09{

	//编写一个main方法
	public static void main(String[] args) {
		
		/*
		1. 一共有100项相加
		2. 每一项的数字在逐渐增加
		3. 很想一个双层循环
		i 可以表示第几项  还可以表示每一项的最后一个数字
		*/
		int sum = 0;
		for(int i = 1; i <= 100; i++){//
			for(int j = 1; j <= i; j++){//内层，对 1~i 进行循环
				sum += j;
			}
		}
		System.out.println("sum=" + sum);
	}
}