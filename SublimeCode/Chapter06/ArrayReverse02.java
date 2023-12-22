//数组反转
//逆序赋值

public class ArrayReverse02{

	//编写一个main方法
	public static void main(String[] args) {
		
		int[] arr = {11, 22, 33, 44, 55, 66};
		int[] arr2 = new int[arr.length];
		for(int i = 0; i < arr.length; i++){
			arr2[i] = arr[arr.length-1-i];
		}

		//让 arr 指向 arr2 数据空间，此时 arr 原来的数据空间就没有变量引用
		//会被当做垃圾，销毁
		arr = arr2;
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
		
	}
}