package chapter07.ex2;

import java.util.Arrays;

public class ArrayArgumentsMethod {

	public static void main(String[] args) {
		// 메소드의 매개변수 ( Argument ) 가 배열
		//메소드 호출시 Argumnet로 배열을 넣고 호출
		// 1. a 배열을 생성 후 호출.
		
		int [] a = new int[] {1,2,3,4,5};
		printArray(a);

		System.out.println();
		System.out.println("==============================");
		//2. 메소드 호출시에 객체를 생성해서 호출
		printArray(new int[] {6,7,8,9,10,11,12});
		
		
		
	}
	
	//매개변수로 배열을 인풋 받는 메소드. : 배열의 각 방의 모든 내용을 출력해주는 메소드
		//메소드 : 함수( 프로그래밍의 기능 )
	public static void printArray(int[] a) {
		//1. 배열의 Index = 0 ~ 마지막 방번호까지. for문을 사용해서 출력
		System.out.println("====1. For 문을 사용해서 출력 ====");
		for(int i = 0 ; i < a.length ; i++) {
			System.out.print(i + "번방 = ");
			System.out.println(a[i]);
		}
		System.out.println("====2. Enhanced For 문을 사용해서 출력 ====");
		for(int k : a) {
			System.out.println(k);
		}
		
		System.out.println("====3. Arrays.toString() 문을 사용해서 출력 ====");
		System.out.println(Arrays.toString(a));
		
		
	}
	
	
}
