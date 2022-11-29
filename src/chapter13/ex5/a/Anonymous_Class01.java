package chapter13.ex5.a;

interface A {
	void cry();
	void fly();
}

class B {
	
	void abc() {
		b.cry();
		b.fly();
	}
	
	A b = new C();
	
	//이너 클래스 : 외부 파일에 별도로 생성하지 않고 클래스 내부에 생성후 바로 사용.
	class C implements A {
		@Override
		public void cry() {
			System.out.println("엉엉 운다.");
		}
		@Override
		public void fly() {
			System.out.println("훨훨 날아간다.");
		}
	}
	
	
}



// A 클래스의 abc() 메소드 호출시 C 클래스의 구현된 메소드 출력.
public class Anonymous_Class01 {
	public static void main(String[] args) {
		
		B b = new B();
		b.abc();
		
	}
}
