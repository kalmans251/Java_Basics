package chapter10.ex2;

class A{}
class B extends A{}
class C extends B{}
class D extends B{}



public class Ex02 {

	public static void main(String[] args) {
		// 1. 업캐스팅 (자동으로 변환 ) : 생략시 컴파일러가 자동으로 추가 , 자식 클래스 객체 생성 ==> 타입을 부모로 선언
		// ac : A,B,C 클래스 모두 내포하고 있다.  단 A 클래스로 선언되어 A 까지 조회 가능.
		A ac = new C();
		System.out.println( ac instanceof A); // true
		System.out.println( ac instanceof B); // true
		System.out.println( ac instanceof C); // true
		System.out.println( ac instanceof D); // false
		
		// bc : A,B,C 를 모두 내포하고 있고 B 타입으로 정의, A접근 B접근이 가능하다. <<A, B 접근>>
		B bc = new C();
		System.out.println( bc instanceof A); // true
		System.out.println( bc instanceof B); // true
		System.out.println( bc instanceof C); // true
		System.out.println( bc instanceof D); // false
		
		//bc는 B 타입으로 정의 A 타입으로 업캐스팅.
		A acUpcast = bc;    // A acUpcat = new C(); 와 동일.
		
		//2.다운 캐스팅 ( 수동으로 명시 )
		A aa = new A();
			System.out.println(aa instanceof A); //true
			System.out.println(aa instanceof B); //false
			System.out.println(aa instanceof C); //false
			System.out.println(aa instanceof D); //false
		
		if ( aa instanceof B) {
			B ba = (B) aa; // 오류가 없다, 실행시 오류 발생.
		}else {
			System.out.println("aa는 B를 내포하고 있지 않아서 다운 캐스팅이 불가 합니다. ");
		}
		
		if ( aa instanceof C) {
			C ca = (C) aa;
		}else {
			System.out.println("aa는 C를 내포하고 있지 않아서 다운 캐스팅이 불가 합니다. ");
		}
		System.out.println("=================================================");
		
		//bd : A, B, D, 를 내포 하고 있고 B 타입으로 지정 <<A , B>>
		B bd = new D();
			System.out.println(bd instanceof A); //true
			System.out.println(bd instanceof B); //true
			System.out.println(bd instanceof C); //false
			System.out.println(bd instanceof D); //true
		
		
		
	}

}
