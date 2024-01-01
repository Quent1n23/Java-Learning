//二维数组
//动态初始化
/*

*/

public class TwoDimensionalArray02{

	//编写一个main方法
	public static void main(String[] args) {
		//int arr[][] = new int[2][3];第一种方式
		//第二种方式
		int arr[][];//先声明
		arr = new int[2][3];//再开辟空间
		arr[1][1] = 8;

		//遍历arr数组
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}