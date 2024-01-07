import java.util.Random;
import java.util.Scanner;

//MoraGame ��ȭ��Ϸ

public class Homework14 {
	//��дһ��main����
	public static void main(String[] args) {
		//����һ����Ҷ���
		Tom t = new Tom();
		//������¼�����Ӯ�Ĵ���
		int isWinCount = 0;

		//����һ����ά���飬�������վ�����Tom��ȭ��������Գ�ȭ���
		int[][] arr1 = new int[3][3];
		int j = 0;

		//����һ��һά���飬����������Ӯ���
		String[] arr2 = new String[3];

		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 3; i++) { //����3��
			//��ȡ��ҵĳ�ȭ
			System.out.println("��������Ҫ����ȭ��0-ȭͷ��1-������2-������");
			int num = scanner.nextInt();
			t.setTomNum(num);
			int tomGuess = t.getTomNum();
			arr1[i][j+1] = tomGuess;

			//��ȡ���Գ���ȭ
			int comGuess = t.computerNum();
			arr1[i][j+2] = comGuess;

			//�������������Ƚ�
			String isWin = t.vsComputer();
			arr2[i] = isWin;
			arr1[i][j] = t.count;

			//��ÿһ�ֵ�����������
			System.out.println("========================================");
			System.out.println("����\t��ҵĳ�ȭ\t���Եĳ�ȭ\t\t��Ӯ���");
			System.out.println(t.count + "\t" + tomGuess + "\t\t" + comGuess +"\t\t" + isWin);
			System.out.println("========================================");
			System.out.println("\n\n");
			isWinCount = t.winCount(isWin);
		}

		//����Ϸ�����ս���������
		System.out.println("����\t��ҵĳ�ȭ\t���Եĳ�ȭ\t\t��Ӯ���");
		for(int a = 0; a < arr1.length; a++) {
			for(int b = 0; b < arr1[a].length; b++) {
				System.out.print(arr1[a][b] + "\t\t");
			}
			System.out.print(arr2[a]);
			System.out.println();
		}
		System.out.println("��Ӯ��"+ isWinCount+"��");
		
	}
}
//�и���Tom������ĳ�Ա��������Ա���������Ե��Բ�ȭ
//����ÿ�ζ����������0��1��2
//0ʯͷ	1����	2��
//��Ҫ������ʾTom����Ӯ����(�嵥)
class Tom {
	int tomNum;//��ҳ�ȭ
	int comNum;//���Գ�ȭ
	int winNum;//���Ӯ�Ĵ���
	int count = 1;//һ����������

	public void showInfo() {
		//
	}

	//����������ɵ�����
	public int computerNum() {
		Random r = new Random();
		comNum = r.nextInt(3);// �������� 0-2�������
		return comNum;
	}

	//������ҵ�����
	public void setTomNum(int tomNum) {
		if(tomNum > 2 || tomNum < 0) {
			throw new IllegalArgumentException("�������ִ���");
		}
		this.tomNum = tomNum;
	}

	//��õ�������
	public int getTomNum() {
		return tomNum;
	}

	//�Ƚϲ�ȭ�Ľ��
	public String vsComputer() {
		if (tomNum == 0 && comNum == 1) {
			return "��Ӯ��";
		} else if (tomNum == 1 && comNum == 2) {
			return "��Ӯ��";
		} else if (tomNum == 2 && comNum == 0) {
			return "��Ӯ��";
		} else if (tomNum == comNum) {
			return "ƽ��";
		} else {
			return "������";
		}
	}

	//��¼���Ӯ�ô���
	public int winCount(String s) {
		count++;	//������Ĵ���
		if(s.equals("��Ӯ��")) {
			winNum++;
		}
		return winNum;
	}
}