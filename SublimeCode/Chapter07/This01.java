//				this�ؼ���

public class This01 {
	//��дһ��main����
	public static void main(String[] args) {
		Dog dog1 = new Dog("��׳", 3);
		System.out.println("dog1��hashcode=" + dog1.hashCode());//��ϣֵ�����������ĵ�ַ
		dog1.info();

		Dog dog2 = new Dog("���", 2);
		System.out.println("dog2��hashcode=" + dog2.hashCode());
		dog1.info();
		
	}
}

class Dog {

	String name;
	int age;
	// public Dog(String dName, int dAge) {//������
	// 	name = dName;
	// 	age = dAge;
	// }

	//dName �� dAge �ĳ� name age

	public Dog(String name, int age) {//������
		//this.name ���� ��ǰ���� �� ����name
		this.name = name;
		//this.age ���� ��ǰ���� �� ����age
		this.age = age;
		System.out.println("this.hashcode=" + this.hashCode());
	}

	public void info() {
		System.out.println("this.hashcode=" + this.hashCode());
		System.out.println(name + "\t" + age + "\t");
	}
}