package chapter04.ex6;
import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		// 스케너로 인풋 받은 값을 선택시 해당 내용을 이중 for 문을 사용해서 출력 하세요.
		//4. 프로그램 종료시까지 무한 루프를 돌려서 작동 시키세요.
		//1 ~ 4 번 외의 내용을 선택시 " 잘못된 입력 입니다. 1 ~ 4 까지만 넣어주세요"
		int a;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("=================================================================");
			System.out.println("1. 구구단 출력 | 2. 19단 출력 | 3. 19단 중 7배수단만 출력 | 4. 프로그램 종료");
			System.out.println("=================================================================");
			System.out.print("     위 번호를 선택하세요 >>>>>>");
			a = sc.nextInt();
			
			switch(a){
			case 1:
				System.out.println("1. 구구단 출력!");
				for( int i = 1; i < 10; i++ ) {
					System.out.printf("===%d 단 출력===\n",i);
					for( int j = 1; j < 10; j++ ) {
						System.out.printf("%d X %d = %d\n",i,j,i*j);
					}
					System.out.println();
				}
				break;
			case 2:
				System.out.println("2. 19단 출력!");
				for( int i = 1; i < 20; i++ ) {
					System.out.printf("===%d 단 출력===\n",i);
					for( int j = 1; j < 20; j++ ) {
						System.out.printf("%d X %d = %d\n",i,j,i*j);
					}
					System.out.println();
				}
				break;
			case 3:
				System.out.println("3. 19단 중 7배수단만 출력!");
				for( int i = 1; i < 20; i++ ) {
					if( i%7 == 0 ) {
						System.out.printf("===%d 단 출력===\n",i);
						for( int j = 1; j < 20; j++ ) {
							System.out.printf("%d X %d = %d\n",i,j,i*j);
						}
						System.out.println();
					}
				}
				break;
			case 4:	
				System.out.println("프로그램 종료!");
				break;
				
			default:
				System.out.println("1~4번 사이의 수를 입력하세요!");
			}
		}while(a != 4);
		sc.close();
	}
}
