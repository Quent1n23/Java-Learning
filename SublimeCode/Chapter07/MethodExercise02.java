//�����¡

public class MethodExercise02{

	//��дһ��main����
	public static void main(String[] args) {
		Person p = new Person();
		p.name = "milan";
		p.age = 100;

		//����tools
		MyTools tools = new MyTools();
		Person p2 = tools.copyPerson(p);

		//���� p �� p2 ��������ͬ��Person����
		System.out.println("p������  age=" + p.age + " name=" + p.name);
		System.out.println("p2������  age=" + p2.age + " name=" + p2.name);
		//�Ƚ�
		System.out.println(p == p2);//false
		
	}
}


class Person {
	String name;
	int age;
}


class MyTools {
	//��дһ������copyPerson�����Ը���һ��Person���󡣷��ظ��ƵĶ��󣬿�¡����
	//ע��Ҫ��õ��� �¶����ԭ���Ķ��� �����������Ķ���ֻ�����ǵ�������ͬ

	//1. �������� Person
	//2. �������� copyPerson
	//3. �β� (Person p)
	//4. ������
	public Person copyPerson(Person p) {
		//����һ���µĶ���
		Person p2 = new Person();
		p2.name = p.name;
		p2.age = p.age;

		return p2;//��ν��գ�
	}
}
