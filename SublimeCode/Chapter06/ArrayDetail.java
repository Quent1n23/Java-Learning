
// ������������������
public class ArrayDetail{

	//��дһ��main����
	public static void main(String[] args) {
		//1. ��ͬ����
		//int[] arr1 = {1, 2, 3, 60, 1.1, "hello"};//double -> int ����
		double[] arr2 = {1.1, 2.2, 3.3, 60.8, 100};//int -> double �Զ�����ת��

		//2. Ԫ�ؿ������κ��������� ���� ������������ ������������
		String[] arr3 = {"����", " �Ϻ�", "jack"};

		//3. ���鴴�������û�и�ֵ�� ��Ĭ��ֵ
		//int 0, short 0, byte 0, long 0, float 0.0, double 0.0
		//char \u0000,
		//boolean false, String null
		short[] arr4 = new short[3];
		System.out.println("===����arr4===");
		for(int i = 0; i < arr4.length; i++){
			System.out.println(arr4[i]);
		}

		//6. �±������ָ����Χ��ʹ�ã� ���򱨴� �±�Խ���쳣
		//����û���⣬����ʱ������

		//7. ���������������ͣ����������� �� ����(object) 
	}
}