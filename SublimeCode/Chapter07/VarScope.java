//������
//scope ��Χ

public class VarScope {

	//��дһ��main����
	public static void main(String[] args) {
		
		
	}
}

class Cat {
	//ȫ�ֱ�����Ҳ�������ԣ������� Ϊ �������� Cat��
	//�����ڶ���ʱ������ֱ�Ӹ�ֵ
	int age = 10;

	//ȫ�ֱ���(����) ���Բ���ֵ��ֱ��ʹ�ã���Ϊ��Ĭ��ֵ
	double weight;//Ĭ��ֵ 0.0

	//�ֲ��������븳ֵ�󣬲���ʹ�ã�û��Ĭ��ֵ
	public void hi() {
		int num = 1;
		System.out.println("num=" + num);
		System.out.println("weight=" + weight);
		//����: ������δ��ʼ������num
	}


	public void cry() {
		//1. �ֲ�����һ����ָ�ڳ�Ա�����ж���ı���
		//2. n �� name ���Ǿֲ�����
		//3. n �� name �������� ��cry������
		int n = 10;
		String name = "jack";
		System.out.println("��cry��ʹ������ age=" + age);
	}

	public void eat() {
		System.out.println("��eat��ʹ������ age=" + age);
		// System.out.println("��cry��ʹ�� cry�ı��� name=" + name);����
	}
}