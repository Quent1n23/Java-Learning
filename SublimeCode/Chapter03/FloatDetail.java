public class FloatDetail{

	public static void main(String[] args) {

		//java�ĸ����ͳ���������ֵ��Ĭ��Ϊ double��(8�ֽ�)
		//float num1 = 1.1;//����
		float num2 = 1.1F;//��
		double num3 = 1.1;//��
		double num4 = 1.1F;//��

		//ʮ����
		double num5 = .123;//.֮ǰ����ʡ��
		System.out.println(num5);
		//��ѧ��������5.12e2  5.12* 10��2�η� , 5.12E-2  5.12/ 10��2�η�
		System.out.println(5.12e2);
		System.out.println(5.12E-2);

		//ͨ������£�Ӧ��ʹ��double�ͣ���Ϊ���ȸ���
		double num9 = 2.1234567851;
		float num10 = 2.1234567851f;
		System.out.println(num9);
		System.out.println(num10);

		//�뿴һ�δ��� ����
		double num11 = 2.7;
		double num12 = 2.7;//8.1 / 3;//2.7
		System.out.println(num11);//2.7
		System.out.println(num12);//2.6999999999999997���ӽ�2.7��һ��С����������2.7��
		//�õ�һ����Ҫ��ʹ�õ㣺�����Ƕ� ��������С���� ��������ж�ʱ��ҪС��
		//Ӧ������ �������Ĳ�ֵ �ľ���ֵ ����ĳ�����ȷ�Χ���ж�
		if( num11 == num12 ){
			System.out.println("���");
		}
		// ��ȷд���� ctrl + / ע�Ϳ�ݼ�
		if( Math.abs(num11 - num12) < 0.0001 ){
			System.out.println("��ֵ�ǳ�С����Ϊ���");
		}	
		System.out.println(Math.abs(num11 - num12));

		//ϸ�ڣ������ֱ�Ӳ�ѯ�õ���С������ֱ�Ӹ�ֵ���ǿ����ж����

	}
}