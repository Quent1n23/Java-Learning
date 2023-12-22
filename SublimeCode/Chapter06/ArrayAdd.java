//数组添加/数组扩容
import java.util.Scanner;
public class ArrayAdd{

	//编写一个main方法
	public static void main(String[] args) {
		/*
		1. 原始数组 使用静态分配 {1,2,3}
		2. 增加元素4， 直接放在数组最后面{1,2,3,4}
		3. 用户可以通过如下方式来决定是否继续添加： 添加成功，是否继续？y/n
		*/
		Scanner myScanner = new Scanner(System.in);
		int[] arr = {1,2,3};

		do{
			int[] arrNew = new int[arr.length + 1];
			for(int i = 0; i < arr.length; i++){
				arrNew[i] = arr[i];
			}

			System.out.println("=====增加一个元素=====");
			int addNum =  myScanner.nextInt();
			arrNew[arrNew.length - 1] = addNum;
			arr =  arrNew;
			//输出arr
			System.out.println("=====arr扩容后=====");
			for(int i = 0; i < arr.length; i++){
				System.out.print(arr[i] + " ");
			}
			//继续添加？
			System.out.println("添加成功，是否继续？y/n");
			char key = myScanner.next().charAt(0);
			if('n' == key){
				break;
			}
			// if('n' == myScanner.next().charAt(0) ){
			// 	break;
			// }
		}while(true);
		
		System.out.println("已退出添加~");
		
	}
}