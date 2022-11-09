package chapter02.ex4;

public class PrimaryDataType1 {
					
	
	public static void main(String[] args) {
		//자료형 : 변수명 앞에 반드시 선언, 변수에 어떤 값을 넣을지 지정(Java , c , c++ )
		// -기본 자료형 : boolean, byte , short , int ,long ,float , double
		// -참조 자료형 : String , 배열 , 객체 , ........ 무한대로 생성 가능
		
		//리터럴 : 변수에 할당되는 값을 통칭해서 리터럴
		
		//1.boolean : true, false
		boolean bool1 = true; //선언과 동시에 변수에 값을 할당
		boolean bool2;        //선언후
		bool2 = false;        //값 할당
		System.out.println(bool1);
		System.out.println(bool2);
		
		System.out.println("=========================");
		//2. 정수 (byte: 1byte, short: 2byte, int : 4byte , long : 8byte )
		byte value1 = -128;
		byte value2 = 127;
		
		System.out.println(value1);
		System.out.println(value2);
		
		short value3 = -32768;
		short value4 = 32767;
		
		System.out.println(value3);
		System.out.println(value4);
		
		int value5 = -2147483648;
		int value6 = 2147483647;
		
		System.out.println(value5);
		System.out.println(value6);
		
		//long 형은 8바이트,64bit , 64개중 1개는 부호판단 63개로 크기 판단.
		//long 형은 변수에 값을 할당 할때 l,L 을 붙여줘야 한다.
		// 붙여주지 않으면 int 형으로 저장된다.
		
		long value7 = -9223372036854775808L;
		long value8 = 9223372036854775807L;
				
		System.out.println(value7);
		System.out.println(value8);
		
		//3. 실수 (float : 정밀도 7자리 (4byte) , double : 정밀도 15자리(8byte))
		        //실수의 기본은 double
		
				//float : float의 값을 넣을때 리터럴 뒤에 f,F 붙임.
				//
		float value9 = 1.123456789F;
		System.out.println(value9);
		
		double value10 = 1.12345678910111213;
		System.out.println(value10);
		
		//4. 문자 (char) : 영문/한글/일본어 ..  한 글자
		// 변수의 값을 할당할 리터럴에 ''
		char value11 = 'A';
		char value12 = 'a';
		char value13 = '가';
		char value14 = '3';
		
		
		
		//5. 문자열 (string) : 여러 글자
		
		
	}
}
