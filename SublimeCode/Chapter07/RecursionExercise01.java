

public class RecursionExercise01{

	//��дһ��main����
	public static void main(String[] args) {
		T t1 = new T();
		int n = 0;
		int res = t1.Fibonacci(n);
		if(res != -1){
			System.out.println("��n="+ n + " ��Ӧ��쳲�������=" + res);
		}
		

	}
}

class T {
		/*
		ʹ�õݹ�ķ�ʽ���쳲�������1��1��2��3��5��8��13....��һ����n���������ֵ�Ƕ���

		1. n = 1 쳲���������1
		2. n = 2 쳲���������1
		3. n >= 3 쳲���������ǰ�������ĺ�
		4. �������һ���ݹ��˼·
		*/
		public int Fibonacci(int n) {
			if(n >= 1) {
				if(n == 1 || n == 2){
					return 1;
				} else {
					return Fibonacci(n-1) + Fibonacci(n-2);
				}
			} else {
				System.out.println("������һ������1������");
				return -1;
			}
			
		}
}