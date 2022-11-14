package chapter04.ex3;

public class Ex02 {

	public static void main(String[] args) {
		// <문제> 2중 for 문을 사용해서 1단 ~ 19단 까지 출력
		// 3의 배수단과 7의 배수단을 출력 
		
		for ( int i = 1 ; i < 20 ; i++ ) {
			if ( i%3 == 0) {
				System.out.printf("구구단 %d단 출력[3배수단]\n",i);
				for ( int j = 1 ; j < 10; j++ ) {
					System.out.printf("%d X %d = %d\n",i,j,i*j);
				}
			}
		}
	}
}
