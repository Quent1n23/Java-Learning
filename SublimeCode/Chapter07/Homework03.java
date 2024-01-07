

public class Homework03 {
	//编写一个main方法
	public static void main(String[] args) {
		Book book = new Book("笑傲江湖", 300);
		book.info();
		book.updatePrice();//更新价格
		book.info();
	}
}

//实现更改某本书的价格
	//价格 > 150,改为150，价格 > 100，改为100，否则不变
class Book {
	String name;
	double price;
	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}

	
	public void updatePrice() {
		//这里 方法中没有局部变量price ， this.price 等价于 price
		if(this.price > 150) {
			this.price = 150;
		} else if(this.price > 100) {
			this.price = 100;
		}
	}

	//显示书籍的情况
	public void info() {
		System.out.println("书名=" + this.name + " 价格=" + this.price);
	}
}