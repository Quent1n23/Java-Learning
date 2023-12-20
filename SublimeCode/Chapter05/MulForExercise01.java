
/*
(1) 先计算一个班，5个学生的成绩和平均分，使用for
1.1 创建Scanner对象， 接收用户输入
1.2 得到该班级的平均分，定义一个double sum 把该班级5个学生的成绩累计

(2) 统计3个班，各个班平均分

(3) 所有班级平均分
3.1 定义一个变量 double totalScore 累计所有学生的成绩
3.2 当多重循环结束后，totalScore / 15

(4) 统计3个班及格人数
4.1 定义变量 int passNum = 0; 当有一个学生成绩 >= 60, passNum++
4.2 如果 >= 60 , passNum++

(5) 优化
*/

import java.util.Scanner;
public class MulForExercise01{

	//编写一个main方法
	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		double totalScore = 0;//累计所有学生的成绩
		int passNum = 0;//累计及格的人数
		for(int i = 1; i <= 3; i++){//i表示班级

			double sum = 0;
			for(int j = 1; j <= 5; j++){//j表示学生
				System.out.println("请输入第" + i + "个班的第"+ j +"个学生的成绩");
				double score = myScanner.nextDouble();
				//当有一个学生成绩 >= 60, passNum++
				if(score >= 60){
					passNum++;
				}
				sum += score;
				System.out.println("成绩为" + score);
			}
			System.out.println("sum=" + sum + " 平均分=" + (sum / 5));
			totalScore += sum;
		}
		System.out.println("totalScore=" + totalScore+ " 平均分=" + (totalScore / 15));
		System.out.println("及格人数为" + passNum );
	}
}