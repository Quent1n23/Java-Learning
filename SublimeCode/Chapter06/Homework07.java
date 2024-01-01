//写出 冒泡排序的代码

public class Homework07{

	//编写一个main方法
	public static void main(String[] args) {

		//冒泡排序
		//要求从小到大
		int[] arr = {20, -1, 5, 123, 12, 68, };
		int temp = 0;
		for(int i = 0; i < arr.length-1; i++){//外层循环，几轮比较
			for(int j = 0; j < arr.length-1-i; j++){//每轮的比较次数
				if(arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

		for(int i = 0;  i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}
		
	}
}