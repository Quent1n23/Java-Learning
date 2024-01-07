

public class Homework09 {
	//编写一个main方法
	public static void main(String[] args) {
		Music music = new Music("流沙", 300);
		music.play();
		System.out.println(music.getInfo());
	}
}

//音乐名 name ，音乐时长times 属性
// 播放play功能 和 返回本身属性信息的功能方法 getInfo
class Music {
	String name;
	int times;
	public Music(String name, int times) {
		this.name = name;
		this.times = times;
	}

	//播放功能
	public void play() {
		System.out.println("音乐 " + name + " 正在播放中... 时长为" + times + " 秒");
	}
	//返回本身属性信息的功能方法
	public String getInfo() {
		return "音乐 " + name + "时长为" + times;
	}
}