package chapter13.ex1;

class C {
	int a = 7;
	int b = 4;

	int add(int a, int b) {
		return a + b;
	}

	int diff(int a, int b) {
		return a - b;
	}

	int mul(int a, int b) {
		return a * b;
	}

	double div(int a, int b) {
		return (a / (double) b);
	}
	
	//이너 클래스 : Outer 클래스의 메소드를 활용해서 기능을 구현.
	class D {
		void abc() {
			System.out.println("두수의 합은 : " + add(a, b));
			System.out.println("두수의 차는 : " + diff(a, b));
			System.out.println("두수의 곱은 : " + mul(a, b));
			System.out.println("두수의 나눗셈 : " + div(a, b));
		}

	}

}

public class Ex01 {

	public static void main(String[] args) {
		// 1. 외부 객체 생성
		C.D cd = new C().new D();
		cd.abc();
		
		// 2. 내부 객체 생성
		
		
	}

}
