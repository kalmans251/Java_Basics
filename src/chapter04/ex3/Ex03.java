package chapter04.ex3;
public class Ex03 {
	public static void main(String[] args) {
		// <문제> : 2중 For 문을 사용해서 1단 ~ 9단 출력.
		//   1단
		//   1 * 1 = 1 , 1 * 2 = 2 , 1 * 3 = 3, ........ , 1 * 9 = 9
		//   2단
		//   2 * 1 = 2 , 2 * 2 = 4 ,.........
		
		// print ()  \t : 탭으로 구분.
		for ( int i = 1 ; i < 10 ; i++) {
			System.out.printf("%d단\n",i);
			for ( int j = 1 ; j < 10 ; j++) {
				System.out.printf("%d X %d = %d, ",i,j,i*j);
			}
			System.out.println();
		}
		//printf() 를 사용해서 출력 부분을 간결하게 처리
		//
		System.out.print("==========printf()===========");
	}
}
