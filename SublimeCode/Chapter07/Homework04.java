

public class Homework04 {
	//编写一个main方法
	public static void main(String[] args) {
		int[] oldArr = {10, 30, 50};
		A04 a04 = new A04();
		int[] newArr = a04.copyArr(oldArr);
		System.out.println("返回的新数组");
		for(int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i]+" ");
		}
		
	}
}

class A04 {
	//实现数组的复制功能 
	public int[] copyArr(int[] oldArr) {
		int[] newArr = new int[oldArr.length];
		for(int i = 0; i < oldArr.length; i++) {
			newArr[i] = oldArr[i];
		}

		return newArr;
	}
}