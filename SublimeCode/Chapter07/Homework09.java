

public class Homework09 {
	//��дһ��main����
	public static void main(String[] args) {
		Music music = new Music("��ɳ", 300);
		music.play();
		System.out.println(music.getInfo());
	}
}

//������ name ������ʱ��times ����
// ����play���� �� ���ر���������Ϣ�Ĺ��ܷ��� getInfo
class Music {
	String name;
	int times;
	public Music(String name, int times) {
		this.name = name;
		this.times = times;
	}

	//���Ź���
	public void play() {
		System.out.println("���� " + name + " ���ڲ�����... ʱ��Ϊ" + times + " ��");
	}
	//���ر���������Ϣ�Ĺ��ܷ���
	public String getInfo() {
		return "���� " + name + "ʱ��Ϊ" + times;
	}
}