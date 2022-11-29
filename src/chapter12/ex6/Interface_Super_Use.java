package chapter12.ex6;




interface A {
	
	//기존의 와이파이 기능의 메소드만 구현된 상태에서 새로운 기능인 블루투스 기능이 추가됨
	
	public abstract void abc();	// 2000 년에 구현된 메소드
	public abstract void bcd(); // 2005 년에 구현된 메소드
	default void cde() {
		// 2010 년에 구현된 메소드
		System.out.println("블루투스 기능 추가됨.");
	}
	
}

class B implements A {
	@Override
	public void abc() {
		// TODO Auto-generated method stub
		System.out.println("와이파이 기능 1");
	}@Override
	public void bcd() {
		// TODO Auto-generated method stub
		System.out.println("와이파이 기능 2");
	}
	
	public void def() { //자식 클래스에서 인터페이스의 메소드 호출.
		A.super.cde();// 인터페이스 메소드 호출시 A.super 로 인터페이스 명을 사용해야 한다.
//		super.cde(); // Object 클래스의 cde() 메소드 호출이라 오류. 
	}
}



public class Interface_Super_Use {

	public static void main(String[] args) {
		// 자식 클래스에서 인터페이스의 메소드 호출.

		//1.객체 생성
		A a1 = new B();
		a1.abc();
		a1.bcd();
		a1.cde();
		
		//a1을 B 타입으로 다운 캐스팅해야 def 메소드 출력
		System.out.println("=========================");
		((B)a1).def();
		
	}

}
