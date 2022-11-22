package chapter09.ex3;


class A{
	int a = 1;			//인스턴스 필드
	int b = 2;
	
	void print() {  // 인스턴스 메소드 : 객체를 생ㅅ어해야지만 사용 가능
		System.out.println(a + " " + b);
	}
}



class B{
	static int a = 3;		//static(정적) 필드 : 객체 생성없이 클래스 이름으로 호출 가능
	static int b = 4;
	
	static void print() {		// static 메소드 :
		System.out.println(a + " " + b);
	}
}



public class Instance_VS_Static {

	public static void main(String[] args) {
		//❣
		//A class 는 인스턴스 필드 , 인스턴스 메소드 <== 객체화 해서 사용 가능
		A a1 = new A();
		System.out.println(a1.a);
		System.out.println(a1.b);
		a1.print();
		
		//B class 는 static 필드 , static 메소드 <== 클래스 이름으로 바로 호출
		System.out.println(B.a);
		System.out.println(B.b);
		B.print();
		
		//객체 생성후 필드와 메소드 호출
		B b1 = new B();
		System.out.println(b1.a);
		System.out.println(b1.b);
		b1.print();
		
		
		
	}
}
