

public class VarParameterExercise {

	//��дһ��main����
	public static void main(String[] args) {
		
		HspMethod hm = new HspMethod();
		System.out.println(hm.showScore("milan", 90.1, 80.0));
	}
}
//�����������ֱ�ʵ��
// �������������ſγɼ����ܷ֣�
// �������������ſγɼ����ܷ֣�
// �������������ſγɼ����ܷ֣�
// ��װ��һ���ɱ�����ķ���

class HspMethod {
	public String showScore(String name, double... scores) {
		double totalScore = 0;
		for(int i = 0; i < scores.length; i++) {
			totalScore += scores[i];
		}

		return name + " �� " + scores.length + "�ſΣ��ܳɼ�=" + totalScore;
	}
	
}