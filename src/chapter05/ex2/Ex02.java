package chapter05.ex2;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		// <문제> arr1 , 배열의 방의 갯수 : 500 개 
		// 배열방에 3의 배수 와 5의 배수를 저장
		// 출력 : 1. for , 2. Enhanced For , 3. Array.toString()

		// <완료시간 : 2:45분 까지 >
	
		
		int[] arr1 = new int[500];
		/*
		for(int i =0,j=1; i < arr1.length; i+=2,j++) {
			arr1[i] = j*3;
		}
		for(int i =1,j=1; i < arr1.length; i+=2,j++) {
			arr1[i] = j*5;
		}
		*/
		
		
		for(int i=0,j=0; i < arr1.length; i++) {
			while(true) {
				j++;
				if(j%3==0 || j%5==0) {
					arr1[i] = j;
					break;
				}
			}
		}
		
		
		//---------------------------------------------------------
		
		System.out.println("1. for을 사용한 출력");
		for(int i=0; i<arr1.length;i++) {
			System.out.print(arr1[i]+", ");
		}
		System.out.println();
		
		//---------------------------------------------------------
		System.out.println();
		System.out.println("2. Enhanced For을 사용한 출력");
		for(int i:arr1) {
			System.out.print(i+", ");
		}
		System.out.println();
		
		//----------------------------------------------------------
		System.out.println();
		System.out.println("3. Arrays.toString 을 사용한 출력");
		
		System.out.println(Arrays.toString(arr1));
		
		
	}

}
