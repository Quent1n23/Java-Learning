
/*
���һ������int[]�����ֵ{4��-1��9��10��23} ���õ���Ӧ���±�
*/
public class ArrayExercise02{

	//��дһ��main����
	public static void main(String[] args) {
		int[] arr = {4, -1, 9, 10, 23};
		int index = 0;
		int max = arr[0];//���� ��һ��Ԫ�������ֵ
		for(int i = 1; i < arr.length; i++){//���±� 1 ��ʼ����
			if(arr[i] > max){
				max = arr[i];
				index = i;
			}
		}
		System.out.println("���ֵΪ��" + max + "\n�±�Ϊ��" + index);
		
	}
}