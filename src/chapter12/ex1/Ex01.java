package chapter12.ex1;

abstract class Calc {	
	//사칙 연산을 계산 하는 계산기 추상 클래스.
	
	abstract int add(int a,int b); //더하기 연산.
	abstract int dif(int a,int b); //뺄샘 연산.
	abstract int mul(int a,int b); //곱샘 연산.
	abstract double div(int a,int b); // 나눗셈 연산.
	
}

class Calc_Impl extends Calc {		// Calc 를 구현한 클래스.
	
	@Override
	int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}@Override
	int dif(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}@Override
	double div(int a, int b) {
		// TODO Auto-generated method stub
		return (a/(double)b);
	}@Override
	int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
	
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		int b = 4;
		
		//1. 구현 클래스의 메소드 호출 후 출력.
		System.out.println("=================구현 클래스의 메소드 호출 후 출력.=====================");

		
		Calc c1 = new Calc_Impl();
		System.out.printf("덧셈 %d + %d = %d\n",a,b,   c1.add(a, b)   );
		System.out.printf("뺄셈 %d - %d = %d\n",a,b,   c1.dif(a, b)   );
		System.out.printf("나눗셈 %d %% %d = %s\n",a,b,   c1.div(a, b)   );
		System.out.printf("곱셈 %d x %d = %d\n",a,b,   c1.mul(a, b)   );

		System.out.println("==================익명 클래스로 메소드 호출 후 출력.===================");
		//2. 익명 클래스로 메소드 호출 후 출력.
		
		Calc c2 = new Calc() {
			@Override
			int add(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}@Override
			int dif(int a, int b) {
				// TODO Auto-generated method stub
				return a-b;
			}@Override
			double div(int a, int b) {
				// TODO Auto-generated method stub
				return (a/(double)b);
			}@Override
			int mul(int a, int b) {
				// TODO Auto-generated method stub
				return a*b;
			}
		};
		System.out.printf("덧셈 %d + %d = %d\n",a,b,   c2.add(a, b)   );
		System.out.printf("뺄셈 %d - %d = %d\n",a,b,   c2.dif(a, b)   );
		System.out.printf("나눗셈 %d %% %d = %s\n",a,b,   c2.div(a, b)   );
		System.out.printf("곱셈 %d x %d = %d\n",a,b,   c2.mul(a, b)   );	
	}

}
