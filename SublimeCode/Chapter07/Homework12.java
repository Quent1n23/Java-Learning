

public class Homework12 {
	//��дһ��main����
	public static void main(String[] args) {
		
		
	}
}
//�ṩ3�����췽�������Գ�ʼ������
//1. ���֣��Ա����䣬ְλ��нˮ
//2. ���֣��Ա�����
//3. ְλ��нˮ
//Ҫ�� ��ָ��ù�����
class Employee {
	String name;
	char gender;
	int age;
	String job;
	double sal;
	//���֣��Ա�����
	public Employee(String name, char gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	//ְλ��нˮ
	public Employee(String job, double sal) {
		this.job = job;
		this.sal = sal;
	}
	//���֣��Ա����䣬ְλ��нˮ
	public Employee(String name, char gender, int age, String job, double sal) {
		this(name, gender, age); //this���ù�����
		this.job = job;
		this.sal = sal;
	}
}
