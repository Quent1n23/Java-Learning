
//��� 1 - 1/2 + 1/3 - 1/4 ...... 1/100�ĺ�
public class Homework08{

	//��дһ��main����
	public static void main(String[] args) {
		double sum = 0;
		//int count = 1; û��Ҫ
		for(int i = 1; i <= 100; i++){
			if(i % 2 != 0){//��ĸ������ +
				sum += 1.0/i;
			} else {//��ĸ��ż�� -
				sum -= 1.0/i;
			}
		}
		System.out.println(sum);
		
	}
}