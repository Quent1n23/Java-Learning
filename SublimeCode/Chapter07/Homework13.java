

public class Homework13 {
	//��дһ��main����
	public static void main(String[] args) {
		Circle c = new Circle();
		PassObject po = new PassObject();
		po.printAreas(c,5);
		
	}
}

class Circle {
	double radius;//�뾶

	// public Circle(double radius) {
	// 	this.radius = radius;
	// }
	public double findArea() {
		return Math.PI * radius * radius;
	}
	//��ӷ���setRadius,�޸Ķ���İ뾶ֵ
	public void setRadius(double radius) {
		this.radius = radius;
	}
}

class PassObject {
	//��ӡ1-times֮�� ��ÿ�������İ뾶ֵ���Լ���Ӧ�����
	public void printAreas(Circle c, int times) {
		System.out.println("radius\tarea");
		for(int i = 1; i <= times; i++) {
			c.setRadius(i); //Circle��Ķ��� c ���� setRadius()���� ����i,�ı�뾶ֵ
			System.out.println((double)i + "\t" + c.findArea());
			
		}
	}
}