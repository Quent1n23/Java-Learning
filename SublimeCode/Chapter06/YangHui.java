//杨辉三角
/*

1
1  1
1  2  1
1  3  3  1
1  4  6  4  1
1  5  10 10 5  1
......

使用二维数组打印一个10行杨辉三角

1. 第n行 有n个元素
2. 首元素，尾元素 1
3. 从第三行开始，非首位元素 的元素 的值 arr[i][j] = arr[i-1][j] + arr[i-1][j-1]
*/

public class YangHui{

	//编写一个main方法
	public static void main(String[] args) {

		int[][] yangHui = new int[10][];//十个一维数组

		for(int i = 0; i < yangHui.length; i++){

			yangHui[i] = new int[i+1];//给每个一维数组（每行）开辟空间

			//给每个一维数组（每行）赋值
			for(int j = 0; j < yangHui[i].length; j++){
				if(j == 0 || j == i){//首位元素 赋值1   （j == length-1） 也可以
					yangHui[i][j] = 1;
				}else {
					yangHui[i][j] = yangHui[i-1][j] + yangHui[i-1][j-1];
				}
			}
		}

		
		//输出
		for(int i = 0; i < yangHui.length; i++){
			for(int j = 0; j < yangHui[i].length; j++){
				System.out.print(yangHui[i][j] + "\t");
			}
			System.out.println();
		}
	}
}