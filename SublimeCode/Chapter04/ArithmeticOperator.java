
/**
	��ʾ�����������ʹ��
*/

public class ArithmeticOperator{

	//��дһ��main����
	public static void main(String[] args) {
		// /ʹ��
		System.out.println(10 / 4); //����ѧ������2.5��java�� 2
		System.out.println(10.0 / 4); //java����2.5

		double d = 10 / 4; //java�� 10 / 4 = 2 => 2.0
		System.out.println(d); // 2.0

		// % ȡģ��ȡ����
		// % �ı��ʣ���һ����ʽ a % b = a - a / b * b
		System.out.println(10 % 3); //1
		System.out.println(-10 % 3); //-1
		System.out.println(10 % -3); //1
		System.out.println(-10 % -3); //-1

		//++ ��ʹ��

		int i = 10;
		i++;
		++i;
		System.out.println("i=" + i);//12

		/*
		��Ϊ���ʽʹ��
		ǰ++�� ++i ������ ��ֵ
		��++�� i++ �ȸ�ֵ ������
		*/

		int j = 8;
		//int k = ++j; // j = j+1; k=j
		int k = j++; // k = j; j = j+1
		System.out.println("k=" + k + "j=" + j);

	}
}