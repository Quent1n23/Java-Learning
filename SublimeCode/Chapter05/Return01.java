//return 用在方法时，表示跳出方法，如果用在main方法`，表示退出程序

public class Return01{

	//编写一个main方法
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++){
			if(i == 3) {
				System.out.println("韩顺平教育" + i);
				// break;
				// continue;
				return;//这里时在main里
			}
			System.out.println("hello");
		}
		System.out.println("go on ...");
	}
}