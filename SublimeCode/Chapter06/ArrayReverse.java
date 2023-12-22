//数组反转

public class ArrayReverse{

	//编写一个main方法
	public static void main(String[] args) {
		
		int[] arr = {11, 22, 33, 44, 55, 66};
		//优化
		//temp写到外面	length保存
		int temp = 0;
		int len = arr.length;
		for(int i = 0; i < len/2; i++){
			temp = arr[i];
			arr[i] = arr[len- 1 - i];
			arr[len- 1 - i] = temp;
		}
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}