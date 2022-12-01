package chapter14.ex6;
// 예외 처리 : 1. try ~ catch : 내가 직접 처리, 2. throws : 예외를 전가.
	//예외를 무한히 전가하는 경우 : main 메서드에서 예외가 발생되며 멈춘다.

class Aaa {
	void abc() throws InterruptedException {
		bcd();
	}
	void bcd() throws InterruptedException {
		cde();
	}
	void cde() throws InterruptedException { Thread.sleep(1000); }
}


public class ThrowsException02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aaa a1 = new Aaa();
		
		try {
			a1.abc();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
