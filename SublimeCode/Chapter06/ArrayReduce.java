//��������
//{1,2,3,4,5}
//��ʾ�û��Ƿ����������ÿ����������Ԫ��
//��ֻʣ�����һ��Ԫ��ʱ����ʾ������������
import java.util.Scanner;
public class ArrayReduce{

	//��дһ��main����
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		Scanner myScanner = new Scanner(System.in);
		System.out.println("��ǰ����Ϊ");
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}

		do{
			//���Ȳ���������
			if(arr.length == 1){
				System.out.println();
				System.out.println("����ֻʣһ��Ԫ�أ����ܼ�������");
				break;
			}

			//����������
			System.out.println();
			System.out.println("�Ƿ�������y/n");
			char key = myScanner.next().charAt(0);
			if(key == 'n'){
				break;
			}

			int[] arr2 = new int[arr.length - 1];
			for(int i = 0; i < arr2.length; i++){
				arr2[i] = arr[i];
			}
			arr = arr2;
			System.out.println("����������Ϊ");
			for(int i = 0; i < arr.length; i++){
				System.out.print(arr[i] + " ");
			}
			
			
		}while(true);

		System.out.println("�˳�~");
		
	}
}