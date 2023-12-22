
/*
求出一个数组int[]的最大值{4，-1，9，10，23} 并得到对应的下标
*/
public class ArrayExercise02{

	//编写一个main方法
	public static void main(String[] args) {
		int[] arr = {4, -1, 9, 10, 23};
		int index = 0;
		int max = arr[0];//假设 第一个元素是最大值
		for(int i = 1; i < arr.length; i++){//从下标 1 开始遍历
			if(arr[i] > max){
				max = arr[i];
				index = i;
			}
		}
		System.out.println("最大值为：" + max + "\n下标为：" + index);
		
	}
}