package chapter03.ex6;
import java.util.Scanner;

public class Ex02 extends Ex01   {
	public void Cond()
	{
		Scanner Sc = new Scanner(System.in);
		int num;
		System.out.print("3,6,9의 배수인지 판단하려는 수 입력: ");
		num = Sc.nextInt();
		System.out.println(( (num % 3) == 0 )? "3,6,9 의 배수입니다. ":"3,6,9 의 배수가 아닙니다." );
	}

	public static void main(String[] args) {
		Ex02 ex2 = new Ex02();
		Ex01 ex1 = new Ex01();
		
		ex2.Cond();
		ex1.Cond();
	}
}
