
import java.util.Scanner;

public class DoWhileExercise02{

	//��дһ��main����
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		char answer = ' ';
		
		do {
			System.out.println("�Ϻ�ʹ��������~");
			System.out.println("�Ϻ��ʣ���Ǯ��y/n");
			answer = myScanner.next().charAt(0);
			System.out.println("���Ļش��ǣ�" + answer);
		}while(answer != 'y');

		System.out.println("������Ǯ��");
		
	}
}