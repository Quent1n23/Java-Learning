//��ʾ |  �� ||  ��ʹ��

public class LogicOperator02{

	//��дһ��main����
	public static void main(String[] args) {
		
		//��·��  ||
		int age = 50;
		if(age > 20 || age < 30) {
			System.out.println("ok100");
		}

		//�߼��� |
		if(age > 20 | age < 30) {
			System.out.println("ok200");
		}


		/*
		����
		|| ��·�򣺵�һ������T���ڶ������������жϣ�Ч�ʸ�
		|  �߼��򣺵ڶ������������ж�
		*/
		int a = 4;
		int b = 9;
		if(a > 1 || ++b > 4) {
			System.out.println("ok300");
		}
		System.out.println("a=" + a + " b=" + b);

	}
}