//��ά����

public class TwoDimensionalArray01{

	//��дһ��main����
	public static void main(String[] args) {
		//�Ӷ�����ʽ�Ͽ� int[][]

		int[][] arr = { {0, 0, 0, 0, 0, 0}, 
						{0, 0, 1, 0, 0, 0}, 
						{0, 2, 0, 3, 0, 0},
						{0, 0, 0, 0, 0, 0} };

		System.out.println("��ά�����Ԫ�ظ���= " + arr.length);

		

		//�����άͼ��
		for(int i = 0; i < arr.length; i++) {//������ά�����ÿ��һά����

			//arr[i].length ��Ӧ��ÿ��һά����ĳ���
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");//���һά����
			}
			System.out.println();//����
		}
	}
}