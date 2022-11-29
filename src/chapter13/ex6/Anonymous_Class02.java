package chapter13.ex6;

//2. 인터페이스를 구현 한 클래스를 생성하지 않고 출력 하는 경우.
		//익명 이너클래스 사용.

interface A{
	void abc();
}

class B {
	//익명 이너 클래스
//	A a = new A();
	
	A a = new A() {
		@Override
		public void abc() {
			System.out.println("익명 이너 클래스 사용해서 출력.");
		}
	};
	
	void bcd() {
		a.abc();
	}
	
}

public class Anonymous_Class02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B a = new B();
		a.bcd();
	}

}
