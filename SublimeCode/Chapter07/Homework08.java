

public class Homework08 {//������
	int count = 9;//����


	public void count1() {//homework08��ĳ�Ա����
		count = 10;//���count��������
		System.out.println("count=" + count);//10
	}


	public void count2() {//homework08��ĳ�Ա����
		System.out.println("count=" + count++);
	}



	//����homework08���main�������κ�һ���࣬������main
	public static void main(String[] args) {
		//1. new Homework08() ���������� �����ٿռ䣬û������
		//	��������ֻ����һ�Σ���������ٿռ�
		//2. new Homework08().count1() ��������������󣬾͵���count1()
		new Homework08().count1();

		Homework08 h1 = new Homework08();
		h1.count2();
		h1.count2();

		
	}
}