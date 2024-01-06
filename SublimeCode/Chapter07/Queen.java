//八皇后问题，回溯算法的典型案例
//不会写
public class Queen{

	//编写一个main方法
	public static void main(String[] args) {
		//创建二维数组，代表棋盘
		int[][] map = new int[8][8];
		//全部赋值 0 
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				map[i][j] = 0;
			}
		}
		
		//打印
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + "\t");
			}
			System.out.println();
		}

		
		
		Q q = new Q();
		q.sortQueen(map,0,4);


		
		System.out.println("放置皇后");
		for(int i = 0; i < map.length; i++) {
			for(int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + "\t");
			}
			System.out.println();
		}

		// q.conAttack(map,0,4);
		// System.out.println("取消放置皇后");
		// for(int i = 0; i < map.length; i++) {
		// 	for(int j = 0; j < map[i].length; j++) {
		// 		System.out.print(map[i][j] + "\t");
		// 	}
		// 	System.out.println();
		// }
		

		

	}
}

class Q {
	//传入a,b确定第一个皇后的位置map[0][0]
	//传入位置，先判断能不能放，不能放，退出
	//能放，
	//1. 设为1，设置攻击范围
	//2. 下一行，从第一列开始 判断
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
			//说明在攻击范围内,或者放过了走不通，不能放
			return false;
		} else if(map[a][b] == 0){//能放
			map[a][b] = 1;//假设能放
			attack(map, a, b);//设置攻击范围	
			
		} 
		//循环下一行每一个位置
		for(int i = 0; i < map.length; i++) {
			sortQueen(map, a+1, i);//回溯到[0][0]位置
									
		}
		conAttack(map,a,b);	



		// for(int i = 0; i < map.length; i++) {
		// 	sortQueen(map, a+1, i);
		// }

		return true;
	}


	//设置攻击范围 方法
	public void attack(int[][] map, int a, int b){
		//皇后攻击范围设为3,每行不用改变
		//测试后发现，每行的攻击范围也得加上
		for(int i = 0; i < map.length; i++) {
			if(i != b){
				map[a][i] = 3;//每行
			}
		}
		for(int i = a+1; i < map.length; i++){
			map[i][b] = 3;//每列
		}
		for(int i = a+1; i < map.length; i++){
			for(int j = b+1; j < map[i].length; j++) {
				if(b-a == j-i){
					//对角线赋值,对角线上的，列-行，值相等
					map[i][j] = 3;//右下
				}	
			}
		}
		for(int i = a+1; i < map.length; i++){
			for(int j = b-1; j >= 0; j--) {
				if(a+b == i+j) {
					//对角线赋值,对角线上的，列+行，值相等
					map[i][j] = 3;//左下
				}	
			}
		}
	}

	//取消攻击范围 方法
	//并把当前皇后位置设为2，皇后不能放在这里
	public void conAttack(int[][] map, int a, int b){
		for(int i = 0; i < map.length; i++) {
			if(i != b){
				map[a][i] = 0;//每行
			}
		}
		for(int i = a+1; i < map.length; i++){
			map[i][b] = 0;//每列
		}
		for(int i = a+1; i < map.length; i++){
			for(int j = b+1; j < map[i].length; j++) {
				if(b-a == j-i){
					//对角线赋值,对角线上的，列-行，值相等
					map[i][j] = 0;//右下
				}	
			}
		}
		for(int i = a+1; i < map.length; i++){
			for(int j = b-1; j >= 0; j--) {
				if(a+b == i+j) {
					//对角线赋值,对角线上的，列+行，值相等
					map[i][j] = 0;//左下
				}	
			}
		}
		map[a][b] = 2;
	}
}
	



