//���鷴ת

public class ArrayReverse{

	//��дһ��main����
	public static void main(String[] args) {
		
		int[] arr = {11, 22, 33, 44, 55, 66};
		//�Ż�
		//tempд������	length����
		int temp = 0;
		int len = arr.length;
		for(int i = 0; i < len/2; i++){
			temp = arr[i];
			arr[i] = arr[len- 1 - i];
			arr[len- 1 - i] = temp;
		}
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
}