//�ж�����
//��1��4�ı��������Ҳ���100�ı�����  
//��2����400�ı���
import  java.util.Scanner;
public class Homework03{

	//��дһ��main����
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("���������");
		int year = myScanner.nextInt();
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			System.out.println(year + "������");
		}else{
			System.out.println(year + "��������");
		}
	}
}