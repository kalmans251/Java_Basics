package chapter02.ex8;


import java.util.Scanner;

public class Scanner_Using {

	public static void main(String[] args) {
		// Scanner 사용법 : 이클립스에서 콘솔로 값을 인풋 받을 수 있다.
		// --콘솔로 값을 받아서 변수에 저장하고 값을 출력 할 수 있다.
		// 1. 스케너 선언
		Scanner sc = new Scanner(System.in);
		
		String name; //이름 지정하는 변수
		int kor;     //국어 점수
		int eng;     //영어 점수
		int math;    //수학 점수
		int music;   //음악 점수
		int sience;  //과학 점수
		
		System.out.print("이름을 입력하세요.= ");
		name = sc.next();                       //문자열을 받음.
		System.out.print("국어 점수입력 = ");
		kor = sc.nextInt();						//정수를 입력 받음.
		System.out.print("영어 점수입력 = ");
		eng = sc.nextInt();						// "
		System.out.print("수학 점수입력 = ");
		math = sc.nextInt();					// "
		System.out.print("음악 점수입력 = ");
		music = sc.nextInt();					// "
		System.out.print("과학 점수입력 = ");
		sience = sc.nextInt();					// "
		
		double avg;
		int sum;
		
		sum = kor + eng + math + music + sience;
		avg = sum/5.;
		
		System.out.println("========================");
		System.out.printf("당신의 이름은 %s 입니다.",name);
		System.out.printf("총점 = %d",sum);
		System.out.printf("\n평균 = %f",avg);
		
		
		
		
	}

}
