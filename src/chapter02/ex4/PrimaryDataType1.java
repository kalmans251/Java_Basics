package chapter02.ex4;

public class PrimaryDataType1 {

	public static void main(String[] args) {
		// 자료형 : 변수명 앞에 반드시 선언, 변수에 어떤 값을 넣을지 지정(Java , c , c++ )
		// -기본 자료형 : boolean, byte , short , int ,long ,float , double
		// 메모리의 Stack 공간에 저장 , (변수명:값)
		// -참조 자료형 : String , 배열 , 객체 , ........ 무한대로 생성 가능
		// 메모리의 Heap 공간에 변수의 값이 저장됨 ,
		// stack 공간에는 변수명: Heap에 값의 주소값을 가지고 있다.
		// 리터럴 : 변수에 할당되는 값을 통칭해서 리터럴

		// 1.boolean : true, false
		boolean bool1 = true; // 선언과 동시에 변수에 값을 할당
		boolean bool2; // 선언후
		bool2 = false; // 값 할당
		System.out.println(bool1);
		System.out.println(bool2);

		System.out.println("=========================");
		// 2. 정수 (byte: 1byte, short: 2byte, int : 4byte , long : 8byte )
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

		// long 형은 8바이트,64bit , 64개중 1개는 부호판단 63개로 크기 판단.
		// long 형은 변수에 값을 할당 할때 l,L 을 붙여줘야 한다.
		// 붙여주지 않으면 int 형으로 저장된다.

		long value7 = -9223372036854775808L;
		long value8 = 9223372036854775807L;

		System.out.println(value7);
		System.out.println(value8);

		// 3. 실수 (float : 정밀도 7자리 (4byte) , double : 정밀도 15자리(8byte))
		// 실수의 기본은 double

		// float : float의 값을 넣을때 리터럴 뒤에 f,F 붙임.
		//
		float value9 = 1.123456789F;
		System.out.println(value9);

		double value10 = 1.12345678910111213;
		System.out.println(value10);

		// 4. 문자 (char) : 영문/한글/일본어 .. 한 글자
		// 변수의 값을 할당할 리터럴에 ''
		// 1. char 자료형 변수에 직접 문자로 저장하는 방법 (
		char value11 = 'A';
		char value12 = 'a';
		char value13 = '가';
		char value14 = '3';
		char value15 = '#';

		System.out.println(value11);
		System.out.println(value12);
		System.out.println(value13);
		System.out.println(value14);
		System.out.println(value15);

		// 2. 정수값으로 문자를 저장하는 방법 : 아스키 코드 값으로 문자를 저장.

		char value16 = 65; // A
		char value17 = 0xac00; // 0x는 16진수 , 0: 8진수 , 0b : 2진수
		// 가
		char value18 = 51; // 3

		System.out.println(value16);
		System.out.println(value17);
		System.out.println(value18);

		System.out.println("===================");

		// 3. 유니코드로 저장하는 방법: 전 세계의 글자를 3byte 로 저장.
		char value19 = '\u0041'; // A
		char value20 = '\uac00'; // 가
		char value21 = '\u0033'; // 3

		System.out.println(value19);
		System.out.println(value20);
		System.out.println(value21);

		/*
		
		  
		 
		  
		 */

		char aa = '\uAE40'; // 성
		char bb = '\uB3D9';// 이름1
		char cc = '\uC900'; // 이름2

		System.out.print(aa);
		System.out.print(bb);
		System.out.print(cc);

		System.out.printf("\n%c%c%c", aa, bb, cc);

		// 김동준

		// 5. 문자열 (String) : 여러 글자를 담을 수 있다.
		// 기본자료형이 아니다. 참조 자료형 (객체)
		// 변수의 값을 할당하는 리터럴에 " "

		String value22 = "안녕하세요. 오늘의 날씨는 매우 맑습니다.";

		System.out.println(value22);

	}
}
