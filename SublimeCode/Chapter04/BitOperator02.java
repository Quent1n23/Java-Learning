//λ����

public class BitOperator02{

	//��дһ��main����
	public static void main(String[] args) {
		int a = 1 >> 2; //00000001 ���� 2λ 1 / 2 / 2 = 0
		int c = 1 << 2; //00000001 ���� 2λ 1 * 2 * 2 = 4

		System.out.println("a=" + a);
		System.out.println("c=" + c);
		System.out.println(4 << 3);

	}
}