//���鷴ת
//����ֵ

public class ArrayReverse02{

	//��дһ��main����
	public static void main(String[] args) {
		
		int[] arr = {11, 22, 33, 44, 55, 66};
		int[] arr2 = new int[arr.length];
		for(int i = 0; i < arr.length; i++){
			arr2[i] = arr[arr.length-1-i];
		}

		//�� arr ָ�� arr2 ���ݿռ䣬��ʱ arr ԭ�������ݿռ��û�б�������
		//�ᱻ��������������
		arr = arr2;
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
		
	}
}