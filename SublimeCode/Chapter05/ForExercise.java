

public class ForExercise{

	//编写一个main方法
	public static void main(String[] args) {
		//打印1~100之间所有9的倍数的整数，统计个数，及 总和【化繁为简，先死后活】
		//先死后活：先考虑固定的值，然后转成可以灵活变化的值
		/*
		1. 完成输出1-100的值
		2. 在输出的过程中，进行过滤，只输出9的倍数
		3. 统计个数，定义一个变量 int count = 0; 当 条件满足时 count++
		4. 总和，定义一个变量 int sum = 0; 当条件满足时累计 sum += i;

		1. 为了适应更好的需求，把范围的开始值 和 结束值 ，做成变量
		2. 还可以更进一步 9的倍数 也做成变量 int t = 9;
		*/
		int count = 0;
		int sum = 0;
		int start = 1;
		int end = 100;
		int t = 9;//倍数
		for(int i = start; i <= end; i++){
			if(i % t ==0){
				System.out.println("i=" + i);
				count++;
				sum += i;
			}
			
		}
		System.out.println("count=" + count);
		System.out.println("sum=" + sum);
	}
}