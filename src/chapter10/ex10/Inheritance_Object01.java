package chapter10.ex10;

import java.util.Iterator;

// java.lang 패키지의 모든 클래스는 import 없이 사용 가능하다.

class A extends Object { // extends Object 생략되어있다.
	// Object 클래스의 모든 메소드를 상속 받는다.
	// 자식 클래스는 하나의 부모만 상속 할 수 있다.
	// Java는 다중 상속이 불가하다.
	// 인터페이스는 다중 상속이 가능 ,, Implements 가 가능.
	int m = 3;
	int n = 4;

	String name;

	// toString() : Object 클래스의 메소드,
	// 객체를 출력시 toString() 메소드가 작동이 되고, 기본적으로는 패키지이름.클래스이름@hashcode()
	// 객체 자체를 출력시 객체의 필드의 값을 출력하도록 재정의 해서 사용.

	@Override
	public String toString() {
		return "A [m=" + m + ", n=" + n + ", name=" + name + "]";
	}
}

public class Inheritance_Object01 {

	public static void main(String[] args) {
		//
		A a = new A();

		// 객체 자체를 출력시 , Object 클래스의 toString() 작동.
		// 패키지이름.클래스이름@hashcode()
		// hashcode == 객체가 가지고있는 heap메모리의 주소.
		System.out.println(a);
		System.out.println(a.toString());
		
		
		// String 클래스는 toString 클래스가 재정의 되어져 있다.
		String s1 = new String("안녕");
		System.out.println(s1);

	}

}
