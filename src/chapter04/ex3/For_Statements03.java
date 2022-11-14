package chapter04.ex3;

public class For_Statements03 {

	public static void main(String[] args) {
		// for 문 내의 for 문
		// 2중 for 문을 사용해서 구구단 출력.
		for ( int i = 1 ; i < 10  ; i++ ) {
			System.out.printf("=======\n구구단 %d단\n=======\n", i );
			for( int j = 1 ; j < 10 ; j++ ) {
				System.out.printf("%d X %d = %d \n",i,j,i*j);
			}
		}
		
		
		
		
		
	}
}
