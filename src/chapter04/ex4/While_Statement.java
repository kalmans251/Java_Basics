package chapter04.ex4;

public class While_Statement {

	public static void main(String[] args) {
		// While 문 : 반복문 , 조건이 true 동안 반복, 조건이 False면 빠져나온다.

		/*
		 	for (초기식; 조건 ; 증감식) {
		 		실행블락;
		 	}
		 */

		/*
		  초기값
		  While (조건) {
		  	실행문;
		  	증감식;
		  }
		 */

		//1, While 문의 기본 문법 구조. (증감식을 처리하지 않으면 무한 루프)
		System.out.println("=== while 문으로 출력 ===");
		int a = 0;
		while ( a < 10 ) {
			System.out.println(a + "  ");
			a++;
		}
		System.out.println();

		//2. for 문으로 변환,
		System.out.println("======= For 문으로 출력 =======");
		for ( a = 0 ; a < 10 ; a++) {
			System.out.print(a+" ");
		}
		
		System.out.println("\n============================");
		
		//while 문 vs for 문으로 처리,  ; 100부터 1까지 2씩 감소해서 출력.
		
		int c = 100;
		while(c > 1) {
			System.out.println(c);
			c -=2;
		}  //while 문
		
		for(int i = 100 ; i > 1 ; i-=2) {
			System.out.println(i);
		}  //for 문

		System.out.println();
		System.out.println("============= while 에서 무한 루프 =============");
		
		boolean ab = true;
		int d = 0;
		while ( ab ) {  //기본 자료형은 반드시 초기값이 할당 되어 있어야 한다.
			System.out.printf(" 무한 루프%d\n ",d);
			
			if (d > 100) {
				break;
			}
			d++;
		}
		System.out.println(" while 문 빠져나옴 ");
		
	}

}
