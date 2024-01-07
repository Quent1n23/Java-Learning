

public class Homework13 {
	//编写一个main方法
	public static void main(String[] args) {
		Circle c = new Circle();
		PassObject po = new PassObject();
		po.printAreas(c,5);
		
	}
}

class Circle {
	double radius;//半径

	// public Circle(double radius) {
	// 	this.radius = radius;
	// }
	public double findArea() {
		return Math.PI * radius * radius;
	}
	//添加方法setRadius,修改对象的半径值
	public void setRadius(double radius) {
		this.radius = radius;
	}
}

class PassObject {
	//打印1-times之间 的每个整数的半径值，以及对应的面积
	public void printAreas(Circle c, int times) {
		System.out.println("radius\tarea");
		for(int i = 1; i <= times; i++) {
			c.setRadius(i); //Circle类的对象 c 调用 setRadius()方法 传入i,改变半径值
			System.out.println((double)i + "\t" + c.findArea());
			
		}
	}
}