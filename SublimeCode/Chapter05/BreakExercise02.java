import java.util.Scanner;

public class BreakExercise02{

	//��дһ��main����
	public static void main(String[] args) {
		//ʵ�ֵ�¼��֤����3�λ���

		Scanner myScanner = new Scanner(System.in);
		String name = "";
		String passwd = "";
		int chance = 3;//��¼һ�Σ�ʧ�ܾͼ���һ��
		for(int i = 3; i<=3; i--) {
			System.out.println("����������");
			name = myScanner.next();
			System.out.println("����������");
			passwd = myScanner.next();
			//�ַ����ıȽ� ��ʹ�õķ��� �� equals
			//String name = "������";
			//System.out.println(name.equals("������"));T
			//System.out.println("������".equals(name));T  �Ƽ������Ա����ָ��
			if("����".equals(name) && "666".equals(passwd)){
				System.out.println("��ϲ�㣬��¼�ɹ�~");
				break;
			}
			chance--;
			System.out.println("�㻹��" + chance + "�ε�¼����");
		}
		
	}
}