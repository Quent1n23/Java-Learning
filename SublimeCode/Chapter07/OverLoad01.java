//��������
//ͬһ�����У����ͬ�������Ĵ��ڣ�Ҫ���β��б�һ��
//
//1. �������������鷳
//2. �����˼������鷳

public class OverLoad01 {

	//��дһ��main����
	public static void main(String[] args) {
		// out �� PrintStream �Ķ���
		// System.out.println(100);
		// System.out.println("hello,world");
		// System.out.println('h');
		// System.out.println(1);
		// System.out.println(true);
		MyCalculator mc = new MyCalculator();
		System.out.println(mc.calculate(1, 2));
		System.out.println(mc.calculate(1.1, 2));
		
	}
}

class MyCalculator {
	//������ĸ�calculate���� ����������
	//���������ĺ�
	public int calculate(int n1,int n2){
		System.out.println("calculate(int n1,int n2)������");
		return n1 + n2;
	}
	
	//û�й������أ��β��б� ���벻һ��
	// public void calculate(int n1,int n2){
	// 	System.out.println("calculate(int n1,int n2)������");
	// 	return n1 + n2;
	// }

	//һ��������һ��double�ĺ�
	public double calculate(int n1,double n2){
		System.out.println("calculate(int n1,double n2)������");
		return n1 + n2;
	}
	//һ��double��һ��int
	public double calculate(double n1,int n2){
		System.out.println("calculate(double n1,int n2)������");
		return n1 + n2;
	}
	//����int��
	public int calculate(int n1,int n2, int n3){
		System.out.println("calculate(int n1,int n2, int n3)������");
		return n1 + n2 + n3;
	}
}