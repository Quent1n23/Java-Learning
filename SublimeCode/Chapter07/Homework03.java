

public class Homework03 {
	//��дһ��main����
	public static void main(String[] args) {
		Book book = new Book("Ц������", 300);
		book.info();
		book.updatePrice();//���¼۸�
		book.info();
	}
}

//ʵ�ָ���ĳ����ļ۸�
	//�۸� > 150,��Ϊ150���۸� > 100����Ϊ100�����򲻱�
class Book {
	String name;
	double price;
	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}

	
	public void updatePrice() {
		//���� ������û�оֲ�����price �� this.price �ȼ��� price
		if(this.price > 150) {
			this.price = 150;
		} else if(this.price > 100) {
			this.price = 100;
		}
	}

	//��ʾ�鼮�����
	public void info() {
		System.out.println("����=" + this.name + " �۸�=" + this.price);
	}
}