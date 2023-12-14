public class FloatDetail{

	public static void main(String[] args) {

		//java的浮点型常量（具体值）默认为 double型(8字节)
		//float num1 = 1.1;//错误
		float num2 = 1.1F;//对
		double num3 = 1.1;//对
		double num4 = 1.1F;//对

		//十进制
		double num5 = .123;//.之前可以省略
		System.out.println(num5);
		//科学计数法：5.12e2  5.12* 10的2次方 , 5.12E-2  5.12/ 10的2次方
		System.out.println(5.12e2);
		System.out.println(5.12E-2);

		//通常情况下，应该使用double型；因为精度更高
		double num9 = 2.1234567851;
		float num10 = 2.1234567851f;
		System.out.println(num9);
		System.out.println(num10);

		//请看一段代码 陷阱
		double num11 = 2.7;
		double num12 = 2.7;//8.1 / 3;//2.7
		System.out.println(num11);//2.7
		System.out.println(num12);//2.6999999999999997，接近2.7的一个小数，而不是2.7，
		//得到一个重要的使用点：当我们对 运算结果是小数的 进行相等判断时，要小心
		//应该是以 两个数的差值 的绝对值 ，在某个精度范围内判断
		if( num11 == num12 ){
			System.out.println("相等");
		}
		// 正确写法， ctrl + / 注释快捷键
		if( Math.abs(num11 - num12) < 0.0001 ){
			System.out.println("差值非常小，认为相等");
		}	
		System.out.println(Math.abs(num11 - num12));

		//细节：如果是直接查询得到的小数或者直接赋值，是可以判断相等

	}
}