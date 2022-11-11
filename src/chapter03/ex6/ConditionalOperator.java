package chapter03.ex6;

public class ConditionalOperator {

	public static void main(String[] args) {
		// 3항 연산자 : if ~ else 구문을 축약 해서 사용할 때 자주 사용하는 구문
			// (조건) ? 참:거짓 ; [조건의 판별에 따라 ,참이라는 구문 실행, 거짓 구문실행]
		
		int value1 = ( 3 > 5) ? 6:9 ; // (조건)이 false로 9가 value1에 저장.
		
		System.out.println(value1); 
		
		int value2 = (3 < 5) ? 6:9; //조건이 true로 앞에 위치한 6이 저장됨.
		
		System.out.println(value2);
		
		//<문제> 
		// 스캐너로 정수 값을 입력받고 해당 정수값이 홀수면 홀수라고 출력.
		// 짝수이면 "짝수" 라고출력
		
	}

}
