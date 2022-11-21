package chapter07.ex3;
public class Ex01 {
	public static void main(String[] args) {
		// 가변 길이 배열 문제
		/*
		 	values[0] 의 값이 정수 1 ~ 9 가 들어올때 "파워레벨 1입니다. " 1~9까지
		 	values[1] 의 값이 정수 1 ~ 9 가 들어올때 " 스피드 레벨 1~9입니다. "
		 */
		arrayFlexible( 7 , 3 );
	}
	public static void arrayFlexible ( int ...values) {
		if(values[0] <= 9 && values[0] > 0) {
			System.out.printf("파워 레벨 %d 입니다\n",values[0]);
		}
		if(values[1] <= 9 && values[1] > 0) {
			System.out.printf("스피드 레벨 %d 입니다\n",values[1]);
		}
	}
}