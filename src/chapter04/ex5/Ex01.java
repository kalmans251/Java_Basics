package chapter04.ex5;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제> 스캐너로 사용해서 무한루프를 설정 .. Do while 문으로
		// 스케너에서 1을 넣으면 " 1. 평균출력 " 으로 출력
		Scanner sc = new Scanner(System.in);
		int n,math,sci,eng;
		int q=0;
		String name;
		do {
			System.out.println("=================================================");
			System.out.println("1. 평균출력 | 2. 합계출력 | 3. 이름 출력 | 4. 프로그램 종료");
			System.out.println("=================================================");
		
			System.out.print("     위 번호를 선택하세요 >>>>>>");
			n = sc.nextInt();
		
			switch(n) {
			case 1:
				System.out.println("1. 평균출력 선택하셨습니다.");
				break;
			case 2:
				System.out.println("2. 합계출력 선택하셨습니다.");
				break;
			case 3:
				System.out.println("3. 이름출력 선택하셨습니다.");
				break;
			case 4:
				System.out.println("4. 프로그램 종료");
				q = 1;
				break;
			default:
				System.out.println("1~4번 이외의 수를 입력하셨습니다.");
				
					
			}
			
		}while(q == 0);
		sc.close();
		
	}

}
