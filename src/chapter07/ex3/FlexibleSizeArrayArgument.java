package chapter07.ex3;

import java.util.Arrays;

public class FlexibleSizeArrayArgument {

	public static void main(String[] args) {
		// 가변길이 배열 매개변수 처리 , Argument 로 전송되는 배열의 길이가 다이나믹 하게 가변적으로 변환됨
		
		method1(3,4,5,6,9);
		method1(3,4,5,6,7,8,9);
		method1(11,12,13,14,15,16,17);
		method1();
		
		System.out.println("========================");
		method2("안녕");
		method2("안녕","하세요","반갑습니다.");
		method2("안녕","땡큐","배리","감사");
	}
	
	//가변 길이 배열 메소드 선언 : 정수를 인풋 받는 가변 길이배열.
	public static void method1(int...values) {  //2개가 들어가도 되고 100개가 들어가도됨.
		System.out.println(Arrays.toString(values));
		
	}
	
	//가변 길이 배열 메소드 선언 : 정수를 인풋 받는 가변 길이배열.
	public static void method2(String...values) {
		for( int i = 0 ; i < values.length;i++) {
			System.out.print(values[i]+" ");
		}
		System.out.println();
	}
}
