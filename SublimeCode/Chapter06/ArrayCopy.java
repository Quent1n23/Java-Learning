//数组拷贝
//要求数据空间是 独立的
public class ArrayCopy{

	//编写一个main方法
	public static void main(String[] args) {
		
		int[] arr1 = {10,20,30};
		//int[] arr2 = arr1;共享堆空间 不叫拷贝

		//应该 创建一个新的数组arr2，开辟新的数据空间
		//大小  arr1.length

		int[] arr2 = new int[arr1.length];

		//遍历 arr1 ， 把每个元素拷贝到 arr2 对应的位置
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}

		arr2[0] = 100;
		System.out.println("===arr1[]的值===");
		for(int i = 0; i < arr1.length; i++){
			System.out.println(arr1[i]);
		}
		System.out.println("===arr2[]的值===");
		for(int i = 0; i < arr2.length; i++){
			System.out.println(arr2[i]);
		}
	}
}