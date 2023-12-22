//数组缩减
//{1,2,3,4,5}
//提示用户是否继续缩减，每次缩减最后的元素
//当只剩下最后一个元素时，提示，不能再缩减
import java.util.Scanner;
public class ArrayReduce{

	//编写一个main方法
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		Scanner myScanner = new Scanner(System.in);
		System.out.println("当前数组为");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}

		do{
			//长度不够，结束
			if(arr.length == 1){
				System.out.println();
				System.out.println("数组只剩一个元素，不能继续缩减");
				break;
			}

			//继续缩减？
			System.out.println();
			System.out.println("是否缩减？y/n");
			char key = myScanner.next().charAt(0);
			if(key == 'n'){
				break;
			}

			int[] arr2 = new int[arr.length - 1];
			for(int i = 0; i < arr2.length; i++){
				arr2[i] = arr[i];
			}
			arr = arr2;
			System.out.println("缩减后数组为");
			for(int i = 0; i < arr.length; i++){
				System.out.print(arr[i] + " ");
			}
			
			
		}while(true);

		System.out.println("退出~");
		
	}
}