
//标签, 实际开发中，尽量不用标签
//break 默认跳出 最近的循环体

public class BreakDetail{

	//编写一个main方法
	public static void main(String[] args) {
		
		abc1:
		for(int j = 0; j < 4; j++){//外层for
		abc2:
			for(int i = 0; i < 10; i++){//内层for
				if(i == 2){
					break;// 等价 break abc2
				}
				System.out.println("i=" + i);
			}
		}
		
	}
}