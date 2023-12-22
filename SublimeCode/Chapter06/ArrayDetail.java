
// 数组是引用数据类型
public class ArrayDetail{

	//编写一个main方法
	public static void main(String[] args) {
		//1. 相同数据
		//int[] arr1 = {1, 2, 3, 60, 1.1, "hello"};//double -> int 报错
		double[] arr2 = {1.1, 2.2, 3.3, 60.8, 100};//int -> double 自动类型转换

		//2. 元素可以是任何数据类型 包括 基本数据类型 引用数据类型
		String[] arr3 = {"北京", " 上海", "jack"};

		//3. 数组创建后，如果没有赋值， 有默认值
		//int 0, short 0, byte 0, long 0, float 0.0, double 0.0
		//char \u0000,
		//boolean false, String null
		short[] arr4 = new short[3];
		System.out.println("===数组arr4===");
		for(int i = 0; i < arr4.length; i++){
			System.out.println(arr4[i]);
		}

		//6. 下标必须在指定范围内使用， 否则报错： 下标越界异常
		//编译没问题，运行时有问题

		//7. 数组属于引用类型，数组型数据 是 对象(object) 
	}
}