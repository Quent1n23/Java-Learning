/*
创建一个char类型的26个元素的数组，分别放置 'A'-'Z'
使用for循环访问所有元素并 打印出来
*/

public class ArrayExercise01{

	//编写一个main方法
	public static void main(String[] args) {
		char[] chars = new char[26];
		for(int i = 0; i < chars.length; i++){
			chars[i] = (char)('A' + i);
		}

		for(int i = 0; i < chars.length; i++){
			System.out.print(chars[i] + " ");
		}
		
	}
}