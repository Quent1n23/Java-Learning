
//���������
//��̬��ʼ��
//�������� ������[] = {Ԫ��ֵ, Ԫ��ֵ, ... }

public class Array01{

	//��дһ��main����
	public static void main(String[] args) {
		/*
		3kg,5kg,1kg,3.4kg,2kg,50kg
		��ֻ�������أ�ƽ������

		*/
		// double hen1 = 3;
		// double hen2 = 5;
		// double hen3 = 1;
		// double hen4 = 3.4;
		// double hen5 = 2;
		// double hen6 = 50;

		// double totalWeight = hen1+hen2+hen3+hen4+hen5+hen6;
		// double avgWeight = totalWeight / 6;
		// System.out.println("������=" + totalWeight + "ƽ������=" + avgWeight);


		//����һ������
		//1. double[] ��ʾ ��double���͵����飬������ hens
		//2. {3, 5, 1, 3.4, 2, 50} ��ʾ����� ֵ/Ԫ�� �����α�ʾ����ĵڼ���Ԫ��
		double[] hens = {3, 5, 1, 3.4, 2, 50};

		//��������õ����������Ԫ�صĺ�, ʹ��for

		//1. ����ͨ�� hens[�±�] �����������Ԫ��
		//	 �±��Ǵ� 0 ��ʼ��ŵ�
		//2. ͨ��for �Ϳ���ѭ���ķ��� ����� Ԫ��/ֵ
		//3. ʹ��һ������ totalWeight ������Ԫ���ۼ�
		System.out.println("===ʹ��������===");
		System.out.println("����ĳ���=" + );
		double totalWeight = 0;
		for(int i = 0; i < ; i++){
			//System.out.println("��" + (i+1) + "��Ԫ�ص�ֵ=" + hens[i]);
			totalWeight += hens[i];
		}
		System.out.println("������=" + totalWeight + "ƽ������=" + (totalWeight/hens.length));
	}
}