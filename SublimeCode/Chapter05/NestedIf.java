
import java.util.Scanner;

public class NestedIf{

	//��дһ��main����
	public static void main(String[] args) {
		//�����ַ��� char gender = scanner.next().charAt(0)
		Scanner myScanner = new Scanner(System.in);
		System.out.println("������ø��ֵĳɼ�");
		double score = myScanner.nextDouble();
		if(score > 8.0 ) {
			System.out.println("�������Ա�");
			char gender = myScanner.next().charAt(0);
			if( gender == '��') {
				System.out.println("����������");
			} else if(gender == 'Ů') {
				System.out.println("����Ů����");
			} else {
				System.out.println("����Ա����󣬲��ܽ������");
			}
		} else {
			System.out.println("sorry,�㱻��̭��~");
		}
	}
}