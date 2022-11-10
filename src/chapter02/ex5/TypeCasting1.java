package chapter02.ex5;

public class TypeCasting1 {

	public static void main(String[] args) {
		// 타입 변환 (캐스팅) 
		//1. 캐스팅 방법 1
		
			//정수의 기본은 int 형으로 저장됨.
		int value1 = (int)13.3;
		long value2 = (long) 10;
		
		float value3 = (float) 5.8;
		double value4 = 10.3548;  //double 그 자체
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
		
		System.out.println("=============");
		
		//2. 캐스팅 ( l,L  /  f,F ) : long , float
			//long , float의 정의된 변수에 값을 할당 할 때. 캐스팅 해서 넣어야 한다.
			// 정수: int , 실수: double 로 기본적으로 할당되서 변환필요.
		
		long value5 = 10L;
		long value6 = 20l;
		
		float value7 = 5.8F;
		float value8 = 5.8f;
		
		System.out.println(value5);
		System.out.println(value6);
		System.out.println(value7);
		System.out.println(value8);
		
		
		

	}

}
