//标签使用

public class ContinueDetail{

	//编写一个main方法
	public static void main(String[] args) {
		
		label1:
		for(int j = 0; j < 4; j++) {
			
			label2:
			for(int i = 0; i < 10; i++) {
				if(i == 2){
					//continue;//等价 continue label2
					continue label1;
				}
				System.out.print("i = " + i + "\t");
			}
			System.out.println();
		}
	}
}