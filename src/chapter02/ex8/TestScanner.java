package chapter02.ex8;
import java.util.Scanner;
/*
어머님이름,, 아버님 이름, 형제이이름,자신이름
어머님나이, 아버님나이, 형제나이, 자신나이

콘솔에서 인풋 받은 이름은 모두 출력
나이의 합계와 평균을 출력
*/

public class TestScanner {

	public static void main(String[] args) {
		
		String mname,fname,bname,myname;
		int mAge,fAge,bAge,myAge;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("어머니 [이름] = ");
		mname = sc.next();
		System.out.print("어머니 [나이] = ");
		mAge = sc.nextInt();
		
		System.out.print("아버지 [이름] = ");
		fname = sc.next();
		System.out.print("아버지 [나이] = ");
		fAge = sc.nextInt();
		
		System.out.print("형제의 [이름] = ");
		bname = sc.next();
		System.out.print("형제의 [나이] = ");
		bAge = sc.nextInt();
		
		System.out.print("본인의 [이름] = ");
		myname = sc.next();
		System.out.print("본인의 [나이] = ");
		myAge = sc.nextInt();
		
		System.out.printf("어머님 [이름,나이] = (%s , %d) ", mname , mAge);
		System.out.printf("\n아버님 [이름,나이] = (%s , %d) ", fname , fAge);
		System.out.printf("\n헝제의 [이름,나이] = (%s , %d) ", bname , bAge);
		System.out.printf("\n본인의 [이름,나이] = (%s , %d) ", myname , myAge);
		
		
		
	}

}
