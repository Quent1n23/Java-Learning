

public class ThisDetail {
	//��дһ��main����
	public static void main(String[] args) {
		// T t1 = new T();
		// t1.f2();

		T t2 = new T();
		t2.f3();
		
	}
}

class T {
	String name = "jack";
	int age = 100;

	/*
	ϸ�ڣ����ʹ������﷨��this(�����б�);
	ע��ֱ�����ڹ�������ʹ�ã��� ֻ���ڹ������� ��������һ�� ��������

	ע�⣺�����this() this���ʹ�����
		������ڵ�һ�����
	*/

	public T() {
		this("jack", 100);//����ȥ���� T(String name, int age)������
		System.out.println("T() ������");	
	}

	public T(String name, int age) {
		System.out.println("T(String name, int age)������");
	}


	//ϸ�ڣ�this���Է��� ���������
	public void f3() {
		String name = "smith";
		//��ͳ��ʽ   �ͽ�ԭ��
		System.out.println("��ͳ��ʽ");
		System.out.println("name="+ name + " age=" + age);
		//����ʹ��this��������
		System.out.println("ʹ��this��������");
		System.out.println("name="+ this.name + " age=" + this.age);
	}


	//ϸ�ڣ����ʳ�Ա�������﷨��this.������(�����б�);
	public void f1() {
		System.out.println("f1() ����...");
	}

	public void f2() {
		System.out.println("f2() ����...");
		//���ñ���� f1
		//��һ�ַ�ʽ
		f1();
		//�ڶ��ַ�ʽ
		this.f1();
	}
}