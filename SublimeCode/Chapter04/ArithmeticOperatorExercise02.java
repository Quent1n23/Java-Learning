//������ϰ


public class ArithmeticOperatorExercise02{

	//��дһ��main����
	public static void main(String[] args) {
		/*
		1.����
		���绹��59��ż٣��ϼ������ڼ���
		2.˼·����
		(1) ʹ��int ���� days ���� ����
		(2) һ��������7�� �������� days / 7  ��xx�죺 days % 7
		(3) ���
		3.����
		*/

		int days = 59;
		int weeks = days / 7;
		int leftDays = days % 7;
		System.out.println(days + "��  ��" + weeks + "������" + leftDays + "��");


		/*
		1.����
		����һ���������滪���¶ȣ������¶�ת�������¶ȵĹ�ʽΪ��
		 5/9*�������¶�-100��������������¶ȶ�Ӧ�������¶�

		2.˼·����
		(1) �ȶ���һ��double huaShi ���� ���� �����¶�
		(2) ���ݸ����Ĺ�ʽ�����м���
			���ǵ���ѧ��ʽ��java���Ե�����
		(3) ���õ��Ľ�����浽double sheShi
		3.����
		*/

		double huaShi = 234.6;
		double sheShi = 5.0 / 9 * (huaShi - 100);
		System.out.println("�����¶�" + huaShi + "��Ӧ�������¶�=" + sheShi);
		
	}
}