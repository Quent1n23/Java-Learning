//���1-100֮��� ���ܱ� 5 ����������ÿ5��һ��

public class Homework06{

	//��дһ��main����
	public static void main(String[] args) {
		//ʹ��count ͳ������ĸ�������� count % 5 =0 ��˵�������5��
		int count = 0;
		for(int i = 1; i <= 100; i++){
			if(i % 5 != 0) {
				System.out.print(i + "\t");
				count++;
				if(count % 5 == 0){
					System.out.println();
				}
			}
			
		}
	}
}