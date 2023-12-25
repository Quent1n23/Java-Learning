//冒泡排序

public class BubbleSort{

	//编写一个main方法
	public static void main(String[] args) {
		int[] arr = {24, 69, 80, 57, 13, -1, 200, 110, 30};
		int temp = 0;

		for(int i = 0; i < arr.length-1; i++){//外层循环是4次

			for(int j = 0; j < arr.length-1 - i; j++){//4次比较
			//如果前面的数 > 后面的数， 就交换
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}

			System.out.println("\n===第" + (i+1) + "轮===");
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + "\t");
			}
		}

		
	}
}