//if-else��������

import java.util.Scanner;

public class If02{

	//��дһ��main����
	public static void main(String[] args) {
		//��дһ�����򣬿��������˵����䣬�����ͬ־���������18��
		//�����������������18��Ҫ���Լ�����Ϊ�������������
		//����������䲻����ηŹ����ˡ�
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�������������");
		int age = myScanner.nextInt();
		if(age > 18){
			System.out.println("����������18��Ҫ���Լ�����Ϊ�����������");
		} else{//˫��֧
			System.out.println("������䲻����ηŹ�����");
		}

		System.out.println("�������");
	}
}