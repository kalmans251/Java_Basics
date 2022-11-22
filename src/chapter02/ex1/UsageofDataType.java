package chapter02.ex1;
import chapter09.ex1.A;

public class UsageofDataType extends A{

	public static void main(String[] args) {
		
		UsageofDataType a1 = new UsageofDataType();
		
		a1.bcd();
		
		//변수 선언 및 값 대입을 위한 두 가지 방법
		
		//자바는 변수 선언시 값이 비어 있다.
		int a;  //변수 선언(1번만 선언)
		//System.out.println(a); //오류
		a = 3;  //변수의 값을 할당
		System.out.println(a);
		a = 5;
		System.out.println(a);

		//2.변수 선언과 동시에 초기화
		int b = 4;  //변수 선언과 동시에 값을 할당.
		System.out.println(b);
		b = 7;
		System.out.println(b);
		
		
	}

}
