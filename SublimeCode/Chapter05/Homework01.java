

public class Homework01{

	//��дһ��main����
	public static void main(String[] args) {
		/* 
		ĳ�� ��100,000Ԫ��ÿ����һ��·�ڣ���Ҫ���ѣ��������£�
		1. ���ֽ� > 50000ʱ��ÿ�ν� 5%
		2. ���ֽ� <= 50000ʱ��ÿ�ν�1000
		������˿��Ծ������ٴ�·�ڣ�Ҫ��ʹ�� while + break
		*/
		
		double money = 100000;
		int count = 0;

		// while(money > 50000) {
		// 	money = money * 0.95;
		// 	count++;
		// 	if(money <= 50000) {
		// 		break;
		// 	}
		// }
		// while(money >=  1000 ){
		// 	money = money - 1000;
		// 	count++;
		// }
		while(true){
			if(money > 50000){//��·��
				money *= 0.95;//�������·�ڣ�������ô��Ǯ
				count++;
			} else if(money >= 1000){
				money -= 1000;
				count ++;
			} else {//Ǯ����1000
				break;
			}
		}

		System.out.println("������"+ count +"��·��");
		System.out.println("ʣ��" + money);
	}
}