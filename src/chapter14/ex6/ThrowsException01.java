package chapter14.ex6;

//예외 처리 : 1. 직접처리 (try ~catch 문, try ~ catch 문에 AutoCloseable 임플리먼트 close메소드 오버라이딩
// 		   2. 예외전가 (throws) : 예외를 호출하는 곳으로 미루는것.
			// 호출 하는 곳에서 예외를 처리해야 한다.

//1. 하위 메소드에서 직접 예외를 처리하는 방법

class A {
	void abc() {
		bcd(); 		//bcd(); 메소드 호출됨.
	}
	
	void bcd() { 	//bcd 메소드 내부에서 예외 처리가됨.
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //쓰레드를 1초동안 잠재워라. 일반예외 - 1. 직접처리 , 
	}
}

//2. 예외를 호출하는 메소드로 전가 : throws 

class B {
	void abc() {
		try {
			bcd();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	void bcd() throws InterruptedException {		//bcd() 메소드를 호출하는 곳에서 예외를 처리하도록 미룬다.
		Thread.sleep(1000);
	}
	
}




public class ThrowsException01 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
