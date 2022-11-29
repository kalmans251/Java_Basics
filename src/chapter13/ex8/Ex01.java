package chapter13.ex8;

interface Animal {
	void cry();

	void fly();
}

//인터페이스를 4가지 방법으로 출력.
// 1. Animal을 구현한 Inner 클래스를 생성후 메소드 출력.

class A1 {

	Animal b = new B1();

	void print_1() {
		b.cry();
		b.fly();
	}

	class B1 implements Animal {
		@Override
		public void cry() {
			System.out.println("1번 방법으로 cry() 출력");
		}

		@Override
		public void fly() {
			System.out.println("1번 방법으로 fly() 출력");
		}
	}
}

// 2. Animal을 익명 클래스로 생성해서 출력.

class A2 {
	
	void print_2() {
		a.cry();
		a.fly();
	}
	
	Animal a = new Animal() {
		@Override
		public void cry() {
			System.out.println("2번 방법으로 cry() 출력");
		}
		@Override
		public void fly() {
			System.out.println("2번 방법으로 fly() 출력");
		}
	};
	
	
}

// 3. 객체 메소드의 인풋 매개변수로 Animal 타입을 받아 출력 : 참조변수 생성.

class A3 {
	
	void print_3(Animal a) {
		a.cry();
		a.fly();
	}
	
}

// 4. 객체 메소드의 인풋 매개변수로 Animal 타입을 받아 출력 : 참조변수 없이.

class A4 {
	
	void print_4(Animal a) {
		a.cry();
		a.fly();
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
	// 1. Animal을 구현한 Inner 클래스를 생성후 메소드 출력.
		A1 a1 = new A1();
		a1.print_1();
		
		System.out.println("===================");
		
		
		
		
		
		
	// 2. Animal을 익명 클래스로 생성해서 출력.
		A2 a2 = new A2();
		a2.print_2();
		
		System.out.println("===================");
		
		
		
		
		
		
	// 3. 객체 메소드의 인풋 매개변수로 Animal 타입을 받아 출력 : 참조변수 생성.
		A3 a3 = new A3();
		
		Animal an = new Animal() {
			@Override
			public void cry() {
				System.out.println("3번 방법으로 fly() 출력");
			}
			@Override
			public void fly() {
				System.out.println("3번 방법으로 fly() 출력");
			}
		};
		
		a3.print_3(an);
		
		System.out.println("===================");

		
		
		
		
	// 4. 객체 메소드의 인풋 매개변수로 Animal 타입을 받아 출력 : 참조변수 없이.
		A4 a4 = new A4();
		
		a4.print_4(new Animal() {
			@Override
			public void cry() {
				System.out.println("4번 방법으로 fly() 출력");
			}
			@Override
			public void fly() {
				System.out.println("4번 방법으로 fly() 출력");
			}
		});
		
		
		System.out.println("===================");

		
		
	// 5. 참조변수를 사용하지 않고 출력???
		
	new A4().print_4(new Animal() {
		@Override
		public void cry() {
			System.out.println("4번 번외.. A4 참조변수 설정 없이 fly() 출력");
	
		}
		@Override
		public void fly() {
			System.out.println("4번 번외.. A4 참조변수 설정 없이 fly() 출력");
		}
	});
		
	}

}
