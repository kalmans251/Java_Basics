package chapter13.ex2;

class A { // Outer Class
	int a = 3;
	int b = 4;
	int c = 33;
	int d = 44;

	void abc() {
		System.out.println("A 클래스의 메소드 abc()");
	}

	class B {
		int a = 5;
		int b = 6;

		void abc() {
			System.out.println("B 클래스의 메소드 abc()");
		}
		
		void def() {
			System.out.println("B 클래스의 메소드 def()");
		}
		
		void bcd() {
			System.out.println(a); // this.a
			System.out.println(b); // this.b
			abc();

			System.out.println("================");
			System.out.println(A.this.a); // Outer 클래스의 a
			System.out.println(A.this.b); // Outer 클래스의 b
			A.this.abc(); // 아우터 클래스의 abc()
			def();
		}

	}

}

public class InnerClass02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a = new A();
		a.abc();

		System.out.println("================");

		A.B ab = new A().new B();
		ab.abc();
		System.out.println("================");
		ab.bcd();

	}

}
