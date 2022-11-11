package chapter04.ex2;
import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		// <문제1> switch 문을 사용하여 프로그램 하세요.
		//   스캐너로 정수 1을 인풋 받으면 "금매달입니다" 출력
		//              2를 인풋 받으면 "은매달입니다" 출력
		//              3을 인풋 받으면 "동매달입니다" 출력
		//              그이외는       "매달이 없습니다" 출력
		int medal;
		Scanner sc1 = new Scanner(System.in);
		
		System.out.print("1입력 = 금매달, 2입력 = 은매달 , 3입력 = 동매달 , 그외 = 매달없음\n\t번호를 입력해주세요: ");
		medal = sc1.nextInt();
		System.out.println("==========");
		switch(medal){
			case 1:
				System.out.println("금매달입니다.");
				break;
			case 2:
				System.out.println("은매달입니다.");
				break;
			case 3:
				System.out.println("동매달입니다.");
				break;
			default:
				System.out.println("매달이 없습니다.");
				break;
		}
		
		//<문제2> switch 문을 사용하여 프로그램 하세요.
		// 스캐너로 문자열 gold를 인풋 받으면 "금매달입니다"출력
		//              silver 인풋 받으면 "은매달입니다"출력
		//             bronze 인풋 받으면 "동매달입니다"출력
		//             그 외의 값을 받으면 "매달이 없습니다"출력
		
		String medalStr;
		System.out.println("==========================================================================================");
		System.out.print("gold입력 = 금매달, silver입력 = 은매달 , bronze입력 = 동매달 , 그외 = 매달없음\n\t번호를 입력해주세요: ");
		medalStr = sc1.next();
		System.out.println("==========");
		switch(medalStr) {
		case "gold":
			System.out.println("금매달입니다.");
			break;
		case "silver":
			System.out.println("은매달입니다.");
			break;
		case "bronze":
			System.out.println("동매달입니다.");
			break;
		default:
			System.out.println("매달이없습니다.");
			break;
		}
		System.out.println("==========");
		sc1.close();
	}
}
