package chapter03.ex1;
import java.util.Scanner;
public class Ex01 {
	 /* <실습 문제> 
	  *<완료시간 : 6:10분 , p.jangwoo@gamil.com Ex01.java> 보내기
	  정수 2개를 Scanner로 인풋 받고 같으면 True 틀리면 False
	  이름 2개를 Scanner로 인풋 받고 같으면 True 틀리면 False
	  등가 연산자 사용.
	  기본 자료형 : ==
	  참조 자료형 : aName.equals(bName)
	*/
	public static void main(String[] args) {
		
		Scanner Sc = new Scanner(System.in);
		int a;
		int b;
		String aName = new String();
		String bName = new String();
		
		System.out.print("숫자비교 첫번째 수 입력. = ");
		a = Sc.nextInt();
		System.out.print("숫자비교 두번째 수 입력. = ");
		b = Sc.nextInt();
		
		System.out.printf("두개의 숫자 일치성 판단 = %s \n",(a == b));
		
		System.out.print("단어비교 첫번째 입력. = ");
		aName = Sc.next();
		System.out.print("단어비교 두번째 입력. = ");
		bName = Sc.next();
		
		System.out.printf("두개의 단어 일치성 판단 = %s \n", aName.equals(bName));	
	}
}
