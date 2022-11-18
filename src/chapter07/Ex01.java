package chapter07;

class Calc{
	
	//두 정수의 값을 받아서 더해서 값을 던져줌
	int add ( int a , int b) {
		System.out.printf("%d + %d = ",a,b);
		return a + b ;
	}
	
	// 빼기 (diff)
	int diff(int a, int b) {
		System.out.printf("%d - %d = ",a,b);
		return a-b;
	}
	
	// 곱하기 (mul)
	int mul(int a, int b) {
		System.out.printf("%d x %d = ",a,b);
		return a*b;
	}
	
	// 나누기 (div) : double
	double div(int a , int b) {
		System.out.printf("%d / %d = ",a,b);
		return (a/(double)b);
	}
	
	//면적 (Rec) (가로 : x  ,  세로 : y) 
	double rec(double x ,double y) {
		System.out.printf("가로 %.3f  세로%.3f 인 사각형 넓이 = ",x,y);
		return x*y;
	}
}

public class Ex01 {

	public static void main(String[] args) {
		//
		Calc cal = new Calc();
		System.out.println(cal.add(10, 20));
		System.out.println(cal.diff(50, 22));
		System.out.println(cal.mul(40, 50));
		System.out.printf("%.5f\n",cal.div(100, 55));
		System.out.printf("%.5f",cal.rec(20, 68.8));
	}
}
