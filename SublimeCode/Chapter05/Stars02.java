//空心菱形

public class Stars02{

	//编写一个main方法
	public static void main(String[] args) {
		//化繁为简
		/*
		1. 打印矩形
		*****
		*****
		*****
		*****
		*****
		2.打印金字塔
		*	 1	2*1-1	2个空格	总层数-1
	   ***	 3	2*2-1	1个空格	总层数-2
	  *****  5	2*3-1	0个空格	总层数-3
	  	3. 打印空心金字塔
	  	*
	   * *
	  *   *


		*/

	  	//打印空心金字塔
		int i = 1;
		while(i <= 5){//每层,层数为奇数
			for(int k = 1; k <= 5-i;k++ ){//打印空格
				System.out.print(" ");
			}
			int j = 1;
			while(j <= 2*i-1){//每行打印的*
				if(j==1 || j==2*i-1){
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				j++;
			}
			System.out.println();
			i++;
		}
		
		//打印倒空心金字塔
		/* 
	  *********		9	2*5-1		空格0	5-5
	   *******		7	2*4-1		空格1	5-4
		*****		5	2*3-1		空格2	5-3
		 ***		3	2*2-1		空格3	5-2
		  *			1	2*1-1		空格4	5-1

		*   *
		 * *
		  *
		*/
		i--;//5

		while(i >= 1){
			for(int k = 5; k > 5+1-i;k-- ){//打印空格 4 3 2 1 
				System.out.print(" ");
			}
			System.out.println("*");
			i--;
		}
	}
}