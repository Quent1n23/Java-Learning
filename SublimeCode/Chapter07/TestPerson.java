

public class TestPerson {
	//��дһ��main����
	public static void main(String[] args) {
		Person p1 = new Person("mary", 20);
		Person p2 = new Person("smith", 30);
		System.out.println(p1.compareTo(p2));
		
	}
}
//����person�࣬ ����name age  �ṩcompareTo�ȽϷ���
//�����ж��Ƿ����һ�������

class Person {
	String name;
	int age;
	//������
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//compareTo�ȽϷ���
	public boolean compareTo(Person p) {
		//���ֺ�������ȫһ��
		// if(this.name.equals(p.name) && this.age == p.age) {
		// 	return true;
		// } else {
		// 	return false;
		// }
		return this.name.equals(p.name) && this.age == p.age;
		//this ˭���� ָ��˭
	}
}