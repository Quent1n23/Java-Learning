

public class Homework05 {
	//��дһ��main����
	public static void main(String[] args) {
		Circle circle =  new Circle(10.0);
		System.out.println("�ܳ�=" + circle.len());
		System.out.println("���=" + circle.area());
	}
}

//�������� �뾶
//���ܳ� ����
//����� ����
class Circle {
	double radius;//�뾶

	//������ ��ʼ������
	public Circle(double radius) {
		this.radius = radius;
	}

	public double area() {//���
		return Math.PI * radius * radius;
	}

	public double len() {//�ܳ�
		return Math.PI * 2 * radius;
	}
}