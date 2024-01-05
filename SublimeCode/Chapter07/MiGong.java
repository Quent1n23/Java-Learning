//扩展思考：如何求出最短路径？ 
//1. 穷举
//2. 图 -> 求出最短路径

public class MiGong{

	//编写一个main方法
	public static void main(String[] args) {
		//老鼠走迷宫

		/*
		1  1  1  1  1  1  1
		1  0  0  0  0  0  1
		1  0  0  0  0  0  1
		1  1  1  0  0  0  1
		1  0  0  0  0  0  1
		1  0  0  0  0  0  1
		1  0  0  0  0  0  1
		1  1  1  1  1  1  1
		*/
		//思路
		//1. 创建迷宫，用二维数组表示 int[][] map = new int[8][7]
		//2. 规定 map 数组的元素值 0表示可以走 ； 1表示墙壁
		int[][] map = new int[8][7];
		//3. 将 最上面一行 和 最下面一行，全部设置为 1
		for(int i = 0; i < 7; i++){
			map[0][i] = 1;
			map[7][i] = 1;
		}
		//4. 将最右边一列 和 最左边一列，全部设置为 1
		for(int i = 0; i < 8; i++){
			map[i][0] = 1;
			map[i][6] = 1;
		}
		map[3][1] = 1;
		map[3][2] = 1;
		map[2][2] = 1;//添加这个障碍物，出现回溯现象

		//输出当前地图
		System.out.println("=====当前地图情况=====");
		for(int i = 0; i < map.length; i++){
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}

		//使用findWay给老鼠找路
		T t1 = new T();
		//下右上左
		t1.findWay(map, 1, 1);
		System.out.println("=====找路情况如下=====");
		for(int i = 0; i < map.length; i++){
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}
class T {
	//使用递归回溯的思想来解决老鼠出迷宫
	//1. findWay方法 就是专门来找出迷宫的路径
	//2. 如果找到，就返回true，否则返回false
	//3. map 就是二维数组，表示迷宫地图
	//4. i,j 就是老鼠的位置，初始化的位置为 (1,1)
	//5. 因为是递归的找路,所以先规定 map数组的各个值的含义
	//   0表示可以走 ; 1表示墙壁 ; 2表示可以走 ; 3表示走过，但是走不通是死路
	//6. 当map[6][5] = 2 就说明找到通路，可以退出，否则继续找
	//7. 先确定 找路策略 下->右->上->左

	public boolean findWay(int[][] map, int i, int j) {
		if(map[6][5] == 2){//说明已经找到
			return true;
		} else {
			if(map[i][j] == 0) {//当前位置 0，说明可以走，还没走过
				//假定可以走通
				map[i][j] = 2;
				//使用找路策略，来确定该位置是否真的可以走通
				//下->右->上->左
				if(findWay(map, i + 1, j)) {//下
					return true;
				} else if(findWay(map, i, j + 1)) {//右
					return true;
				} else if(findWay(map, i - 1, j)) {//上
					return true;
				} else if(findWay(map, i, j - 1)) {//左
					return true;
				} else {//下右上左都走不通，设为死路
					map[i][j] = 3;
					return false;
				}
			} else { //map[i][j] == 1,2,3 
				//递归进去后，发现1墙壁，2测试过,3走过的路，走不通，退出递归，返回上一层
				return false;
			}
		}
	}

	//8. 修改找路策略，看看路径是否有变化
	//下->右->上->左 ==> 上->右->下->左
	public boolean findWay2(int[][] map, int i, int j) {
		if(map[6][5] == 2){//说明已经找到
			return true;
		} else {
			if(map[i][j] == 0) {//当前位置 0，说明可以走，还没走过
				//假定可以走通
				map[i][j] = 2;
				//使用找路策略，来确定该位置是否真的可以走通
				//上->右->下->左
				if(findWay2(map, i - 1, j)) {//上
					return true;
				} else if(findWay2(map, i, j + 1)) {//右
					return true;
				} else if(findWay2(map, i + 1, j)) {//下
					return true;
				} else if(findWay2(map, i, j - 1)) {//左
					return true;
				} else {//下右上左都走不通，设为死路
					map[i][j] = 3;
					return false;
				}
			} else { //map[i][j] == 1,2,3 
				//递归进去后，发现1墙壁，2测试过,3走过的路，走不通，退出递归，返回上一层
				return false;
			}
		}
	}
}