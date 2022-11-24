package chapter10.ex6;

class Aa{
	void abc() {
		System.out.println("Aa클래스의 abc 메소드.");
	}
	void ab() {
		System.out.println("Aa클래스의 ab 메소드");
	}
}

class Bb extends Aa{
	@Override
	void abc() {
		System.out.println("Bb클래스의 abc 메소드.");
	}
	void bcd() {
		abc();  //  this.abc() 는 Bb의 abc호출 super.abc()는 부모의 abc 호출
	}
	void cde() {
		super.abc();		//부모 클래스의 ab()
	}
	void def() {
		super.ab();
	}
}



public class Super_Keyword02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 
		//1, 객체 생성
		//bb : Aa,Bb 가 내포 되어 있고, 타입을 Bb 타입으로 지정.
		Bb bb = new Bb();
		
		//2. 메소드 호출
		bb.bcd();		//Bb 클라스의 abc 메소드.
		bb.cde();		//Aa 클라스의 abc 메소드.
		bb.def();		//Aa 클라스의 ab 메소드.
		
		
		
		
		
	}

}
