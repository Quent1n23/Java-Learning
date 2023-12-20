

public class ForDetail{

	//编写一个main方法
	public static void main(String[] args) {
		// int i = 1;
		// for( ; i <= 10; ){
		// 	System.out.println("你好，韩顺平教育" + i);
		// 	i++;
		// }
		// System.out.println("i=" + i); //11

		// for(;;){//死循环
		// 	System.out.println("ok");
		// }
		int count = 3;
		for (int i = 0,j = 0; i < count; i++, j += 2){
			System.out.println("i=" + i + " j=" + j);
		}

	}
}