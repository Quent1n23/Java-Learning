

public class RecursionExercise02{

	//��дһ��main����
	public static void main(String[] args) {
		T t1 = new T();
		int day = 1;
		int res = t1.peach(day);
		if(res != -1) {
			System.out.println("��" +day+ "����" +res+ "������");
		}
		
		
	}
}
		/*
		���ӳ��������⣺��һ�����ӣ����ӵ�һ��������е�һ�룬���ٶ����һ��
		�Ժ�ÿ����Ӷ������е�һ�룬Ȼ���ٶ��һ����
		������10��ʱ�����ٳ�ʱ������û�ԣ�������ֻ��һ�������ˡ�
		���⣺��������ٸ�����

		˼·���� ����
		1. day = 10 ʱ���� 1 ������
		2. day = 9 ʱ�� �� (day10 + 1) * 2 = 4
		3. day = 8 ʱ�� �� (day9 + 1) * 2 = 10
		4. ���� ǰһ������� = (��һ������� + 1) * 2
		5. �ݹ�
		*/
class T{
	public int peach(int day) {
		if(day == 10){
			return 1;
		} else if(day >= 1 && day <= 9) {
			return (peach(day+1) + 1) * 2;
		} else {
			System.out.println("day�� 1-10");
			return -1;
		}
	}
}
