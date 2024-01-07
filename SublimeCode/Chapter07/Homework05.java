

public class Homework05 {
	//编写一个main方法
	public static void main(String[] args) {
		Circle circle =  new Circle(10.0);
		System.out.println("周长=" + circle.len());
		System.out.println("面积=" + circle.area());
	}
}

//定义属性 半径
//求周长 方法
//求面积 方法
class Circle {
	double radius;//半径

	//构造器 初始化属性
	public Circle(double radius) {
		this.radius = radius;
	}

	public double area() {//面积
		return Math.PI * radius * radius;
	}

	public double len() {//周长
		return Math.PI * 2 * radius;
	}
}