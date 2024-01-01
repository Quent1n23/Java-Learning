

public class Homework05{

	//编写一个main方法
	public static void main(String[] args) {
		/*
		随机生成10个整数 1-100 保存到数组
		并 倒序打印  求平均值  最大值，最小值的下标
		并 查找里面是否有 8
		*/
		
		int[] arr = new int[10];
		//生成随机数
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println("=====arr的元素情况=====");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}

		System.out.println("\n=====倒序打印=====");
		for(int i = arr.length-1; i >= 0; i--){
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		//平均值， 最大值 最小值的下标

		double sum = arr[0];
		int max = arr[0];
		int maxIndex = 0;
		for(int i = 1; i < arr.length; i++){
			sum += arr[i];//累计和

			if(max < arr[i]){//求最大值
				max = arr[i];
				maxIndex = i;
			}
		}
		System.out.println("max=" + max + "\t最大值下标=" + maxIndex);
		System.out.println("平均值=" + (sum / arr.length)  );

		//查找数组中是否有 8 ，使用顺序查找
		int findNum = 8;
		int index = -1;
		for(int i = 0; i < arr.length; i++){
			if(findNum == arr[i]){
				System.out.println("找到了数字"+ findNum + ",下标为 " + i);
				index = i;
				break;
			}
		}

		//没找到8
		if(index == -1){
			System.out.println("没有找到数字"+ findNum );
		}

	}
}