

public class MethodDetail {

	//编写一个main方法
	public static void main(String[] args) {
		
		AA a = new AA();
		int[] res = a.getSumAndSub(1, 4);
		System.out.println("和=" + res[0]);
		System.out.println("差=" + res[1]);
	}
}

class AA {

	//1. 返回多个值
	public int[] getSumAndSub(int n1, int n2) {

		int[] resArr = new int[2];//创建一个数组
		resArr[0] = n1 + n2;
		resArr[1] = n1 - n2;
		return resArr;
	}

	//2. 返回类型 可以为任意类型

	//3. 如果方法要求有返回数据类型，则方法体中最后的执行语句必须为 return值
	//   而且要求返回值类型必须和return值类型一致或兼容
	public double f1() {
		double d1 = 1.1 * 3;
		return d1;
	}

	//4. 如果方法是void，则方法体中可以没有return语句，或者 只写return
	public void f2() {
		System.out.println("hello");
		return;
	}
}