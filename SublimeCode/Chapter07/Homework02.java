

public class Homework02 {
	//��дһ��main����
	public static void main(String[] args) {
		String[] strs = {"jack", "tom", "mary", "milan"};
		//String[] strs = null;

		A02 a02 = new A02();
		int index = a02.find("milan",  strs);
		System.out.println("���ҵ�index=" + index);
		
	}
}
//�Լ����� ���뽡׳��
class A02 {
	//ʵ�ֲ��� ĳ�ַ��� �Ƿ����ַ��������У�
	//�����������Ҳ��� ����-1
	public int find(String findStr, String[] strs) {
		if(findStr != null && strs != null && strs.length > 0) {
			for(int i = 0; i < strs.length; i++) {
				if(findStr.equals(strs[i])) {
					return i;
				}
			}
		} else {
			System.out.println("����Ĳ�������");
		}
		
		return -1;
	}
}