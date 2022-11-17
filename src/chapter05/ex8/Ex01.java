package chapter05.ex8;

public class Ex01 {

	public static void main(String[] args) {
		// <문제>
		//    args : 합계 40 77 99 100 200 
		
		// 합계 : <정수를 더한 값을 출력>
		int sum=0;
		
		for( int i = 0 ; i < args.length ; i++) {
			sum += Integer.parseInt(args[i]);
		}
		System.out.println("합계 : " + sum);
		
		System.out.println("========================");
		
		System.out.println(" 합계 " + 1 + 2 + 3 ); // 합계 123. 
		System.out.println( 1 + 2 + 3 + "합계" );  // 6 합계.
	}
}



//  System.out.println("합계 : " + ( f+g+ ) )


