
//数组的引出
//静态初始化
//数据类型 数组名[] = {元素值, 元素值, ... }

public class Array01{

	//编写一个main方法
	public static void main(String[] args) {
		/*
		3kg,5kg,1kg,3.4kg,2kg,50kg
		六只鸡总体重，平均体重

		*/
		// double hen1 = 3;
		// double hen2 = 5;
		// double hen3 = 1;
		// double hen4 = 3.4;
		// double hen5 = 2;
		// double hen6 = 50;

		// double totalWeight = hen1+hen2+hen3+hen4+hen5+hen6;
		// double avgWeight = totalWeight / 6;
		// System.out.println("总体重=" + totalWeight + "平均体重=" + avgWeight);


		//定义一个数组
		//1. double[] 表示 是double类型的数组，数组名 hens
		//2. {3, 5, 1, 3.4, 2, 50} 表示数组的 值/元素 ，依次表示数组的第几个元素
		double[] hens = {3, 5, 1, 3.4, 2, 50};

		//遍历数组得到数组的所有元素的和, 使用for

		//1. 可以通过 hens[下标] 来访问数组的元素
		//	 下标是从 0 开始编号的
		//2. 通过for 就可以循环的访问 数组的 元素/值
		//3. 使用一个变量 totalWeight 将各个元素累计
		System.out.println("===使用数组解决===");
		System.out.println("数组的长度=" + );
		double totalWeight = 0;
		for(int i = 0; i < ; i++){
			//System.out.println("第" + (i+1) + "个元素的值=" + hens[i]);
			totalWeight += hens[i];
		}
		System.out.println("总体重=" + totalWeight + "平均体重=" + (totalWeight/hens.length));
	}
}