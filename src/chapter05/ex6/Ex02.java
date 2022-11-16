package chapter05.ex6;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		// <문제>
		/*
		 	2차원 배열 변수 : arr1
		 	arr1[0][*]     <== 2의 배수만 저장.
		 	arr1[1][*]    <== 5의 배수만 저장.
		 	arr1[2][*]     <== 3의 배수와 8배수를 저장
		 	arr1[4][*]     <== 1부터 시작해 1씩증가 하는데 7의 배수는 제외.
		 	
		 	행의 갯수 : 4 ,
		 	열의 갯수 : 100개 ,
		 	
		 	1. for 문으로 출력, 2. Enhanced For, 3. Arrays.toString()
		 */
		
		int[][] arr1 = new int[4][100];
		
		for(int i = 0 ; i < arr1.length ; i++ ) {
			if(i==0) {
				System.out.println("2의 배수만 저장");
				for(int id = 0 ; id < arr1[i].length ; id++ ) {
					arr1[i][id] = (1+id)*2;
				}
			}else if(i==1) {
				System.out.println("5의 배수만 저장");
				for(int id = 0 ; id < arr1[i].length ; id++ ) {
					arr1[i][id] = (1+id)*5;
				}
			}else if(i==2) {
				System.out.println("3의 배수와 8의배수 저장");
				for(int id = 0,k=0 ; id < arr1[i].length ; id++ ) {
					while(true) {
						k++;
						if( k%3==0 || k%8==0 ) {
							arr1[i][id]=k;
							break;
						}
					}
				}
			}else if(i==3){
				System.out.println("1부터 시작해 1씩증가 하는데 7의 배수는 제외");
				for(int id = 0,k=1 ; id < arr1[i].length ; id++ ) {
					while(true) {
						if( k%7==0 ) {
							id--;
							k++;
							break;
						}else {
							k++;
							arr1[i][id]=k-1;
							break;
						}
					}
				}
			}
		}
		System.out.println("===========================1,For문으로 출력,==================================");
		
		for( int i = 0 ; i < arr1.length ; i++) {
			for( int j = 0 ; j < arr1[i].length ; j++) {
				System.out.print(arr1[i][j]+ " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println("===========================1,Enhanced For문으로 출력,==================================");
		
		for( int[] arr2 : arr1) {
			for(int arr3 : arr2) {
				System.out.print(arr3+ " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println("===========================1,Arrays.toString() 문으로 출력,==================================");
		
		for(int[] k : arr1) {
			System.out.println(Arrays.toString(k) );
		}
	}
}
