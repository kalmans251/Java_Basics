package chapter12.ex2;

interface A {		// 인터페이스 이름 : 첫자는 반드시 대문자. // 정식 표현
	//모든 필드는 public static final..
		//static : 객체 생성없이 호출이 가능. A.a 
	public static final int a = 3;
	
	//모든 메소드는 public abstract..
	public abstract void print();
	
}

//일반적인 표현 , 축약 표현
interface B {
	int a = 5;
	void abc();
	
	
}

class Bb implements B {
	@Override
	public void abc() {
		System.out.println( "B 인터페이스를 구현한 메소드.");
		
	}
}

class Aa implements A {
	
	@Override
	public void print() {
		System.out.println( "A 인터페이스를 구현한 메소드.");
		
	}
}

//추상 클래스 : 추상 메소드를 포함한 클래스 , 추상 클래스내의 추상 메소드는 abstract 키를 생략하면 안됨.
abstract class C{
	
	// 추상 클래스 내의 추상 메소드는 abstract 키를 붙여야 한다. [인터페이스 에서는 생략 가능.]
	abstract void abc ();
	
	void bcd() {
		System.out.println("C클라스의 일반 메소드 (인스턴스 메소드)");
	}
	
}

class Cc extends C {
	@Override
	void abc() {
		System.out.println("추상 클래스 C를 구현한 메소드.");
	}
}

public class Interface01 {
	
	public static void main(String[] args) {
		/*
		 인터페이스 (Interface) : 내부와 외부를 연결 시켜주는 접점, 콘센트 
		 	- 객체 생성이 불가함. 타입으로 지정은 가능.
		 	- 모든 필드는 public static final 이 생략되어 있다.
		 		- final이 붙어 값을 수정할 수 없다.
		 	- 모든 메소드는 public abstract가 생략 되어 있다. (예외 , default 메소드 , static 메소드는 예외. : 1.8버전 이후 추가됨. )
		 		- 모든 메소드는 선언부만 있어야 한다. 구현부가 있으면 안됨 : {} 
		 		- default 메소드와 static 메소드는 인터페이스에서 유일하게 구현부를 가지는 메소드.
		 	- 하나의 클래스는 하나의 부모 클래스를 상속해야 한다. , 자바는 다중 상속 불가.
		 	- 하나의 클래스는 여러개의 인터페이스를 다중 상속이 가능하다.
		 	
		 */
		
		// 1. 인터페이스는 객체화 할 수 없다. 구현되지 않는 메소드가 있기 때문에.
		//A a = new A();
		//B b = new B();
		
		
		//2. 타입 지정은 가능 하다. <==== (중요함. 많이 사용)
		A a1 = new Aa();		//A : 인터페이스 , Aa : 인터페이스를 구현한 메소드
		a1.print();				// 오버라이딩된 메소드 호출
		
		B b1 = new Bb();		//
		b1.abc();				// 오버라이딩된 메소드 호출
		
		System.out.println("=====================================");
		
		//3. 인터페이스의 필드는 public static final 생략됨
				// static : 객체생성 없이 호출이 가능 : A.a
				// final  : 값 수정 불가.
		
		System.out.println(A.a);	//static으로 인터페이스 이름으로 호출 가능
		System.out.println(B.a);	//static으로 인터페이스 이름으로 호출 가능
		
		//4. 필드의 값을 수정 할 수 없다.
		//A.a = 10; 			//final로 선언되어 수정 불가.
		//B.b = 20;				//final로 선언되어 수정 불가.
		
		System.out.println("=========추상클래스 (C)=================");
		// 1. 추상 클래스 : 객체 생성 불가.
		//C c1 = new C();
		
		//2. 추상 클래스 : 구현한 클래스를 객체화 해서 타입 지정 가능.
		C c2 = new Cc();
		c2.abc();	//오버라이딩 된 메소드.
		c2.bcd();	//C클라스의 일반 메소드. C 타입의 abc()를 호출, Cc 타입의 abc()
		
		
		
		
		
	}
}
