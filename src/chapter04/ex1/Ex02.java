package chapter04.ex1;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// 스케너에서 번호를 입력 받아서 아래 내용을 작동 시키는 프로그램을 작성 해주세요.
		// IF 
		int select;
		Scanner Sc = new Scanner(System.in);
		int kor;
		int eng;
		int math;
		int num;
		
		String aName;
		String bName;
		
		System.out.println("===============================================");
		System.out.println("| 1. 학점의 합계/평균 | 2. 홀수,짝수 | 3.같은 이름식별 |");
		System.out.println("===============================================");
		System.out.print(" 위의 번호를 선택 하세요. >>>>");
		
		select = Sc.nextInt();
		
	    if(select == 1) {
	    	System.out.println(" 1번 선택, 국어 영어 수학 합계 평균출력기 ==> 입력 부탁. ");
	    	System.out.print("국어점수 입력[국어]: ");
	    	kor  = Sc.nextInt();
	    	System.out.print("영어점수 입력[영어]: ");
	    	eng  = Sc.nextInt();
	    	System.out.print("수학점수 입력[수학]: ");
	    	math = Sc.nextInt();
	    	
	    	System.out.println("합계= "+(kor+eng+math));
	    	System.out.println("평균= "+(kor+eng+math)/3.);
	    	
	    	
	    }else if(select == 2) {
	    	System.out.println(" 2번 선택, 홀수 짝수 판별 프로그램 ==> 입력한 수의 홀수 짝수를 판단하여 출력");
	    	System.out.print("[홀수] [짝수] 판별할 수 입력: ");
	    	num  = Sc.nextInt();
	    	System.out.print( ((num % 2) == 0) ? "짝수":"홀수" );
	    	
	    }else if(select == 3) {
	    	
	    	System.out.println(" 3번 선택, 같은이름 식별 프로그램. ==> 두사람의 이름을 입력하고 비교값 출력");
	    	System.out.print(" 한사람의 이름을 입력.   :");
	    	aName = Sc.next();
	    	System.out.print(" 나머지 한사람 이름 입력. :");
	    	bName = Sc.next();
	    	System.out.println((bName.equals(aName)) ? "이름 일치":"이름이 다릅니다");
	    
	    }else {
	    	System.out.println("존재하지 않는 설정을 선택했습니다.[1~3 의수를 입력]");
	    }
	    
	}

}
