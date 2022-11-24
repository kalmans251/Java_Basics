package chapter10.ex8;

class A {
	A(){
		this(3); //자신 객치의 정수 1개인 생성자 호출
		System.out.println("A 생성자 1");
	}
	
	A(int a){
		System.out.println("A 생성자 2");
	}
}

class B extends A { //자식 클래스는 생성자 첫 라인에 super() 항상 위치. [샹략] , this() 넣어주면 super() 안들어감
	B(){
		this(3);
		System.out.println("B 생성자 1");
	}
	
	B(int a){
		//super();
		System.out.println("B 생성자 2");
	}
}
public class Super_Method08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 1. 
		A aa1 = new A();
		A aa2 = new A(3);
		System.out.println("==========");
		
		B bb1 = new B();
		
		System.out.println("==========");
		
		B bb2 = new B(3);
	}

}
