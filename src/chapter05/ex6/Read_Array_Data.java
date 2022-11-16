package chapter05.ex6;

public class Read_Array_Data {

	public static void main(String[] args) {
		// arr1.length 
			//  1차원 배열 방의 열의 갯수를 출력.
			//	2차원 배열 방의 행의 갯수를 출력.
			//			// arr1[0].length : 0 번행의 열의 갯수를 출력.
		
		//1. 1 차원 배열일때 : arr1.lenght
		int[] arr1 = new int[400];
		System.out.println(arr1.length);  //방의 갯수(열의 갯수).
		
		//값 insert
		for ( int i = 0 ; i < arr1.length ; i++ ) {
			arr1[i] = i + 1 ;	
		}
		
		//값 출력
		for ( int i = 0 ; i < arr1.length ; i++ ) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println("=============================");
		
		
		//2. 2차원 배열일때 : arr2.length 
		int[][] arr2 = new int[2][5];
		System.out.println(arr2.length);   //2		// 2차원 배열의 행의 갯수.
		System.out.println(arr2[0].length);//5		//인덱스 0행에 열의갯수.
		System.out.println(arr2[1].length);//5		//1행의 열의 갯수.
		System.out.println();
		
		
		System.out.println("=============================");
		//3. 2차원 배열에서 이중 For문을 사용해서 값을 넣기.
		int[][] arr3 = new int[][] { {1,2,3} , {4,5,6} };
		
		for ( int i = 0 ; i < arr3.length ; i++ ) {
			// 행 정보를 출력
			for ( int j = 0 ; j < arr3[0].length ; j++ ) {  //i : 행의 방 번호, arr2.length : 행의 갯수 
				//열의 정보를 출력
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		

	}

}
