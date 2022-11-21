package chapter07.ex2;

import java.util.Arrays;

public class Ex01 {

	public static void main(String[] args) {
		// 메소드 매개 변수로 배열을 Argument 로 인풋
		/*
		int [] arr1 = new int[100/3];
		
		for(int i = 1,k = 0 ; i <= 100 ; i++ ) {
			if( i%3 == 0) {
				arr1[k] = i;
				k++;
			}
		}
		*/
		// 1~100까지 3의 배수의 배열을 생성 후 매소드 호출 ,  정수 : 5
			// 주의 : 100번 방까지가 아니라 100까지, 
		int[] arr3 = new int[100/3];
		for(int i = 0 ; i <arr3.length ; i++) { 
			arr3[i] = (i+1)*3;
		}
		
		printArray(5 , arr3);
		
		// 1~100까지 7의 배수의 배열을 생성 후 ,정수 : 2 
		int[] arr7 = new int[100/7];
		for(int i = 0 ; i < arr7.length ; i++) {
			arr7[i] = (i+1)*7;
		}
		
		printArray(2 , arr7);
		
		System.out.println("1부터 200까지 9의 배수만 저장후 출력.");
		System.out.println(Arrays.toString(MultiArray(200,9)));
		
	}
	
	//메소드 : static , 매개변수로 정수 1개, 배열 1개를 인풋받아서
	//		각 방의 배열의 값을 인풋받은 정수로 곱해서 출력 하는 배열.
	
	public static int[] MultiArray(int Countnum,int multi) {
		int[] arr = new int[Countnum/multi];
		for(int i = 0 ; i <arr.length ; i++) { 
			arr[i] = (i+1)*multi;
		}
		return arr;
	}
	
	public static void printArray (int a , int[] arr) {
		System.out.printf("1~100 사이 %d의 배수에 %d 를 곱한 배열출력\n ",arr[0],a);
		for(int i=0 ; i < arr.length ; i++) {
			arr[i] *= a;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	
	
	
	
	
}


	