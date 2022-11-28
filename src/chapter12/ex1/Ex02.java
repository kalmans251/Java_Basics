package chapter12.ex1;

abstract class Calc2{	
	//사칙 연산을 계산 하는 계산기 추상 클래스.
	
	abstract void add(int a,int b); //더하기 연산.
	abstract void dif(int a,int b); //뺄샘 연산.
	abstract void mul(int a,int b); //곱샘 연산.
	abstract void div(int a,int b); // 나눗셈 연산.
	
}

class Calc_Impl2 extends Calc2 {		// Calc 를 구현한 클래스.
	
	@Override
	void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("덧셈 = " + (a+b));
	}@Override
	void dif(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("뺄셀 = " + (a-b));

	}@Override
	void div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("나눗셈 = " + (a/(double)b));

	}@Override
	void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("곱셈 = " + (a*b));

	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		int b = 4;
		
		//1. 구현 클래스의 메소드 호출 후 출력.
		System.out.println("=================구현 클래스의 메소드 호출 후 출력.=====================");

		
		Calc2 c1 = new Calc_Impl2();
		
		c1.add(a, b);
		c1.dif(a, b);
		c1.div(a, b);
		c1.mul(a, b);
		
		System.out.println("==================익명 클래스로 메소드 호출 후 출력.===================");
		//2. 익명 클래스로 메소드 호출 후 출력.
		
		Calc2 c2 = new Calc2() {
			@Override
			void add(int a, int b) {
				// TODO Auto-generated method stub
				System.out.println("덧셈 = " + (a+b));
			}@Override
			void dif(int a, int b) {
				// TODO Auto-generated method stub
				System.out.println("뺄셀 = " + (a-b));

			}@Override
			void div(int a, int b) {
				// TODO Auto-generated method stub
				System.out.println("나눗셈 = " + (a/(double)b));

			}@Override
			void mul(int a, int b) {
				// TODO Auto-generated method stub
				System.out.println("곱셈 = " + (a*b));

			}
		};
		c2.add(a, b);
		c2.dif(a, b);
		c2.div(a, b);
		c2.mul(a, b);
	}
}


