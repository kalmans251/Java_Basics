package chapter05.ex2;

public class Ex01 {

	public static void main(String[] args) {
		// <문제> arr1 배열 변수에 정수 1000 개의 방을 생성.
		//  for 문 사용해서 각 방에 3의 배수의 값을 저장
		//  for 문을 사용해서 각 방의 내용을 출력
		
		int[] arr1 = new int[1000];
		
		for(int i = 0; i < arr1.length;i++) {
			arr1[i] = (i+1)*3;
			if(i==arr1.length-1) {
				System.out.printf("%d",arr1[i]);
				continue;
			}
			System.out.printf("%d ,",arr1[i]);
		}
	}
} 
