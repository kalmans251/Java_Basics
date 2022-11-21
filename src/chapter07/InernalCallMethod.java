package chapter07;

public class InernalCallMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 클래스 내부에서 다른 메소드 호출
			// main 메소드는 메소드 이름 앞에 public : 다른 패키지에서 호출이 가능 하다.
			// static : 인스턴스화 하지 않고 사용 가능하다. 객체를 생성하지 않고 사용 가능하다.
		
		//print 메소드 호출 ( 객체 생성 없이 바로 호출이 가능)
		print();
		
		int ab = twice(33);
		System.out.println(ab);
		System.out.println("==================");
		
		//sum 메소드 호출
		double bc = sum ( 4 , 5.0);
		System.out.println(bc);
		
		//sum2 메소드 호출 : 인스턴스 메소드 : 객체화 해야 사용 가능
		InernalCallMethod ICM = new InernalCallMethod();
		
		double de = ICM.sum2(20,33.3);
		System.out.println(de);
		
		
	}

	//메소드 이름 앞에 static 키를 넣으면 객체 생성 없이 호출이 가능.
	
	public static void print() {
		System.out.println("안녕");
	}
	//정수를 인풋 받아 2배로 생성해서 리턴.
	public static int twice(int k) {
		return k *2;
	}
	public static double sum ( int m , double n) {
		
		return m + n ;
	}
	
	//static 키 없이 메소드 생성 : 인스턴스 메소드 (객체화 해야 호출이 가능)
	public double sum2 ( int m , double n) {
		
		return m + n ;
	}
	
	
}
