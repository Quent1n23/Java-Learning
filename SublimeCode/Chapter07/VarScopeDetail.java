

public class VarScopeDetail{

	//��дһ��main����
	public static void main(String[] args) {
		
		Person p1 = new Person();
		/*
		����
		�������ڽϳ��������Ŷ���Ĵ����������������Ŷ�������ٶ�����
		�ֲ�������
		�������ڽ϶̣����������Ĵ�����ִ�ж������������Ŵ����Ľ���������
		*/
		p1.say();
		T t1 = new T();

		t1.test();//��1�� ������� �������� �ķ�ʽ

		t1.test2(p1);//��2�� ������� �������� �ķ�ʽ
	}
}

class Person {
	//���� 		���Լ����η�
	//�ֲ����� 	���ܼ����η� 
	public int age = 20;

	String name = "jack";

	public void say() {
		//ϸ�ڣ����Ժ;ֲ�������������������ʱ��ѭ�ͽ�ԭ��
		String name = "king";
		System.out.println("say() name = " + name);
	}
	//ϸ��
	//ͬһ���������У������ֲ�������ͬ����
}


class T {
	public void test() {
		//ȫ�ֱ�������/���ԣ������ڱ���ʹ�ã���������ʹ��
		Person p1 = new Person();
		System.out.println(p1.name);
	}

	public void test2(Person p) {
		System.out.println(p.name);
	}
}