import java.util.Scanner;

public class BreakExercise02{

	//编写一个main方法
	public static void main(String[] args) {
		//实现登录验证，有3次机会

		Scanner myScanner = new Scanner(System.in);
		String name = "";
		String passwd = "";
		int chance = 3;//登录一次，失败就减少一次
		for(int i = 3; i<=3; i--) {
			System.out.println("请输入名字");
			name = myScanner.next();
			System.out.println("请输入密码");
			passwd = myScanner.next();
			//字符串的比较 ，使用的方法 是 equals
			//String name = "林黛玉";
			//System.out.println(name.equals("林黛玉"));T
			//System.out.println("林黛玉".equals(name));T  推荐，可以避免空指针
			if("丁真".equals(name) && "666".equals(passwd)){
				System.out.println("恭喜你，登录成功~");
				break;
			}
			chance--;
			System.out.println("你还有" + chance + "次登录机会");
		}
		
	}
}