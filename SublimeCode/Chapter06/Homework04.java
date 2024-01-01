/*
已知升序数组，要求插入一个元素，依然是升序
{10, 12, 45, 90}  插入23  {10, 12,  23, 45, 90}

扩容 + 定位
*/

public class Homework04{

	//编写一个main方法
	public static void main(String[] args) {
		/*
		1. 先确定，添加的数，应该插入到哪个索引
		2. 扩容
		*/

		int[] arr = {10, 12, 45, 90};
		int insertNum = 23;
		int index = -1;//索引，index就是要插入的位置

		//遍历 arr数组，如果发现 insertNum <= arr[i], 说明 i 就是要插入的位置
		//使用 index 保留 i
		//如果遍历后，没有发现 insertNum <= arr[i]， 说明 index = arr.length

		for(int i = 0; i < arr.length; i++){
			if(insertNum <= arr[i]){
				index = i;
				break;
			}
		}
		//判断 index 的值，
		if(index == -1){ //说明没有找到位置
			index = arr.length;
		}

		//扩容
		int[] arrNew = new int[arr.length + 1];
		//将arr的元素 拷贝 到 arrNew， 并且 跳过 index的位置
		for(int i = 0, j = 0; i < arrNew.length; i++){// i控制arrNew下标; j控制arr下标
			if(i == index) {
				arrNew[i] = insertNum;
			} else {
				arrNew[i] = arr[j];
				j++;
			}
		}
		arr = arrNew;
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}