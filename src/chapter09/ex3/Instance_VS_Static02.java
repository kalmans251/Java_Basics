package chapter09.ex3;


class C {
	int a = 10;				//인스턴스 필드 : 객체화 해서 사용 가능.
	static int b = 20;		//정적 필드 : 객체화 하지 않고 사용 가능,
									// 모든 객체에서 공유되는 변수.
	void print1() {
		System.out.println(a + " " + b);
	}
	static void print2() {   // static 정적 메소드에는 인스턴스 필드가 올 수 없다.
							 // 정적 메소드에서는 정적 필드만 올 수 있다.
		System.out.println(b);
	}
}


public class Instance_VS_Static02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1 = new C();
		C c2 = new C();						//인스턴스 필드 : 자신의 객체만 적용.
		c1.a = 100;             //b는 Static 필드로 인스턴스생성으로 새로운 객체를 여러개로 만든다 해도 같은 주소를 참조하여 모두 연결되어있다. 
		c1.b = 777;						//     즉 static 필드는 모든 인스턴스가 공유한다. 
		
		System.out.println(c1.a);
		System.out.println(c1.b);
		c1.print1();
		c1.print2();
		
		System.out.println("==============================");
		
		// System.out.println(C.a); //오류
		System.out.println(C.b);
		// C.print1();	//오류
		C.print2();
		
		System.out.println("==============================");
		C c3 = new C();
		
		c1.a = 888;
		c2.a = 999;
		c3.a = 777;
		c1.b = 111;  // 모든 객체에서 공유되는 블락.
		
		System.out.println(c1.a);		//인스턴스 필드 : 다른 객체와 분리된 고유 공간
		System.out.println(c2.a);		//인스턴스 필드 : 다른 객체와 분리된 고유 공간
		System.out.println(c3.a);		//인스턴스 필드 : 다른 객체와 분리된 고유 공간
		System.out.println(c1.b);		// 공유  / 정적 필드 : 모든 인스턴스(객체)에서 공유되는 공간.
		System.out.println(c2.b);		// 공유
		System.out.println(c3.b);		// 공유
		
		
		
		
		
		
	}

}
