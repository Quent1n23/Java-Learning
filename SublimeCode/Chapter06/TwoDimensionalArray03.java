

public class TwoDimensionalArray03{

	//��дһ��main����
	public static void main(String[] args) {
		/*
		1
		2 2
		3 3 3

		һ��������һά���飬ÿ��һά�����Ԫ���ǲ�һ����
		*/


		int[][] arr = new int[10][];//���� ��ά���飬����ֻ��ȷ��һά����ĸ���

		for(int i = 0; i < arr.length; i++){
			//��ÿ��һά���鿪�ռ� new
			//���û�и�һά���� new����ôarr[i]����null
			arr[i] = new int[i + 1];

			//����һά���飬����һά�����ÿ��Ԫ�ظ�ֵ
			for(int j = 0; j < arr[i].length; j++){
				arr[i][j] = i + 1;//��ֵ

			}
		}

		//����arr���
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}