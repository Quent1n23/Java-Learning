//�����������͵Ĵ��λ��� 
//�����������ͣ����ݵ���ֵ��ֵ���������βε��κθı䲻Ӱ��ʵ��

public class MethodParameter01{

	//��дһ��main����
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		AA obj = new AA();
		obj.swap(a,b);//����swap����

		System.out.println("main���� a=" + a + "\tb=" + b);
		
	}
}

class AA {

	public void swap(int a,int b) {
		System.out.println("a,b����ǰ");
		System.out.println("a=" + a + "\tb=" + b);
		//���a,b�Ľ���
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a,b������");
		System.out.println("a=" + a + "\tb=" + b);
	}
}