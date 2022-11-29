package chapter13.ex4.a;

class A { // 외부 클래스.

	int a = 3; // 필드.
	
	//지역 이너클래스는 메소드 내부에서 객체 생성하고, 객체의 내부 메소드 호출.
	void abc() {
		int b = 5; // 지역 변수 : 메소드 실행시 만들어지고 실행이 끝나면 없어짐.
		// 메소드 내부의 지역변수가 지역 이너클래스에서 사용될 경우 상수로 바뀐다. final

		// 익명 이너 클래스
		class B { // 지역 이너 클래스
			void cde() {
				System.out.println(a);	//
				System.out.println(b);	//	<== 상수로 변경됨 : 값 수정이 불가	
			
				a = 10;
//				b = 20;	//b 라는 지역변수는 값 수정이 불가. final 키가 자동으로 등록.
			}
		}
		
		new B().cde();
	}
}

public class InnerClass_Anonymous {

	public static void main(String[] args) {
		//
		
		//1. 객체 생성후 지역 이너클래스 출력.
		((A)(new A())).abc();
		
		System.out.println("===============");
		
		A a = new A();
		a.abc();
		
	}

}
