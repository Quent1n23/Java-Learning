//2. ʵ���ж�һ�������������ĸ���Χ������0  С��0  ���� 0
import  java.util.Scanner;

public class Homework02{

	//��дһ��main����
	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		System.out.println("������һ������");
		int n = myScanner.nextInt();
		if(n > 0){
			System.out.println(n + " > 0");
		} else if(n == 0) {
			System.out.println(n + " = 0");
		} else if(n < 0) {
			System.out.println(n + " < 0");
		} else{//���� �ַ� ���� �ַ��� ʱ�� ���׳��쳣���������elseҲ��
			System.out.println("�����������������");
		}
		
	}
}