package chapter13.ex4;

/*
 익명 클래스 (Anonymous Inner Class) : 메소드 내부에 선언된 클래스 <==== 굉장히 많이 사용.
 		-- 메서드 내부의 필드를 이너클래스가 사용할 경우 final 키가 자동으로 할당 ( 컴파일러에서 자동으로 할당 )
 */

class A {// 외부 클래스.
	
	int a = 3;
	A(){}
	A(int a){			//생성자를 사용해서 필드의 값 지정
		this.a = a;
	}
	
	public void setA(int a) {	// Setter 를 사용해서 필드값 지정
		this.a = a;
	}
	void abc() {	//메소드
		
		int b = 5;
		
		class B {  //지역 이너 클래스 : 메소드 내부에 선언된 클래스.
					//메소드를 호출시 작동이 되므로 메소드 내부에서 객체를 생성해야함.
			void bcd() {
				System.out.println(a);
				System.out.println(b);
			}
		}
		B bb = new B();  //메소드 내부에서 객체 생성.
		bb.bcd();		 //객체 생성후 메소드 호출.
		
	}
}

public class InnerClass_Anonymous {

	public static void main(String[] args) {
		// 1. 객체 생성후 메소드 호출
		A a = new A();
		a.abc();		//메소드를 호출시 B Class 가 객체 생성이되고 B 클래스의 메소드 bcd() 호출
		

	}

}
