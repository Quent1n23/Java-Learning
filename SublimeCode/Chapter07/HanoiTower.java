

public class HanoiTower{

	//��дһ��main����
	public static void main(String[] args) {
		
		Tower tower = new Tower();
		tower.move(3, 'A', 'B', 'C');
		
	}
}

class Tower {
	//num ��ʾҪ�ƶ��ĸ���, a, b, c �ֱ��ʾA�� B�� C��
	public void move(int num, char a, char b, char c) {
		//num���̣�ȫ����A�Ƶ�C����Ҫ����B
		//���ֻ��һ����
		if( num == 1){
			System.out.println(a + "->" + c);
		} else {
			//�������(num-1)���̿������壬
			//��A�Ƶ�B ��A����ʣ�������̾Ϳ���ֱ���Ƶ�C
			//��Ҫ����c
			//1. �ƶ��������е��̵�b ����c
			move(num-1, a, c, b);
			//2. �ƶ���������̵�c
			System.out.println(a + "->" + c);
			//3. B�� ���е� �ƶ��� C������A���ݹ����, B��������num-1����
			move(num-1, b, a, c);
		}
	}
}