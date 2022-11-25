package chapter11.ex1;

class Aa {
	
	//생략된 생성자 출력
	// Aa(){}
	
	void print() {
		System.out.println("Aa 클래스의 print() 메소드 입니다.");
	}

	// 자식 클래스에서 재정의(오버라이딩 불가) 할 수 없도록 설정한 메소드 : 아주 중요한 메소드
	final void run() {
		System.out.println("Aa 클래스의 run() 메소드 입니다.");
	}

}

class Bb extends Aa {
	
	//Bb 기본생성자 생략됨.
	/*
	Bb(){
		super();
	}
	*/
	
	@Override
	void print() {
		System.out.println("Bb 클래스의 print() 메소드 입니다.");
	}

	//생략된 생성자 출력

	/*
	 * @Override void run() { //부모클래스 Aa 의 run() 메소드는 final 메소드로 자식클레스 Bb로 오버라이드
	 * 불가능. System.out.println("Bb 클래스의 run() 메소드 입니다."); }
	 */

}

public class Final_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Aa a1 = new Bb();
		a1.print();
		
		
		
		
		
		
	}

}
