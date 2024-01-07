

public class Homework06 {
	//编写一个main方法
	public static void main(String[] args) {
		Cale cale = new Cale(2,0);
		System.out.println("和=" + cale.sum());
		System.out.println("差=" + cale.minus());
		System.out.println("乘积=" + cale.mul());
		Double divRes = cale.div();
		if(divRes != null){
			System.out.println("商=" + divRes);
		}
		
		
	}
}


//在Cale类中定义2个变量 表示2个操作数
//定义四个方法 实现 和、差、乘、商（要求除数为0的话，要提示） 
//并创建两个对象，分别测试
class Cale {
	double num1;
	double num2;
	public Cale(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	//和
	public double sum() {
		return num1 + num2;
	}
	//差
	public double minus() {
		return num1 - num2;
	}
	//乘积
	public double mul() {
		return num1 * num2;
	}
	//除法
	public Double div() {
		if(num2 == 0) {
			System.out.println("num2不能为0");
			return null;
		} else {
			return num1 / num2;
		}
		
	}
}