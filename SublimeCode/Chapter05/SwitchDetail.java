

public class SwitchDetail{

	//编写一个main方法
	public static void main(String[] args) {
		
		//switch(表达式) 表达式的返回值必须是：byte,short,int,char,enum,String
		//case子句中的值必须是常量，而不能是变量
		//default子句是可选的
		char c = 'a';
		switch(c) {
			case 'a' :
				System.out.println("ok1");
				break;
			case 'b' : 
				System.out.println("ok2");
				break;
			default :
				System.out.println("ok3");
			


		}
	}
}