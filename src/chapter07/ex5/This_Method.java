package chapter07.ex5;

class B {  //this() : this메소드는 생성자 내부에서만 사용된다.
	
	//기본 생성자
	B(){
		System.out.println("기본 생성자를 호출 했습니다.");
	}
	B(int a){
		this();		//반드시 생성자 내부에 첫 라인에 와야 한다.//기본생성자 호출
					// 자기자신의 생성자를 호출하는데 시그니처가 없는 
		System.out.println("매개변수가 하나인 생성자 입니다.");
	}
	B(int a , int b) {
		this(3);	//역시 생성자 내부 첫 라인에 와야한다. //매개변수가 1개인 생성자 호출
		System.out.println("매개변수가 정수 2개인 생성자 입니다. ");
	}
	
	B(int a , int b , int c){
		this(4,5);  // 위와 같으며 // 매개변수가 2개인 생성자를 호출한다.
		System.out.println("매개변수가 3개인 생성자 호출");
	}
	
}



public class This_Method {

	public static void main(String[] args) {
		// This() : this 메소드 : 자신의 객체의 다른 생성자를 호출할때 사용.
			// 반드시 생성자 첫 라인에 위치해야 한다.
			// this() : this메소드는 생성자 내부에서만 사용된다. 첫번째 라인에 위치
		
		//0. 정수 0개인 생성자 호출
		B b0 = new B();
		System.out.println();
		
		//1. 정수 1개인 생성자 호출
		B b1 = new B(2);
		System.out.println();
		
		//2. 정수 2개인 생성자 호출
		B b2 = new B(2,3);
		System.out.println();
		
		//3. 정수 3개인 생성자 호출
		B b3 = new B(2,3,6);
		
	}
}
