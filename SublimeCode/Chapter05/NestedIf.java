
import java.util.Scanner;

public class NestedIf{

	//编写一个main方法
	public static void main(String[] args) {
		//接收字符： char gender = scanner.next().charAt(0)
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入该歌手的成绩");
		double score = myScanner.nextDouble();
		if(score > 8.0 ) {
			System.out.println("请输入性别");
			char gender = myScanner.next().charAt(0);
			if( gender == '男') {
				System.out.println("进入男子组");
			} else if(gender == '女') {
				System.out.println("进入女子组");
			} else {
				System.out.println("你的性别有误，不能进入决赛");
			}
		} else {
			System.out.println("sorry,你被淘汰了~");
		}
	}
}