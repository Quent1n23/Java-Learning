

public class Homework01 {
	//��дһ��main����
	public static void main(String[] args) {
		A01 a01 = new A01();
		double[] arr = {1.0, 4.7, 1.8};
		//double[] arr = null
		Double res = a01.max(arr);
		if(res != null){
			System.out.println("arr�����ֵ=" + res);
		} else {
			System.out.println("arr����������");
		}
		
		
	}
}

class A01 {
	//��ĳ��double��������ֵ��������
	//���ǵ����뽡׳�ԣ������鳤��Ϊ0��

	//Dboule ��װ��
	public Double max(double[] arr) {
		//���ж�arr�Ƿ�Ϊ�գ����жϳ���
		if(arr != null && arr.length > 0) {
			//��֤arr������һ��Ԫ��
			double max = arr[0];
			for(int i = 1; i < arr.length; i++ ) {
				if(max < arr[i]){
					max = arr[i];
				}
			}
			return max;
		} else {
			return null;
		}
		
	}
}