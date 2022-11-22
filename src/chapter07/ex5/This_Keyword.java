package chapter07.ex5;

class A{
	//필드  : Heap 영역에 저장.
	int m;
	int n;
	
	//메소드 : 정수값 2개를 받음
	void init( int a , int b ) {	// 메소드 내의 : a,b,c <== 지역변수 : stack 저장.
		int c;
		c = 3;
		m = a;		//this.m 생략 : 기본적으로 this. 키가 생략
		n = b;		//this.m 생략
		
	} // 메소드 블락 끝나면 a,b,c 사라짐.
	
	//this. 키를 명시해야 한다. m n 이름이 겹칠때.
	void init2( int m , int n) {
		this.m = m;
		this.n = n;
	}
	
	//메소드
	void work() {
		init (2,3);			//this.init(2,3) 로 this. 가 생략 : 자신의 객체의 필드나 메소드 호출.
		System.out.println(m + " " + n);
	}
}



public class This_Keyword {

	public static void main(String[] args) {
		// this   [키] : 자기 자신 객체의 필드나 메소드,   <== 필드, 메소드에 적용
		// this() [메소드] : 자신객체의 다른 생성자 호출시 사용.
		// super  [키] : 상속에서 부모의 객체의 필드나 , 메소드를 사용.
		// super()[메소드] : 부모클래스의 생성자 호출 할때 사용.
		
		A a = new A();
		a.work();
		
		
		
	}

}
