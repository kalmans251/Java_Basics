package chapter10.ex5;


class Aaa {
	static void print() {
		System.out.println("Aaa 클래스 Static 메소드");
	}
}



class Bbb extends Aaa {
	static void print() {
		System.out.println("Bbb 클래스 Static 메소드");
	}
}



public class Override_Static_Method {

	public static void main(String[] args) {
		// static method : 오버라이딩 되지 않는다.
			// 클래스 영역에 메소드가 저장되어 있다.	객체의 Heap 주소(위치값만) 가진다.
		
		//1. 객체 생성 없이 클래스 이름으로 접근.
		Aaa.print();
		Bbb.print();
		
		Aaa ab = new Bbb();
		ab.print();
		
		Bbb bb = new Bbb();
		bb.print();
		
		
		
		
	}

}
