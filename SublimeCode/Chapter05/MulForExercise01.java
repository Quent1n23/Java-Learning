
/*
(1) �ȼ���һ���࣬5��ѧ���ĳɼ���ƽ���֣�ʹ��for
1.1 ����Scanner���� �����û�����
1.2 �õ��ð༶��ƽ���֣�����һ��double sum �Ѹð༶5��ѧ���ĳɼ��ۼ�

(2) ͳ��3���࣬������ƽ����

(3) ���а༶ƽ����
3.1 ����һ������ double totalScore �ۼ�����ѧ���ĳɼ�
3.2 ������ѭ��������totalScore / 15

(4) ͳ��3���༰������
4.1 ������� int passNum = 0; ����һ��ѧ���ɼ� >= 60, passNum++
4.2 ��� >= 60 , passNum++

(5) �Ż�
*/

import java.util.Scanner;
public class MulForExercise01{

	//��дһ��main����
	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		double totalScore = 0;//�ۼ�����ѧ���ĳɼ�
		int passNum = 0;//�ۼƼ��������
		for(int i = 1; i <= 3; i++){//i��ʾ�༶

			double sum = 0;
			for(int j = 1; j <= 5; j++){//j��ʾѧ��
				System.out.println("�������" + i + "����ĵ�"+ j +"��ѧ���ĳɼ�");
				double score = myScanner.nextDouble();
				//����һ��ѧ���ɼ� >= 60, passNum++
				if(score >= 60){
					passNum++;
				}
				sum += score;
				System.out.println("�ɼ�Ϊ" + score);
			}
			System.out.println("sum=" + sum + " ƽ����=" + (sum / 5));
			totalScore += sum;
		}
		System.out.println("totalScore=" + totalScore+ " ƽ����=" + (totalScore / 15));
		System.out.println("��������Ϊ" + passNum );
	}
}