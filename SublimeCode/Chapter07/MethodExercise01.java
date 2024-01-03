

public class MethodExercise01{

	//编写一个main方法
	public static void main(String[] args) {
		
		AA a = new AA();
		// if(a.isOdd(1)) {
		// 	System.out.println("是奇数");
		// } else {
		// 	System.out.println("是偶数");
		// }
		a.print(4,4,'*');
		
	}
}

//编写类AA，有一个方法：判断一个数是奇数odd还是偶数，返回boolean
class AA {

	public boolean isOdd(int num) {
		// if(num % 2 != 0){
		// 	return true;
		// } else {
		// 	return false;
		// }

		//return num % 2 != 0 ? true : false;
		//
		return num % 2 != 0;
	}

	//根据 行、列、字符 打印 对应行数和列数的字符
	//比如：行：4，列：4，字符#，则打印相应的效果

	//
	//思路
	//1. 返回类型 void
	//2. 方法名字 print
	//3. 形参 (int row, int col, char c)
	//4. 方法体：循环
	public void print(int row, int col, char c) {
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= col; j++){//输出每一行
				System.out.print(c);
			}
			System.out.println();//换行
		}
	}
}