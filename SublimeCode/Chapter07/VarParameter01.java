//�ɱ����
//Java������ ͬһ������ ���ͬ�� ͬ���� ������������ͬ �ķ��� ��װ��һ��������	
//����ͨ���ɱ����ʵ��

//�����﷨
//�������η� �������� ������(��������... �β���){}


public class VarParameter01 {

	//��дһ��main����
	public static void main(String[] args) {
		DcMethod m = new DcMethod();
		m.sum();
		System.out.println(m.sum(1, 5, 25));
		
	}
}

class DcMethod {
	//���Լ��� 2�����ĺͣ� 3�����ĺͣ�4�����ĺͣ� 5����6��...
	// public int sum(int n1, int n2) {
	// 	return n1 + n2;
	// }
	// public int sum(int n1, int n2, int n3) {
	// 	return n1 + n2 + n3
	// }
	// public int sum(int n1, int n2, int n3, int n4) {
	// 	return n1 + n2 + n3 + n4;
	// }


	//1. int...��ʾ ���յ��ǿɱ������������int�������Խ��ն��int(0-n)
	//2. ʹ�ÿɱ����ʱ�����Ե���������ʹ��
	//3. �������
	public int sum(int... nums) {
		System.out.println("���յĲ�������=" + nums.length);
		int res = 0;
		for(int i = 0; i < nums.length; i++) {
			res += nums[i];
		}
		return res;
	}
}