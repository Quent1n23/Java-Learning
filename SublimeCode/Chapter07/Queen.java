//�˻ʺ����⣬�����㷨�ĵ��Ͱ���
//����д
public class Queen{

	//��дһ��main����
	public static void main(String[] args) {
		//������ά���飬��������
		int[][] map = new int[8][8];
		//ȫ����ֵ 0 
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				map[i][j] = 0;
			}
		}
		
		//��ӡ
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + "\t");
			}
			System.out.println();
		}

		
		
		Q q = new Q();
		q.sortQueen(map,0,4);


		
		System.out.println("���ûʺ�");
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + "\t");
			}
			System.out.println();
		}

		// q.conAttack(map,0,4);
		// System.out.println("ȡ�����ûʺ�");
		// for(int i = 0; i < map.length; i++) {
		// 	for(int j = 0; j < map[i].length; j++) {
		// 		System.out.print(map[i][j] + "\t");
		// 	}
		// 	System.out.println();
		// }
		

		

	}
}

class Q {
	//����a,bȷ����һ���ʺ��λ��map[0][0]
	//����λ�ã����ж��ܲ��ܷţ����ܷţ��˳�
	//�ܷţ�
	//1. ��Ϊ1�����ù�����Χ
	//2. ��һ�У��ӵ�һ�п�ʼ �ж�
	public boolean sortQueen(int[][] map, int a, int b){
		// boolean isOK = false;
		// for(int i = 0; i < map.length; i++) {
		// 	for(int j = 0; j < map[i].length; j++) {
		// 		if(map[i][j] != 3){
		// 			isOK = true;
		// 		}
		// 	}
		// }
		//boolean isDead = true;
		if(map[a][b] == 3 || map[a][b] == 2) {
			//˵���ڹ�����Χ��,���߷Ź����߲�ͨ�����ܷ�
			return false;
		} else if(map[a][b] == 0){//�ܷ�
			map[a][b] = 1;//�����ܷ�
			attack(map, a, b);//���ù�����Χ	
			
		} 
		//ѭ����һ��ÿһ��λ��
		for(int i = 0; i < map.length; i++) {
			sortQueen(map, a+1, i);//���ݵ�[0][0]λ��
									
		}
		conAttack(map,a,b);	



		// for(int i = 0; i < map.length; i++) {
		// 	sortQueen(map, a+1, i);
		// }

		return true;
	}


	//���ù�����Χ ����
	public void attack(int[][] map, int a, int b){
		//�ʺ󹥻���Χ��Ϊ3,ÿ�в��øı�
		//���Ժ��֣�ÿ�еĹ�����ΧҲ�ü���
		for(int i = 0; i < map.length; i++) {
			if(i != b){
				map[a][i] = 3;//ÿ��
			}
		}
		for(int i = a+1; i < map.length; i++){
			map[i][b] = 3;//ÿ��
		}
		for(int i = a+1; i < map.length; i++){
			for(int j = b+1; j < map[i].length; j++) {
				if(b-a == j-i){
					//�Խ��߸�ֵ,�Խ����ϵģ���-�У�ֵ���
					map[i][j] = 3;//����
				}	
			}
		}
		for(int i = a+1; i < map.length; i++){
			for(int j = b-1; j >= 0; j--) {
				if(a+b == i+j) {
					//�Խ��߸�ֵ,�Խ����ϵģ���+�У�ֵ���
					map[i][j] = 3;//����
				}	
			}
		}
	}

	//ȡ��������Χ ����
	//���ѵ�ǰ�ʺ�λ����Ϊ2���ʺ��ܷ�������
	public void conAttack(int[][] map, int a, int b){
		for(int i = 0; i < map.length; i++) {
			if(i != b){
				map[a][i] = 0;//ÿ��
			}
		}
		for(int i = a+1; i < map.length; i++){
			map[i][b] = 0;//ÿ��
		}
		for(int i = a+1; i < map.length; i++){
			for(int j = b+1; j < map[i].length; j++) {
				if(b-a == j-i){
					//�Խ��߸�ֵ,�Խ����ϵģ���-�У�ֵ���
					map[i][j] = 0;//����
				}	
			}
		}
		for(int i = a+1; i < map.length; i++){
			for(int j = b-1; j >= 0; j--) {
				if(a+b == i+j) {
					//�Խ��߸�ֵ,�Խ����ϵģ���+�У�ֵ���
					map[i][j] = 0;//����
				}	
			}
		}
		map[a][b] = 2;
	}
}
	



