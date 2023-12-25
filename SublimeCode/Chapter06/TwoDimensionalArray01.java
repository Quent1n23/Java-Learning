//二维数组

public class TwoDimensionalArray01{

	//编写一个main方法
	public static void main(String[] args) {
		//从定义形式上看 int[][]

		int[][] arr = { {0, 0, 0, 0, 0, 0}, 
						{0, 0, 1, 0, 0, 0}, 
						{0, 2, 0, 3, 0, 0},
						{0, 0, 0, 0, 0, 0} };

		System.out.println("二维数组的元素个数= " + arr.length);

		

		//输出二维图形
		for(int i = 0; i < arr.length; i++) {//遍历二维数组的每个一维数组

			//arr[i].length 对应的每个一维数组的长度
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");//输出一维数组
			}
			System.out.println();//换行
		}
	}
}