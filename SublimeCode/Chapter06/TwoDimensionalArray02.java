//��ά����
//��̬��ʼ��
/*

*/

public class TwoDimensionalArray02{

	//��дһ��main����
	public static void main(String[] args) {
		//int arr[][] = new int[2][3];��һ�ַ�ʽ
		//�ڶ��ַ�ʽ
		int arr[][];//������
		arr = new int[2][3];//�ٿ��ٿռ�
		arr[1][1] = 8;

		//����arr����
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}