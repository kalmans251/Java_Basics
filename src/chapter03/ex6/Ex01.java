package chapter03.ex6;
import java.util.Scanner;

public class Ex01 {
	 public void Cond()
	{
		Scanner SC = new Scanner(System.in);
		
		int num;
		System.out.print("짝수 홀수 판별 하고자 하는 수 입력: ");
		num = SC.nextInt();
		System.out.println( ((num % 2) == 0) ? "짝수":"홀수");
	}
	
	public static void main(String[] args) {
		Ex01 ex = new Ex01();
		ex.Cond();
	}
}
