package chapter04.ex1;
import java.util.Scanner;
public class If_Condition_Statement {

	
	
	
	
	
	
	
	public static void main(String[] args) {
		// IF 구문 사용하기 ( 
		//1. Type 1 : if (조건) { 실행문; :조건이 참일 때 }
		int value1 = 5;
		
		if ( value1 > 3) {
			  //조건이 참일 때 실행
			System.out.println("실행1. 참"); //조건이 참이므로 실행됨.
		}
		
		if (value1 < 3) {
			  //조건이 참일 때 실행
			System.out.println("실행2. 거짓"); //거짓으로 실행조차 안됨.
		}

		System.out.println("======={조건이 참일때 실행문 } , {} 생략가능.=========");
			//if 조건에서 실행문이 하나일때 {} 생략 가능.
		if (value1 > 6) //거짓으로 if문 실행 x
			System.out.println("중괄호 생략");
			System.out.println("중괄호 생략 여긴 if문 포함 안됨."); // 중괄호 생략은 1개의 실행문 까지만 적용.
		
		//2. type 2 : if (조건) {조건이 참일때 실행;} else { 조건이 거짓일때 실행;}
			// 삼항 연산자로 변환
			
		boolean bool1 = true;
		
		boolean bool2 = false;
		System.out.println("====if와 else 를 사용해서 출력====");
		
		if (bool1) { // bool1은 참으로 if 실행
			// 조건이 참일때 실행하는 조건;
			System.out.println("참 조건 출력");
		}
		else {
		   	// 조건이 거짓일때 실행하는 조건;
			System.out.println("거짓조건 출력");
		}
		
		
		if (bool2) { // bool2는 거짓으로 else 실행
			// 조건이 참일때 실행하는 조건;
			System.out.println("참 조건 출력");
		}
		else {
		   	// 조건이 거짓일때 실행하는 조건;
			System.out.println("거짓조건 출력");
		}
		
		System.out.println("==============================");
		
		//3항 연산자를 사용해서 if else 구문 단축
		
		System.out.println( (bool1) ? "참 조건 출력":"거짓 조건 출력");
		System.out.println( (bool2) ? "참 조건 출력":"거짓 조건 출력");
		
		System.out.println("==============================");
		
		//3. type 3 : 조건이 여러개인 경우 : 
			//if (조건1) { 조건1이 참일때 실행; } 
			//else if (조건2) { 조건2가 참일때 실행; }
			//else if (조건3) { 조건3이 참일때 실행; }
			//..
			//..
			//else { 모든 조건에 부합하지 않을때 실행; }
		System.out.print("점수를 입력하세요(0 ~ 100 점): ");
		Scanner Sc = new Scanner(System.in);
		int value3 = Sc.nextInt();
		System.out.println("==========조건을 순서대로 적용=========");
		if (value3 >= 90 ) {
				System.out.println("A학점");
			}else if (value3 >= 80 ) {
				System.out.println("B학점");   //if 문을 빠져나온다. 실행문 탈출
			}else if (value3 >= 70 ) {
				System.out.println("C학점");
			}else if (value3 >= 60 ) {
				System.out.println("D학점");
			}else if (value3 >= 50 ) {
				System.out.println("E학점");
			}else if (value3 >= 40 ) {
				System.out.println("F학점");
			}else { //위의 조건이 모두 만족하지 않으면 실행.
				System.out.println("퇴학");
			}
		System.out.println("============조건을 거꾸로 적용=========");
		
		if (value3 >= 70 ) {				//실행후 탈출 
			System.out.println("c학점");
		}else if (value3 >= 80) {
			System.out.println("B학점");
		}else if (value3 >= 90) {
			System.out.println("A학점");
		}else {
			System.out.println("F학점");
		}
		
		System.out.println("===========조건을 디테일하게 설정==========");
		
		if (value3 >= 60 && value3 < 70) {
			System.out.println("D학점");
		}else if (value3 >= 70 && value3 < 80) {
			System.out.println("C학점");
		}else if (value3 >= 80 && value3 < 90) {
			System.out.println("B학점");
		}else if (value3 >= 90 && value3 <= 100) {
			System.out.println("A학점");
		}else if (value3 >= 0 && value3 < 60){
			System.out.println("F학점");
		}else {
			System.out.println("0~100점 사이값을 넣으세요");
		}
		System.out.println("==============================");
		
		
		
		
		
	}

}
