package chapter04.ex2;
import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		// <문제> 스케너로 1월 ~ 12월까지 월을 인풋 받아서 해당 월의 일수를 출력해 주면 됩니다.
		//  출력 : 1월은 31일 입니다.
		//  출력 : 2월은 28일 입니다.
		//        month 월은 day 일 입니다.
		// switch 문으로 작성 : <<
		int month;
		int day = 30;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일수를 알고자 하는 1~12월중 입력 : ");
		month = sc.nextInt();
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.printf("%d월은 %d일만큼",month,++day);
			break;
		case 2:
			System.out.printf("%d월은 %d일만큼",month,day-=2);
			break;
		case 4: case 6: case 9: case 11:
			System.out.printf("%d월은 %d일만큼",month,day);
			break;
		default:
			System.err.println("1 ~ 12의 수를 입력 바람");
		}
		
	}

}
