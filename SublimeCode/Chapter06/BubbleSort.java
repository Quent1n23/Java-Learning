//ð������

public class BubbleSort{

	//��дһ��main����
	public static void main(String[] args) {
		int[] arr = {24, 69, 80, 57, 13, -1, 200, 110, 30};
		int temp = 0;

		for(int i = 0; i < arr.length-1; i++){//���ѭ����4��

			for(int j = 0; j < arr.length-1 - i; j++){//4�αȽ�
			//���ǰ����� > ��������� �ͽ���
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}

			System.out.println("\n===��" + (i+1) + "��===");
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[j] + "\t");
			}
		}

		
	}
}