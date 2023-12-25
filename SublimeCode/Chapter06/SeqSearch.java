//顺序查找
import java.util.Scanner;

public class SeqSearch{

	//编写一个main方法
	public static void main(String[] args) {
		//白眉鹰王，金毛狮王，紫衫龙王，青翼蝠王

		String[] names = {"白眉鹰王", "金毛狮王", "紫衫龙王", "青翼蝠王"};
		Scanner myScanner = new Scanner(System.in);
		System.out.println("请输入名字");
		String findName = myScanner.next();

		//遍历数组，逐一比较，
		//编程思想/技巧 index/isFlag 标识符
		int index = -1;
		for(int i = 0; i < names.length; i++) {
			if(findName.equals(names[i])) {
				System.out.println("恭喜找到" + findName);
				System.out.println("下标 = " + i);
				index = i;
				break;	
			}
		}
		if(index == -1){//没有找到
			System.out.println("sorry,没有找到");
		}
	}
}