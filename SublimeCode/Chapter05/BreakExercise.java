

public class BreakExercise{

	//��дһ��main����
	public static void main(String[] args) {
		//1-100���ڵ��� ��� �� ��� �� �� ��һ�δ���20 �� ��ǰ��
		int sum = 0;
		for(int i = 1; i <= 100; i++){
			sum +=  i;
			if(sum > 20){
				System.out.println("�� >20 ʱ����ǰ�� i=" + i);
				break;
			}
		}
		
	}
}