

public class MethodExercise01{

	//��дһ��main����
	public static void main(String[] args) {
		
		AA a = new AA();
		// if(a.isOdd(1)) {
		// 	System.out.println("������");
		// } else {
		// 	System.out.println("��ż��");
		// }
		a.print(4,4,'*');
		
	}
}

//��д��AA����һ���������ж�һ����������odd����ż��������boolean
class AA {

	public boolean isOdd(int num) {
		// if(num % 2 != 0){
		// 	return true;
		// } else {
		// 	return false;
		// }

		//return num % 2 != 0 ? true : false;
		//
		return num % 2 != 0;
	}

	//���� �С��С��ַ� ��ӡ ��Ӧ�������������ַ�
	//���磺�У�4���У�4���ַ�#�����ӡ��Ӧ��Ч��

	//
	//˼·
	//1. �������� void
	//2. �������� print
	//3. �β� (int row, int col, char c)
	//4. �����壺ѭ��
	public void print(int row, int col, char c) {
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= col; j++){//���ÿһ��
				System.out.print(c);
			}
			System.out.println();//����
		}
	}
}