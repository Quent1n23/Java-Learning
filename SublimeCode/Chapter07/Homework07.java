

public class Homework07 {
	//��дһ��main����
	public static void main(String[] args) {
		Dog dog1 = new Dog("С��", "yellow", 2);
		dog1.show();
		Dog dog2 = new Dog("С��", "white", 3);
		dog2.show();
		
	}
}

class Dog {
	String name;
	String color;
	int age;
	public Dog(String name, String color, int age) {
		this.name = name;
		this.color = color;
		this.age = age;
	}

	//�������show()��ʾ����Ϣ
	public void show() {
		System.out.println("name=" + this.name);
		System.out.println("color=" + this.color);
		System.out.println("age=" + this.age);
	}
}