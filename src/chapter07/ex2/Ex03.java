package chapter07.ex2;

import java.util.Arrays;

public class Ex03 {

	public static void main(String[] args) {
		// 

		// 배열 a : 7의 배수를 저장하는 배열. : 1~ 500 까지.
		int [] a = new int[500/7];
		
		// a 배열 방에 각 방의 7의 배수를 저장.
		for( int i = 0 ; i < a.length ; i++) {
			a[i] = (i+1)*7;
		}
		
		
		
		System.out.println(Arrays.toString(a));
		
		// 배열 b : 9의 배수를 저장하는 배열.	: 1~ 500 까지.
		int[] b = new int[500/9];
		
		// b 배열 방에 각 방의 9의 배수를 저장.
		for( int i = 0 ; i < b.length ; i++) {
			b[i] = (i+1)*9;
		}
		// 배열 b의 내용을 출력
		
		
		System.out.println(Arrays.toString(b));	
		
		
		// 두 배열의 각 방의 값을 더해서 출력.
		
		System.out.println(" === arraySum 메소드 호출 === ");
		arraySum(a,b);
		
	}	
	// 두 배열을 인풋 받아서 각 방의 값을 더해서 출력하는 메소드
	public static void arraySum(int[] a , int[] b) {
		int[] c = new int[71];		//c : 두 배열의 각 방의 값을 더해서 저장하는 배열변수.
		for ( int i = 0 ; i < a.length ; i++) { // 0번부터 70까지 71번의 루프 실행.
			for ( int j = 0 ; j < b.length ; j++) { // 0번부터 54까지 55번의 루프 실행.
				if(i > 54 ) {
					c[i] = a[i];
					break;
				}
				if( i==j ) {
					c[i] =a[i]+b[i];
				}
			}
		}
		
		System.out.println(Arrays.toString(c));
		
		
	}
}		
