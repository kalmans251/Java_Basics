package chapter05.ex6;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		
			//  <3: 40분까지> <문제> p.jangwoo@gmail.com 
		
		int[][] arr1 = new int[][] { { 10,20,30,40,50},{11,12,13,14,15},{111,112,113,114,115} };
		
		//1. 이중 For 문을 사용해서 2차원 배열의 값을 출력=======================================
		System.out.println("==For 문을 사용해서 출력 ==");
		for( int i = 0 ; i < arr1.length ; i++ ) {
			for( int j = 0 ; j < arr1[i].length ; j++ ) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//2. 향상된 For 문을 사용해서 출력====================================================
		System.out.println("==Enhanced For 문을 사용해서 출력 ==");
		for ( int[] arr2 : arr1) {
			for ( int k : arr2) {
				System.out.print( k + " ");
			}
			System.out.println();
		}
		
		
		/*System.out.println("==Enhanced For 문을 사용해서 출력 ==");
		for ( int i = 0 ; i < arr1.length ; i++ ) {
			for(int k : arr1[i]) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
		*/
		
		System.out.println();
		//3. Arrays.toString()를 사용해서 출력==============================================
		System.out.println("==Arrays.toString() 문을 사용해서 출력==");
		for ( int[] arr3 : arr1 ) {
			System.out.println(Arrays.toString(arr3));
		}
	}
}
