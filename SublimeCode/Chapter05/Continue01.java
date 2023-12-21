//continue 用于结束本次循环，继续执行下一次循环

public class Continue01{

	//编写一个main方法
	public static void main(String[] args) {
		int i = 1;
		while(i <= 4) {
			i++;
			if(i == 2){
				continue;
			}
			System.out.println("i=" + i);
		}
		
	}
}