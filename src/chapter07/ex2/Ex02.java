package chapter07.ex2;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		//
		
		// 두 배열의 각 방의 내용을 더해서 출력하는 메소드 생성.
		
		// 배열 a : 4의 배수를 1부터 ~ 300까지
		// 배열 b : 5의 배수를 1부터 ~ 300까지
		
		int[] arr1 = MultiArray(300, 4);
		int[] arr2 = MultiArray(300, 5);
		
		int[] addAr = addArray(arr1,arr2);
		System.out.println(Arrays.toString(addAr));
		
		// 두 배열의 각 방의 값을 더해서 출력.
	}
		// 두 배열을 인풋 받아서 각 방의 값을 더해서 출력.
	public static int[] addArray(int[] a , int[] b){
		int num;
		int way = 0;
		if(a.length < b.length) {
			num = b.length;
			way = 1;
		}else {
			num = a.length;
		}
		int[] arrs = new int[num];
		
		for(int i = 0 ; i < num ; i++) {
			if(way==1) {
				if(i < a.length) {
					arrs[i] = a[i]+b[i];
				}else {
					arrs[i] = b[i];
				}
			}else {
				if(i < b.length) {
					arrs[i] = a[i]+b[i];
				}else {
					arrs[i] = a[i];
				}
			}
		}
		return arrs;
	}

	public static int[] MultiArray(int Countnum,int multi) {

		int[] arr = new int[Countnum/multi];
		for(int i = 0 ; i <arr.length ; i++) { 
			arr[i] = (i+1)*multi;
		}
		return arr;
	}
}

	