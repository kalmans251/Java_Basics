package chapter02.ex2;

public class NamingVariable {

	public static void main(String[] args) {
		// 변수 이름 지정하기
		// 변수명은 소문자로 시작, 클래스이름은 대문자
		boolean aBcD; // true 혹은 false 에 넣을 수 있다.

		aBcD = true;
		aBcD = false;

		System.out.println(aBcD);

		byte Onebyte; // 1바이트의 데이터만 저장
		short _abcd; // 변수명으로 특수문자는 _ , $ 두개만 사용가능
		boolean $_abcd; //
		boolean $abcde; // _ , $ 이외의 특수 문자는 변수명으로 사용 불가능.

		// char 3abcd; //변수명으로 숫자사용 가능하나 첫자리에 숫자 x.
		long abcd3;
		// double main;
		// double private;; 예약어 사용 x

		char a3bcd;

		// int my work; 스페이스바 x
		int myWork; // 시작은 소문자.
		String myClassName; // 시작은 소문자.

		// 상수 : 값을 넣으면 그 값을 변화하지 못하도록 하는 것.
		// -상수명은 전체를 대문자로 지정 (권장)
		final double PI = 3.141592;
		System.out.println(PI);
		final int MY_DATA = 10;
		final float my_Data; // 권고 사항 위배[대문자로 구성하기]
	}

}
