

public class Method02 {

	//��дһ��main����
	public static void main(String[] args) {
		
		//�����һ�����飬�������ĸ���Ԫ��ֵ
		int[][] map = {{0,0,1}, {1,1,1}, {1,1,3}};

		//ʹ�÷������
		//����һ������
		MyTools tool = new MyTools();
		//����
		tool.printArr(map);
		tool.printArr(map);
		tool.printArr(map);


		//����map����
		//��ͳ����
		// for(int i = 0; i < map.length; i++){
		// 	for(int j = 0; j < map[i].length; j++){
		// 		System.out.print(map[i][j] + " ");
		// 	}
		// 	System.out.println();
		// }
		
	}
}

//������Ĺ��ܣ�д��һ����ķ����У�Ȼ����ø÷�������
class MyTools {
	//����������һ����ά����
	public void printArr(int[][] arr){
		//�Դ���Ķ�ά����������
		System.out.println("==========");
		for(int i = 0; i < arr.length; i++){
			for(int j = 0; j < arr[i].length; j++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}