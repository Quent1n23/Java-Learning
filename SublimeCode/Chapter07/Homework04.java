

public class Homework04 {
	//��дһ��main����
	public static void main(String[] args) {
		int[] oldArr = {10, 30, 50};
		A04 a04 = new A04();
		int[] newArr = a04.copyArr(oldArr);
		System.out.println("���ص�������");
		for(int i = 0; i < newArr.length; i++) {
			System.out.print(newArr[i]+" ");
		}
		
	}
}

class A04 {
	//ʵ������ĸ��ƹ��� 
	public int[] copyArr(int[] oldArr) {
		int[] newArr = new int[oldArr.length];
		for(int i = 0; i < oldArr.length; i++) {
			newArr[i] = oldArr[i];
		}

		return newArr;
	}
}