//���鸳ֵ����
//assign:����

public class ArrayAssign{

	//��дһ��main����
	public static void main(String[] args) {
		
		//������������ ��ֵ����ֵ��ʽΪ ֵ����
		//n2�ı仯������Ӱ��n1��ֵ
		int n1 = 10;
		int n2 = n1;
		n2 = 80;
		System.out.println("n1=" + n1);
		System.out.println("n2=" + n2);

		//������Ĭ������������ô��ݣ�����ֵ�ǵ�ַ�� ��ֵ��ʽΪ ���ô���
		//arr2�仯 ��Ӱ�쵽 arr1
		int[] arr1 = {1,2,3};
		int[] arr2 = arr1;//��arr1 ���� arr2
		arr2[0] = 10;
		//����arr1��ֵ
		System.out.println("===arr1[]��ֵ===");
		for(int i = 0; i < arr1.length; i++){
			System.out.println(arr1[i]);
		}
	}
}