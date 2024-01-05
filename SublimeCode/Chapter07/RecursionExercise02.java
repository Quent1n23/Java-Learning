

public class RecursionExercise02{

	//编写一个main方法
	public static void main(String[] args) {
		T t1 = new T();
		int day = 1;
		int res = t1.peach(day);
		if(res != -1) {
			System.out.println("第" +day+ "天有" +res+ "个桃子");
		}
		
		
	}
}
		/*
		猴子吃桃子问题：有一堆桃子，猴子第一天吃了其中的一半，并再多吃了一个
		以后每天猴子都吃其中的一半，然后再多吃一个。
		当到第10天时，想再吃时（即还没吃），发现只有一个桃子了。
		问题：最初共多少个桃子

		思路分析 逆推
		1. day = 10 时，有 1 个桃子
		2. day = 9 时， 有 (day10 + 1) * 2 = 4
		3. day = 8 时， 有 (day9 + 1) * 2 = 10
		4. 规律 前一天的桃子 = (后一天的桃子 + 1) * 2
		5. 递归
		*/
class T{
	public int peach(int day) {
		if(day == 10){
			return 1;
		} else if(day >= 1 && day <= 9) {
			return (peach(day+1) + 1) * 2;
		} else {
			System.out.println("day在 1-10");
			return -1;
		}
	}
}
