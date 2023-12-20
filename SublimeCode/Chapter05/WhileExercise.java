

public class WhileExercise{

	//编写一个main方法
	public static void main(String[] args) {
		int i = 1;
		while(i <= 100){
			if(i % 3 == 0){
				System.out.println(i);
			}	
			i++;
		}
		int num = 40;
		while(num <= 200){
			if(num % 2 == 0){
				System.out.println(num);
			}
			num++;
		}
	}
}