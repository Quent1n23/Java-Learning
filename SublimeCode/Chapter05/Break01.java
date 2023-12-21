
//break 跳出循环

public class Break01{

	//编写一个main方法
	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			if(i == 3){
				break;
			}
			System.out.println("i=" + i);
		}
		
	}
}