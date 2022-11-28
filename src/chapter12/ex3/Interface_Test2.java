package chapter12.ex3;

interface Animal1 {
	public abstract void cry();
}

interface Animal2 {
	public abstract void run();
}

interface Animal3 {
	public abstract void eat();
}

//interface extends interface
interface K extends Animal1,Animal2,Animal3{ // 동일한 인터페이스 일경우 extends 를 사용한다.
	
}

class G implements K {
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}

class Aa {		//일반 클래스 : 모든 메소드는 실행부가 존재한다.
	void abc() {
		System.out.println("Aa 의 abc()");
	}
}

abstract class Bb {		//추상 클래스 : 추상 메소드가 하나라도 있을때.
	abstract void bcd();
}

// class Cc extends Aa,Bb {    //extends 키 다음에는 1개의 클래스만 올 수 있다.
// 	
// }
//                             //implements 뒤에는 여러개의 인터페이스가 올 수 있다.
//                           
class Cc extends Aa implements Animal1,Animal2,Animal3{
	
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}



public class Interface_Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
