package chapter09.ex2;
import chapter09.ex1.A;

public class A_test2 extends A{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A_test2 a1 = new A_test2();
		
		System.out.println();
		
		System.out.println(a1.a); // public
		System.out.println(a1.b); // protected
		// System.out.println(a1.c); // default
		// System.out.println(a1.d); // private
		a1.abc();	//public으로 접근 가능
		a1.bcd();	//protected로 상속받아 접근 가능.
		// a1.cde(); //default로 외부 패키지 접근 안됨.
		// a1.def(); // private로 접근 안됨
		
		
		
	}

}
