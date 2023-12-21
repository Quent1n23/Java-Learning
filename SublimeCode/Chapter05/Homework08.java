
//求出 1 - 1/2 + 1/3 - 1/4 ...... 1/100的和
public class Homework08{

	//编写一个main方法
	public static void main(String[] args) {
		double sum = 0;
		//int count = 1; 没必要
		for(int i = 1; i <= 100; i++){
			if(i % 2 != 0){//分母是奇数 +
				sum += 1.0/i;
			} else {//分母是偶数 -
				sum -= 1.0/i;
			}
		}
		System.out.println(sum);
		
	}
}