

public class OverloadExercise {

	//��дһ��main����
	public static void main(String[] args) {
		Methods method = new Methods();
		method.m(10);
		method.m(10, 20);
		method.m("��˳ƽ���� hello");

		System.out.println(method.max(10,24));//24
		System.out.println(method.max(10.5, 356.3));//
		System.out.println(method.max(36.1, 27.6, 45));//����ʱ������ �����Զ�ת��
		
	}
}


//�� Methods
class Methods {
	//������m,���أ�������������
	public void m(int n) {
		System.out.println("ƽ��=" + (n * n));
	}

	public void m(int n1, int n2) {
		System.out.println("���=" + (n1 * n2));
	}

	public void m(String str) {
		System.out.println("������ַ���Ϊ" + str);
		
	}

	//���ط���max()
	//����int���ֵ
	public int max(int n1, int n2) {
		return n1 > n2 ? n1 : n2;
	}
	//����double���ֵ
	public double max(double n1, double n2) {
		return n1 > n2 ? n1 : n2;
	}
	//����double���ֵ
	public double max(double n1, double n2, double n3) {
		double max1 = n1 > n2 ? n1 : n2;
		return max1 > n3 ? max1 : n3;
	}
}