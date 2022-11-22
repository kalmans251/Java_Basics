package chapter07.ex5;

class Aa {	//this() 를 사용하지 않고 생성자 작성
	//필드
	int m1, m2, m3 , m4;
	
	//생성자
	Aa(){	//기본생성자 : 필드의 기본값 초기화.
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	
	Aa(int a) {		// 매개변수 하나 받아서 m1에 저장.
		m1 = a;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	
	Aa(int a, int b) {
		m1 = a;
		m2 = b;
		m3 = 3;
		m4 = 4;
	}
	
	Aa(int a, int b , int c) {
		m1 = a;
		m2 = b;
		m3 = c;
		m4 = 4;
	}
	
	Aa(int a, int b , int c , int d) {
		m1 = a;
		m2 = b;
		m3 = c;
		m4 = d;
	}
	
	void print() {
		System.out.printf("%d %d %d %d\n",m1,m2,m3,m4);
	}
	
}

class Bb {	//this() 를 사용하면서 생성자 작성
	//필드 선언
	int m1,m2,m3,m4;
	
	Bb(){
		m1 =1;
		m2 =2;
		m3 =3;
		m4 =4;
	}
	
	Bb(int a){
		this();
		m1 =a;
	}
	
	Bb(int a, int b){
		this(a);
		m2=b;
	}
	
	Bb(int a, int b , int c){
		this(a,b);
		m3=c;
	}
	
	Bb(int a, int b, int c, int d){
		this(a,b,c);
		m4=d;
	}
	
	void print() {
		System.out.printf("%d %d %d %d\n",m1,m2,m3,m4);
	}
}


public class This_Method02 {

	public static void main(String[] args) {
		// this() : 생성자 내부에서 사용이 되고 , 첫 라인에 위치 해야하고, 자신의 객체의 
		// 다른 생성자 호출.
		
		Aa a0 = new Aa();
		a0.print();
		System.out.println();
		
		Aa a1 = new Aa(84);
		a1.print();
		System.out.println();
		
		Aa a2 = new Aa(15,34);
		a2.print();
		System.out.println();
		
		Aa a3 = new Aa(25,72,43);
		a3.print();
		System.out.println();
		
		Aa a4 = new Aa(34,25,64,32);
		a4.print();
		System.out.println();
		
		System.out.println("========================");
		System.out.println();
		
		Bb b0 = new Bb();
		b0.print();
		System.out.println();
		
		Bb b1 = new Bb(84);
		b1.print();
		System.out.println();
		
		Bb b2 = new Bb(15,34);
		b2.print();
		System.out.println();
		
		Bb b3 = new Bb(25,72,43);
		b3.print();
		System.out.println();
		
		Bb b4 = new Bb(34,25,64,32);
		b4.print();
		System.out.println();
		
	}

}
