package chapter12.ex3;

interface A{}
interface B{}

// 1. 단일 인터페이스 상송
class C implements A{
	
}

class E implements B{
	
}

// 2. 다중 인터페이스 상송
class D implements A,B {
	
}

//3. class 와 인터페이스를 한번에 상속 { extends 먼저. implements 를 나중에 }
		// 자바는 하나의 부모 클래스만 가진다. 인터페이스는 다중 상속이 가능.

class F extends C implements A,B {
	
}

public class InterFace_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
