
import java.util.Scanner;
public class If03{

	//��дһ��main����
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("���������÷�:");

		//�������Ĳ�������������hello
		//������ �쳣������� �㶨
		int grade = myScanner.nextInt();

		//�ȶ���������÷֣�����һ����Χ����Ч�ж� 1-100��������ʾ�������

		if(grade >=1 && grade <= 100){

			if(grade == 100){
				System.out.println("���ü���");
			} else if(grade > 80 && grade <= 90){
				System.out.println("��������");
			} else if(grade >= 60 && grade <= 80){
				System.out.println("����һ��");
			} else{
				System.out.println("���ò�����");
			}
		}else {
			System.out.println("���÷���Ҫ��1-100������������:)");
		}
		
	}
}