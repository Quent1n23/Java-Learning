//��������

public class Stars02{

	//��дһ��main����
	public static void main(String[] args) {
		//����Ϊ��
		/*
		1. ��ӡ����
		*****
		*****
		*****
		*****
		*****
		2.��ӡ������
		*	 1	2*1-1	2���ո�	�ܲ���-1
	   ***	 3	2*2-1	1���ո�	�ܲ���-2
	  *****  5	2*3-1	0���ո�	�ܲ���-3
	  	3. ��ӡ���Ľ�����
	  	*
	   * *
	  *   *


		*/

	  	//��ӡ���Ľ�����

	  	int totalLevel = 20;
		int i = 1;
		while(i <= totalLevel){//ÿ��,����Ϊ����
			for(int k = 1; k <= totalLevel-i;k++ ){//��ӡ�ո�
				System.out.print(" ");
			}
			int j = 1;
			while(j <= 2*i-1){//ÿ�д�ӡ��*
				if(j==1 || j==2*i-1){
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				j++;
			}
			System.out.println();
			i++;
		}
		
		//��ӡ�����Ľ�����
		/* 
	  *********		9	2*5-1		�ո�0	5-5
	   *******		7	2*4-1		�ո�1	5-4
		*****		5	2*3-1		�ո�2	5-3
		 ***		3	2*2-1		�ո�3	5-2
		  *			1	2*1-1		�ո�4	5-1

		*   *
		 * *
		  *
		*/
		i -= 2;//4

		while(i >= 1){
			for(int k = 1;k <= totalLevel-i ;k++){
				System.out.print(" ");
			}

			int j = 1;
			while(j<=2*i-1){//��ӡÿ��
				if(j==1 || j==2*i-1){
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				j++;
			}
			System.out.println();
			i--;
		}
	}
}