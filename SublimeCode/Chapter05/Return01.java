//return ���ڷ���ʱ����ʾ�����������������main����`����ʾ�˳�����

public class Return01{

	//��дһ��main����
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++){
			if(i == 3) {
				System.out.println("��˳ƽ����" + i);
				// break;
				// continue;
				return;//����ʱ��main��
			}
			System.out.println("hello");
		}
		System.out.println("go on ...");
	}
}