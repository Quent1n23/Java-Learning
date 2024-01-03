

public class Method02 {

	//编写一个main方法
	public static void main(String[] args) {
		
		//请遍历一个数组，输出数组的各个元素值
		int[][] map = {{0,0,1}, {1,1,1}, {1,1,3}};

		//使用方法完成
		//创建一个对象
		MyTools tool = new MyTools();
		//调用
		tool.printArr(map);
		tool.printArr(map);
		tool.printArr(map);


		//遍历map数组
		//传统方法
		// for(int i = 0; i < map.length; i++){
		// 	for(int j = 0; j < map[i].length; j++){
		// 		System.out.print(map[i][j] + " ");
		// 	}
		// 	System.out.println();
		// }
		
	}
}

//把输出的功能，写到一个类的方法中，然后调用该方法即可
class MyTools {
	//方法，接收一个二维数组
	public void printArr(int[][] arr){
		//对传入的二维数组遍历输出
		System.out.println("==========");
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}