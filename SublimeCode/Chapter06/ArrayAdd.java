//�������/��������
import java.util.Scanner;
public class ArrayAdd{

	//��дһ��main����
	public static void main(String[] args) {
		/*
		1. ԭʼ���� ʹ�þ�̬���� {1,2,3}
		2. ����Ԫ��4�� ֱ�ӷ������������{1,2,3,4}
		3. �û�����ͨ�����·�ʽ�������Ƿ������ӣ� ��ӳɹ����Ƿ������y/n
		*/
		Scanner myScanner = new Scanner(System.in);
		int[] arr = {1,2,3};

		do{
			int[] arrNew = new int[arr.length + 1];
			for(int i = 0; i < arr.length; i++){
				arrNew[i] = arr[i];
			}

			System.out.println("=====����һ��Ԫ��=====");
			int addNum =  myScanner.nextInt();
			arrNew[arrNew.length - 1] = addNum;
			arr =  arrNew;
			//���arr
			System.out.println("=====arr���ݺ�=====");
			for(int i = 0; i < arr.length; i++){
				System.out.print(arr[i] + " ");
			}
			//������ӣ�
			System.out.println("��ӳɹ����Ƿ������y/n");
			char key = myScanner.next().charAt(0);
			if('n' == key){
				break;
			}
			// if('n' == myScanner.next().charAt(0) ){
			// 	break;
			// }
		}while(true);
		
		System.out.println("���˳����~");
		
	}
}