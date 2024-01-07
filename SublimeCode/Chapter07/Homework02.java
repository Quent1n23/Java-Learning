

public class Homework02 {
	//编写一个main方法
	public static void main(String[] args) {
		String[] strs = {"jack", "tom", "mary", "milan"};
		//String[] strs = null;

		A02 a02 = new A02();
		int index = a02.find("milan",  strs);
		System.out.println("查找的index=" + index);
		
	}
}
//自己补充 代码健壮性
class A02 {
	//实现查找 某字符串 是否在字符串数组中，
	//返回索引，找不到 返回-1
	public int find(String findStr, String[] strs) {
		if(findStr != null && strs != null && strs.length > 0) {
			for(int i = 0; i < strs.length; i++) {
				if(findStr.equals(strs[i])) {
					return i;
				}
			}
		} else {
			System.out.println("传入的参数错误");
		}
		
		return -1;
	}
}