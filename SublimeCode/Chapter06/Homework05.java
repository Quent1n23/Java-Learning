

public class Homework05{

	//��дһ��main����
	public static void main(String[] args) {
		/*
		�������10������ 1-100 ���浽����
		�� �����ӡ  ��ƽ��ֵ  ���ֵ����Сֵ���±�
		�� ���������Ƿ��� 8
		*/
		
		int[] arr = new int[10];
		//���������
		for(int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println("=====arr��Ԫ�����=====");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + "\t");
		}

		System.out.println("\n=====�����ӡ=====");
		for(int i = arr.length-1; i >= 0; i--){
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		//ƽ��ֵ�� ���ֵ ��Сֵ���±�

		double sum = arr[0];
		int max = arr[0];
		int maxIndex = 0;
		for(int i = 1; i < arr.length; i++){
			sum += arr[i];//�ۼƺ�

			if(max < arr[i]){//�����ֵ
				max = arr[i];
				maxIndex = i;
			}
		}
		System.out.println("max=" + max + "\t���ֵ�±�=" + maxIndex);
		System.out.println("ƽ��ֵ=" + (sum / arr.length)  );

		//�����������Ƿ��� 8 ��ʹ��˳�����
		int findNum = 8;
		int index = -1;
		for(int i = 0; i < arr.length; i++){
			if(findNum == arr[i]){
				System.out.println("�ҵ�������"+ findNum + ",�±�Ϊ " + i);
				index = i;
				break;
			}
		}

		//û�ҵ�8
		if(index == -1){
			System.out.println("û���ҵ�����"+ findNum );
		}

	}
}