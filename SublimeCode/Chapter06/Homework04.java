/*
��֪�������飬Ҫ�����һ��Ԫ�أ���Ȼ������
{10, 12, 45, 90}  ����23  {10, 12,  23, 45, 90}

���� + ��λ
*/

public class Homework04{

	//��дһ��main����
	public static void main(String[] args) {
		/*
		1. ��ȷ������ӵ�����Ӧ�ò��뵽�ĸ�����
		2. ����
		*/

		int[] arr = {10, 12, 45, 90};
		int insertNum = 23;
		int index = -1;//������index����Ҫ�����λ��

		//���� arr���飬������� insertNum <= arr[i], ˵�� i ����Ҫ�����λ��
		//ʹ�� index ���� i
		//���������û�з��� insertNum <= arr[i]�� ˵�� index = arr.length

		for(int i = 0; i < arr.length; i++){
			if(insertNum <= arr[i]){
				index = i;
				break;
			}
		}
		//�ж� index ��ֵ��
		if(index == -1){ //˵��û���ҵ�λ��
			index = arr.length;
		}

		//����
		int[] arrNew = new int[arr.length + 1];
		//��arr��Ԫ�� ���� �� arrNew�� ���� ���� index��λ��
		for(int i = 0, j = 0; i < arrNew.length; i++){// i����arrNew�±�; j����arr�±�
			if(i == index) {
				arrNew[i] = insertNum;
			} else {
				arrNew[i] = arr[j];
				j++;
			}
		}
		arr = arrNew;
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}