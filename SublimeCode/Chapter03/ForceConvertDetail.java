public class ForceConvertDetail{

	public static void main(String[] args) {

		//强转符号只针对于最近的操作数有效
		//int x = (int)10*3.5+6*1.5;//编译错误
		int x = (int)(10*3.5+6*1.5);
		System.out.println(x);

		char c1 = 100;
		int m = 100;
		//char c2 = m;//错误
		char c3 = (char)m;
		System.out.println(c3);//100对应的字符，d
	}
}