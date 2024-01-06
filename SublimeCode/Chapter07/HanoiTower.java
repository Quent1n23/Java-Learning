

public class HanoiTower{

	//编写一个main方法
	public static void main(String[] args) {
		
		Tower tower = new Tower();
		tower.move(3, 'A', 'B', 'C');
		
	}
}

class Tower {
	//num 表示要移动的个数, a, b, c 分别表示A塔 B塔 C塔
	public void move(int num, char a, char b, char c) {
		//num个盘，全部从A移到C，需要借助B
		//如果只有一个盘
		if( num == 1){
			System.out.println(a + "->" + c);
		} else {
			//把上面的(num-1)个盘看成整体，
			//从A移到B ，A上面剩下最大的盘就可以直接移到C
			//需要借助c
			//1. 移动上面所有的盘到b 借助c
			move(num-1, a, c, b);
			//2. 移动最下面的盘到c
			System.out.println(a + "->" + c);
			//3. B塔 所有的 移动到 C，借助A，递归调用, B塔现在有num-1个盘
			move(num-1, b, a, c);
		}
	}
}