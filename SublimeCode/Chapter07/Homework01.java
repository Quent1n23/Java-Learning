

public class Homework01 {
	//编写一个main方法
	public static void main(String[] args) {
		A01 a01 = new A01();
		double[] arr = {1.0, 4.7, 1.8};
		//double[] arr = null
		Double res = a01.max(arr);
		if(res != null){
			System.out.println("arr的最大值=" + res);
		} else {
			System.out.println("arr的输入有误");
		}
		
		
	}
}

class A01 {
	//求某个double数组的最大值，并返回
	//考虑到代码健壮性，若数组长度为0？

	//Dboule 包装类
	public Double max(double[] arr) {
		//先判断arr是否为空，再判断长度
		if(arr != null && arr.length > 0) {
			//保证arr至少有一个元素
			double max = arr[0];
			for(int i = 1; i < arr.length; i++ ) {
				if(max < arr[i]){
					max = arr[i];
				}
			}
			return max;
		} else {
			return null;
		}
		
	}
}