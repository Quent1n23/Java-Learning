//输出a-z 以及 Z-A

public class Homework07{

	//编写一个main方法
	public static void main(String[] args) {
		// char ch = 'a';
		// for(int i = 0; i < 26; i++){
		// 	System.out.print((char)(ch + 1));bbbbbbbbbbbb
		// }
		for(char c1 = 'a'; c1 <= 'z'; c1++ ){
			System.out.print(c1 + " ");
		}
		System.out.println();
		for(char c2 = 'Z'; c2 >= 'A'; c2--){
			System.out.print(c2 + " ");
		}
	}
}