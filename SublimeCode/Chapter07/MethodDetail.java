

public class MethodDetail {

	//��дһ��main����
	public static void main(String[] args) {
		
		AA a = new AA();
		int[] res = a.getSumAndSub(1, 4);
		System.out.println("��=" + res[0]);
		System.out.println("��=" + res[1]);
	}
}

class AA {

	//1. ���ض��ֵ
	public int[] getSumAndSub(int n1, int n2) {

		int[] resArr = new int[2];//����һ������
		resArr[0] = n1 + n2;
		resArr[1] = n1 - n2;
		return resArr;
	}

	//2. �������� ����Ϊ��������

	//3. �������Ҫ���з����������ͣ��򷽷���������ִ��������Ϊ returnֵ
	//   ����Ҫ�󷵻�ֵ���ͱ����returnֵ����һ�»����
	public double f1() {
		double d1 = 1.1 * 3;
		return d1;
	}

	//4. ���������void���򷽷����п���û��return��䣬���� ֻдreturn
	public void f2() {
		System.out.println("hello");
		return;
	}
}