

public class Homework01{

	//编写一个main方法
	public static void main(String[] args) {
		/* 
		某人 有100,000元，每经过一次路口，需要交费，规则如下：
		1. 当现金 > 50000时，每次交 5%
		2. 当现金 <= 50000时，每次交1000
		计算该人可以经过多少次路口，要求：使用 while + break
		*/
		
		double money = 100000;
		int count = 0;

		// while(money > 50000) {
		// 	money = money * 0.95;
		// 	count++;
		// 	if(money <= 50000) {
		// 		break;
		// 	}
		// }
		// while(money >=  1000 ){
		// 	money = money - 1000;
		// 	count++;
		// }
		while(true){
			if(money > 50000){//过路口
				money *= 0.95;//过了这个路口，还有这么多钱
				count++;
			} else if(money >= 1000){
				money -= 1000;
				count ++;
			} else {//钱不够1000
				break;
			}
		}

		System.out.println("经过了"+ count +"次路口");
		System.out.println("剩余" + money);
	}
}