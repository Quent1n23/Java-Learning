

public class VarParameterExercise {

	//编写一个main方法
	public static void main(String[] args) {
		
		HspMethod hm = new HspMethod();
		System.out.println(hm.showScore("milan", 90.1, 80.0));
	}
}
//三个方法，分别实现
// 返回姓名和两门课成绩（总分）
// 返回姓名和三门课成绩（总分）
// 返回姓名和五门课成绩（总分）
// 封装成一个可变参数的方法

class HspMethod {
	public String showScore(String name, double... scores) {
		double totalScore = 0;
		for(int i = 0; i < scores.length; i++) {
			totalScore += scores[i];
		}

		return name + " 有 " + scores.length + "门课，总成绩=" + totalScore;
	}
	
}