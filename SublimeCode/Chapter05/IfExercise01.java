//����֧��˫��֧����ϰ

public class IfExercise01{

	//��дһ��main����
	public static void main(String[] args) {
		
		double d1 = 34.5;
		double d2 = 2.6;
		if(d1 > 10.0 && d2 < 20.0){
			System.out.println("��������=" + (d1 + d2));
		}

		int num1 = 10;
		int num2 = 5;
		int sum = num1 + num2;
		if(sum % 3 == 0 && sum % 5 ==0){
			System.out.println("�Ϳ��Ա�3���ܱ�5����");
		} else {
			System.out.println("�Ͳ��ܱ�3���ܱ�5����");
		}


		//�ж�����
		int year = 2023;
		if( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
			System.out.println(year + "�� ����");
		}else {
			System.out.println(year + "���� ����");
		}
	}
}