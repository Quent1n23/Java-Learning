//	������/���췽��
//constructor
//��Ҫ���ã���ɶ� �¶���ĳ�ʼ��

public class Constructor{
	//��дһ��main����
	public static void main(String[] args) {
		//������ new һ������ʱ�� ֱ��ͨ�������� ָ�����ֺ�����
		Person p1 = new Person("smith", 80);
		System.out.println("p1����Ϣ����");
		System.out.println("p1����name=" + p1.name);
		System.out.println("p1����age=" + p1.age);
	}
}

/*

[���η�] ������(�β�){
	������;
}

1. ���η���������Ĭ�ϵ�
2. û�з���ֵ, Ҳ����дvoid
3. ������ �� ���� ����һ��
4. �β��б� �� ��Ա���� һ���Ĺ���
5. ������ �ĵ��ã���ϵͳ���
*/
class Person {
	String name;
	int age;
	//������
	public Person(String pName, int pAge) {
		System.out.println("������������~~ ��� ��������Գ�ʼ��");
		name = pName;
		age = pAge;
	}
}