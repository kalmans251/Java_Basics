package chapter04.ex6;

public class Overlapped_Controll_Statement {

	public static void main(String[] args) {
		// 제어문의 중복
		// 1. if 구문내의 if 구문
		
		System.out.println("==========if  -  if==========");
		int value1 = 5;
		int value2 = 3;
		
		if ( value1 >= 5 ) {				//false 
			if ( value2 < 2) {
				System.out.println("실행1");
			}else {
				System.out.println("실행2");
			}
		}else {		//false 일때 실행
			System.out.println("실행3");
			
		}

		System.out.println("=======switch  -  for========");
		
		int value3 = 2;
		
		switch (value3) {
		case 1:
			for(int k=0;k < 10 ; k++) {
				System.out.println(k + "  " );
			}
			System.out.println();
			break;
		case 2:
			for( int k =10 ; k > 0 ; k-- ) {
				System.out.println(k + "  " );
			}
			System.out.println();
			break;
		default:
			System.out.println("1번과 2번밖에 없음");
				
		}
		
		System.out.println("========FOR - FOR===========");
		
		for ( int i = 0 ; i < 3 ; i++) {		///3번 루프, i 0,1,2일때 true i가 3이면 false
			System.out.println("i : " + i + " 일때" );
			for ( int j = 0 ; j < 5 ; j++) {
				System.out.println(i + " , " + j);
				
				if ( i == j ) {
					System.out.println();
					System.out.println( " i == j => " + i + " : " + j);
					System.out.println();
				}
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
