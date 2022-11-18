package chapter07;

class A {  //A 객체를 생성하기 위한 클래스
	
	//필드 : 객체를 생성시 Heap 영역에 필드의 값이 저장됨.
		// Heap 변수[필드]의 값이 비어 있을경우 강제 초기화, 
	int a;			// 0의 기본값으로 강제 초기화
	boolean b;		// false의 기본값으로 강제초기화
	double c;		// 0.0
	String d;		// null
	
	//필드의 기본값을 출력하는 메소드
	void defaultValue() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

class B{
	//필드 선언
	int m = 3;
	int n = 4;
	
	//기본 생성자 생략됨 : B() { }
	
	//메소드 선언
	void work1() {
		int k = 5; // 지역변수 : Stack
		System.out.println(k);
		work2(3);			//메소드 호출 ( work2 (3))
	}
	
	void work2(int i) {
		int j = 4;  //지역변수
		System.out.println(i+j);
	}
	
	
}



public class Field_Component {

	public static void main(String[] args) {
		// 클래스 내부 구성요소.
		// -Field : 필드
		// -Method : 메소드
		// -Constructor : 생성자
		
		//메소드 내부에서 선언된 변수
		int e;	// 메소드 내부에서 선언된 변수는 Stack에 변수와 값이 저장됨.
		
		//1. 객체 생성
		
		A abc = new A();    // new A() : 기본생성자 호출
		
		abc.defaultValue();  //메소드 호출
		
		System.out.println("=====================");
		
		A bcd = new A();
		bcd.defaultValue();
		
		System.out.println("=====================");
		
		B b = new B();
		b.work1();
		
	}

}
