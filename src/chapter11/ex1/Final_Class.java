package chapter11.ex1;

class Aaa {

	int m;
	final int n;

	Aaa() {
		n = 1;
	}

	Aaa(int n) {
		this.n = n;
	}

	void run() {
		System.out.println("Aaa 클래스의 run() 입니다.");
	}

}

final class Bbb extends Aaa {

	Bbb() {
	}

	Bbb(int n) {
		super(n);
	}

}

/*  // Bbb클래스는 final 클래스로 상속이 불가능.
class Ccc extends Bbb{
	
}
*/

public class Final_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
