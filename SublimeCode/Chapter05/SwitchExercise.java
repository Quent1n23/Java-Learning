
import java.util.Scanner;

public class SwitchExercise{

	//��дһ��main����
	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		//1.
		// System.out.println("������һ���ַ�(a-e)");
		// char ch = myScanner.next().charAt(0);
		// switch(ch){
		// 	case 'a' :
		// 	System.out.println((char)(ch - 32));
		// 	break;
		// 	case 'b' :
		// 	System.out.println((char)(ch - 32));
		// 	break;
		// 	case 'c' :
		// 	System.out.println("C");
		// 	break;
		// 	case 'd' :
		// 	System.out.println("D");
		// 	break;
		// 	case 'e' :
		// 	System.out.println("E");
		// 	break;
		// 	default :
		// 	System.out.println("�����������");
		// }

		//2.
		//�ɼ�����60������ϸ񣬵���60��������ϸ񡣣����ܴ���100����ʾ���ɼ�/60
		//ʹ��switch
		//��Ҫ����ת����
		//����60  (int)(�ɼ�/60) = 1

		// double score = 188.5;
		// if(score >= 0 && score <= 100) {
		// 	switch((int)(score / 60)) {
		// 		case 0 :
		// 			System.out.println("������");
		// 			break;
		// 		case 1 :
		// 			System.out.println("����");
		// 			break;
		// 		// default :
		// 		// ��������	
		// 	}
		// } else {
		// 	System.out.println("��������");
		// }
		
		

		//3.
		//345������678�ļ���9��10��11�＾��12��1��2����
		//ʹ�ô�͸

		System.out.println("�����·�");
		int month = myScanner.nextInt();
		switch(month) {
			case 3:
			case 4:
			case 5:
				System.out.println("���Ǵ���");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("�����ļ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("�����＾");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("���Ƕ���");
				break;
			default :
				System.out.println("������·ݲ���");
		}
	}
}