

public class BreakExercise{

	//编写一个main方法
	public static void main(String[] args) {
		//1-100以内的数 求和 ， 求出 当 和 第一次大于20 的 当前数
		int sum = 0;
		for(int i = 1; i <= 100; i++){
			sum +=  i;
			if(sum > 20){
				System.out.println("和 >20 时，当前数 i=" + i);
				break;
			}
		}
		
	}
}