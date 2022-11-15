package chapter05.ex2;

import java.util.Arrays;

public class Array_Input_Output {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("=====1.직접 값을 넣고 출력=====");
		//배열 변수 선언 및 방 크기 초기화
		int[] arr1 = new int[5];
		//직접 해당 방 번호에 값을 할당
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;
		//직접 방의 번호를 출력.
		System.out.println(arr1[0]+","+arr1[1]+","+arr1[2]+","+arr1[3]+","+arr1[4]);
		
		System.out.println("=====2.직접 값을 넣고 출력=====");
		
		int[] arr2 = new int[100];
		
		for(int i = 0; i < arr2.length; i++ ) {
			arr2[i] = i+1;   			//각 방의 값을 자동으로 넣는다.
			System.out.print(arr2[i]+", ");
		}
		System.out.println();
		System.out.println("===========3. Enhanced FOR (향상된 For 문)==========");
		//Enhanced For : 배열의 각방의 값을 출력 할 때.
		int[] arr3 = new int[100];
		
		//for 문을 사용해서 7의 배수만 저장.
		for ( int j=7,i=0; i<100; i++,j +=7 ) {
			arr3[i] = j;
			System.out.print(arr3[i]+", ");
		}
		System.out.println();
		//각 방의 내용을 for 문을 사용해서 출력
		System.out.println("================For 문을 사용해서 출력===============");
		for ( int i = 0; i <100 ; i++ ) {
			System.out.print(arr3[i]+", ");
		}
		System.out.println();
		System.out.println("===============향상된 For 문: Enhanced For ===============");
		// 0번방 부터 마지막 방까지 모두 출력.
		for ( int k : arr3) {
			System.out.print(k + ", ");
		}
		
		System.out.println();
		System.out.println("==============Arrays.toString(배열변수) ================");
		// Arrays.toString(arr3)   ==> 배열 변수에 저장된 모든 값들을 출력.
		//  Arrays = 객체
		//  toString() = 메소드
			// 메소드 : 객체 지향언어에서 함수를 메소드라 함(method)
		
		System.out.println(Arrays.toString(arr3)); //배열 변수의 값을 출력.
	
		
		System.out.println("================배열의 방 갯수를 출력 메소드 ==================");
		System.out.println(arr1.length);    // 방갯수 : 5개
		System.out.println(arr2.length);    // 방갯수 : 100개
		System.out.println(arr3.length);    // 방갯수 : 100개

		System.out.println("=======================================================");
		for ( int i = 0 ; i < arr3.length ; i++ ) {
			System.out.println(arr3[i] + " " );
			
			
			
			
		}
		
		
		
		
		
	}

}
