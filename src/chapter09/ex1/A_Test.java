package chapter09.ex1;

public class A_Test {
		//A 클래스와 동일한 패키지 내에 존재하는 클래스
	
	
	public static void main(String[] args) {
		
		A a1 = new A();
		
		System.out.println(a1.a); //public int a  :
		System.out.println(a1.b); //protected int b : 동일한 패키지 내에서 접근 가능
		System.out.println(a1.c); //default : 동일한 패키지에서 접근 가능.
		// System.out.println(a1.d); //private : 파일 내부에서만 접근 가능하여 오류.
		
		a1.abc(); //public
		a1.bcd(); //protected
		a1.cde(); //default
		// a1.def(); // private로 접근 안됨
		
	}
}
