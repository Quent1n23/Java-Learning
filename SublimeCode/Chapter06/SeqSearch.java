//˳�����
import java.util.Scanner;

public class SeqSearch{

	//��дһ��main����
	public static void main(String[] args) {
		//��üӥ������ëʨ����������������������

		String[] names = {"��üӥ��", "��ëʨ��", "��������", "��������"};
		Scanner myScanner = new Scanner(System.in);
		System.out.println("����������");
		String findName = myScanner.next();

		//�������飬��һ�Ƚϣ�
		//���˼��/���� index/isFlag ��ʶ��
		int index = -1;
		for(int i = 0; i < names.length; i++) {
			if(findName.equals(names[i])) {
				System.out.println("��ϲ�ҵ�" + findName);
				System.out.println("�±� = " + i);
				index = i;
				break;	
			}
		}
		if(index == -1){//û���ҵ�
			System.out.println("sorry,û���ҵ�");
		}
	}
}