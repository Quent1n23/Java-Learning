

public class ConstructorDetail{
	//��дһ��main����
	public static void main(String[] args) {
		Person p1 = new Person("king",  40);
		Person p2 = new Person("tom");

		Dog dog1 = new Dog();//ʹ�õ��� Ĭ�Ϲ�����
		
	}
}
//һ��������ж������������ ������������
class Person {
	String name;
	int age;
	//�� 1 ��������
	public Person(String pName, int pAge) {
		System.out.println("�� 1 ��������������~~");
		name = pName;
		age = pAge;
	}
	//�� 2 ��������
	public Person(String pName) {
		System.out.println("�� 2 ��������������~~");
		name = pName;
	}
}

class Dog{
	//һ���� û�ж��幹������ϵͳ���Զ���������һ�� 
	//Ĭ���޲ι�����(Ĭ�Ϲ�����)
	/*
		Ĭ�Ϲ�����
		Dog() {
		
		}

	javap ������ Dog.class
	*/

	//һ�������˹�������Ĭ�Ϲ������ͱ����ǣ�������ʹ��Ĭ�Ϲ�������
	//������ʾ���ٶ���һ��
	public Dog(String dName) {

	}
	Dog() {//��ʾ���ٶ���һ�� Ĭ�Ϲ�����

	}
}