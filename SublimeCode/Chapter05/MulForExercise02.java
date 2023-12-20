//99乘法表

public class MulForExercise02{

	//编写一个main方法
	public static void main(String[] args) {
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(j + "*" + i + "=" + i*j  + "\t");
			}
			System.out.println();
		}
		
	}
}