//д�� ð������Ĵ���

public class Homework07{

	//��дһ��main����
	public static void main(String[] args) {

		//ð������
		//Ҫ���С����
		int[] arr = {20, -1, 5, 123, 12, 68, };
		int temp = 0;
		for(int i = 0; i < arr.length-1; i++){//���ѭ�������ֱȽ�
			for(int j = 0; j < arr.length-1-i; j++){//ÿ�ֵıȽϴ���
				if(arr[j] > arr[j+1]){
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

		for(int i = 0;  i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}
		
	}
}