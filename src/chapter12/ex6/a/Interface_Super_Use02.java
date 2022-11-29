package chapter12.ex6.a;

//자식 클래스에서 인터페이스의 메소드 호출:
	//

interface A {
	default void abc() {
		System.out.println("A 인터페이스의 default 메소드");
	}
}

interface B {
	default void abc() {
		System.out.println("B 인터페이스의 default 메소드");
	}
}

abstract class C {		// 추상 클래스 : 추상메소드 + 일반메소드 + 일반 필드.
	void cde() {
		System.out.println("추상 클래스의 일반 메소드.");
	}
}

//
class D extends C implements A,B {
	public D() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void abc() {
		// TODO Auto-generated method stub
		A.super.abc();
	}
	void hij () {
		super.cde();
	}
	void lmn() {
		A.super.abc();
		B.super.abc();
	}
}

public class Interface_Super_Use02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
