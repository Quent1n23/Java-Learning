
import java.util.Scanner;

public class NestedExercise{

	//��дһ��main����
	public static void main(String[] args) {
		//��Ʊϵͳ�����ݵ��������·ݺ����䣬��ӡƱ��
		//4-10����
		//����18-60��60
		//��ͯ<18 �����30
		//����>60 �� 20
		//����
		//����40������20
		Scanner myScanner = new Scanner(System.in);
		System.out.println("�������·�");
		int month = myScanner.nextInt();
		System.out.println("����������");
		int age = myScanner.nextInt();

		

		if(month >= 4 && month <= 10) {
			//����
			System.out.println("������" + month + "�£�������");
			if(age >= 1 && age < 18) {
				System.out.println("��ͯ������Ʊ��Ϊ30Ԫ");
			}else if(age >= 18 && age <= 60) {
				System.out.println("���ˣ�����Ʊ��Ϊ60Ԫ");
			}else if(age > 60 && age <= 150) {
				System.out.println("���ˣ�����Ʊ��Ϊ20Ԫ");
			}else {
				System.out.println("����������������������");
			}
		}else if((month >= 1 && month <= 4) || (month >= 10 && month <= 12) ) {
			//����
			System.out.println("������" + month + "�£��ǵ���");
			if(age >= 18 && age <= 60) {
				System.out.println("���ˣ�����Ʊ��Ϊ40Ԫ");
			}else if((age >= 1 && age < 18) || (age > 60 && age <= 150) ) {
				System.out.println("���˻��߶�ͯ������Ʊ��Ϊ20Ԫ");
			}else {
				System.out.println("����������������������");
			}


		}else {
			System.out.println("������·ݴ�������������");
		}
		
	}
}