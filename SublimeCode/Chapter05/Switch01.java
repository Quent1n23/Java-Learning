
import java.util.Scanner;

public class Switch01{

	//��дһ��main����
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������һ���ַ�a-g");
		char c1 = myScanner.next().charAt(0);
		//��java�У�ֻҪ����ֵ���أ�����һ�����ʽ
		switch(c1) {
			case 'a' :
				System.out.println("��������һ�����Ӵ�����");
				break;
			case 'b' :
				System.out.println("�������ڶ������ӵ�С��");
				break;
			case 'c' :
				System.out.println("������������������ѩɽ");
				break;
			//......
			default :
				System.out.println("��������ַ�����ȷ��û��ƥ���");

		}
		System.out.println("�˳���switch,����ִ�г���");
	}
}