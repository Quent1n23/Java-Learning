

public class ConstructorExercise {
	//��дһ��main����
	public static void main(String[] args) {
		Person p1 = new Person();//��һ�� �޲ι�����
		System.out.println("p1����Ϣ name=" + p1.name + " age=" + p1.age);

		Person p2 = new Person("scott", 50);//�ڶ��� ���ι�����
		System.out.println("p2����Ϣ name=" + p2.name + " age=" + p2.age);
	}
}

class Person {
	String name;// null
	int age;// 0

	//�������������

	//��һ���޲ι����������ù��������� �����˵� age���� ��ʼֵΪ18
	public Person() {
		age = 18;
	}

	//�ڶ�����pName��pAge�Ĺ�������
	//ʹ��ÿ�δ���Person�����ͬʱ����ʼ�������age����ֵ��name����ֵ
	public Person(String pName, int pAge) {
		name = pName;
		age = pAge;
	}
}