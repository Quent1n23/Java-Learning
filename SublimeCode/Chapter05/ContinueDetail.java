//��ǩʹ��

public class ContinueDetail{

	//��дһ��main����
	public static void main(String[] args) {
		
		label1:
		for(int j = 0; j < 4; j++) {
			
			label2:
			for(int i = 0; i < 10; i++) {
				if(i == 2){
					//continue;//�ȼ� continue label2
					continue label1;
				}
				System.out.print("i = " + i + "\t");
			}
			System.out.println();
		}
	}
}