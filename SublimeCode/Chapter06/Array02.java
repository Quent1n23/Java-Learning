

import java.util.Scanner;

public class Array02{

	//��дһ��main����
	public static void main(String[] args) {
		//��ʾ    �������� ������[] = new ��������[��С]
		//ѭ������5���ɼ������浽double���飬�����


		//(1) ��̬��ʼ��1
		double scores[] = new double[5];
		// double[] scores = new double[5];

		//(2) ��̬��ʼ��2
		//double scores[];// �������飬��ʱ scores �� null���أ�
		//scores = new double[5]; //�����ڴ�ռ䣬���Դ������

		Scanner myScanner = new Scanner(System.in);
		//ѭ������
		for(int i = 0; i < scores.length; i++){
			System.out.println("�������" + (i+1) + "��Ԫ�ص�ֵ");
			scores[i] = myScanner.nextDouble();
		}
		//���,��������
		System.out.println("===��ǰ�����Ԫ��/ֵ���������===");
		for(int i = 0; i < scores.length; i++){
			System.out.println("��" + (i+1) + "��Ԫ�ص�ֵ=" + scores[i]);
			
		}

	}
}