//输出1-100之间的 不能被 5 整除的数，每5个一行

public class Homework06{

	//编写一个main方法
	public static void main(String[] args) {
		//使用count 统计输出的个数，如果 count % 5 =0 就说明输出了5个
		int count = 0;
		for(int i = 1; i <= 100; i++){
			if(i % 5 != 0) {
				System.out.print(i + "\t");
				count++;
				if(count % 5 == 0){
					System.out.println();
				}
			}
			
		}
	}
}