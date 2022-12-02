package chapter16.ex08;

class A {
	// Number : Boolean , Character 를 제외한 정수, 실수를 처리하는 클래스.
		//Byte , Short, Integer, Long, Float, Double
	
	public <T extends Number> void method1 (T t) {
		//Object 클래스의 메소드 외의 Number의 메소드를 사용가능.
		System.out.println(t.doubleValue());		//intValue() : Number 의 메소드.
	}
}

//인터페이스.
interface MyInterface {
	void print();   // public abstract 생략.
}

class B {
	
	//T : MyInterface 하위의 구현 클래스가 올 수 있다. 주의 : 타입을 제한할 때 extends를 사용 implements로 오해하기 쉬움
	public <T extends MyInterface> void method1(T t) { // 인터페이스를 implements 하여 구현하는 모든 클래스도 사용 가능. 
		t.print();
	}
}


public class BoundedTypeOfGenericMethod {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.method1(10.11);
		a.<Integer>method1(100);
		
		//a.<String> method1("안녕"); // 오류
		
		//인풋되는 타입을 적시.
		B b = new B();
		b.<MyInterface>method1(new MyInterface() {
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("print() 구현됨 ");
			}
		});
		
		//인풋되는 타입을 생략.
		b.method1(new MyInterface() {
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("print() 구현됨 2 ");
			}
		});
		
	}

}
