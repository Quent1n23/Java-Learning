/*
�ж�һ�������Ƿ���ˮ�ɻ���
��νˮ�ɻ�����ָһ�� 3λ���������λ���� ���� ������ �����䱾��
���磺153 = 1*1*1 + 3*3*3 + 5*5*5
*/
import  java.util.Scanner;
public class Homework04{

	//��дһ��main����
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������һ����λ��");
		int n = myScanner.nextInt();
		//int n = 123;
		// n%10 ��λ		
		//n/100 ��λ 
		//n/10/10 ʮλ		n % 100 / 10 ʮλ
		int n1 = n / 100;//��λ
		int n2 = n / 10 % 10;//ʮλ 153/10 = 15
		int n3 = n % 10;//��λ
		int sum = (n%10)*(n%10)*(n%10) + (n/10%10)*(n/10%10)*(n/10%10) + (n/100)*(n/100)*(n/100);

		if(n < 100 || n > 999){
			System.out.println( "�������");
		} else if(sum == n){
			System.out.println(n + "��ˮ����");
		} else {
			System.out.println(n + "����ˮ����");
		}

		
		 
	}
}