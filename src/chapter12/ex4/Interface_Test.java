package chapter12.ex4;

//인터페이스에서 선언된 메소드를 구현하는 방법 2가지
	// 1. 인터페이스에 선언된 메소드를 구현한 클래스를 생성후 출력.
		//매번 자주 사용하는 경우, 
	// 2. 익명 클래스로 바로 출력 하는 방법.

interface A {
	void abc();
}

// 1. A 인터페이스의 메소드를 구현하는 클래스를 생성후 출력.
class Aa implements A {
	@Override
	public void abc() {
		System.out.println("객체 생성후 메소드 완성.");
	}
}


public class Interface_Test {

	public static void main(String[] args) {

		
		//1. A 인터페이스의 선언된 메소드를 구현한 클래스를 생성후 출력 : Aa
		A a1 = new Aa();
		a1.abc();
		
		
		//2. 익명 클래스를 사용해서 출력.
		// 익명 클래스로 출력
		A a2 = new A() {
			@Override
			public void abc() {
				System.out.println("익명클래스 선언으로 메소드 완성.");
			}
		};
		a2.abc();
	}

}
