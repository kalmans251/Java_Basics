package chapter04.ex1;
import java.util.Scanner;
public class Ex01 {
	public void MoneyCond() 
	{
		Scanner Sc = new Scanner(System.in);
		int money;
		
		System.out.print("입금 받을 금액을 적어주세요 = ");
		money = Sc.nextInt();
		
		if(money >= 0 && money < 3000) {
			System.out.print("걸어서 다닙니다.");
		}else if(money >= 3000 && money < 30000) {
			System.out.print("지하철을 타고 다닙니다.");
		}else if(money >= 30000 && money < 100000) {
			System.out.print("택시를 타고 다닙니다.");
		}else if(money >= 100000) {
			System.out.print("비행기를 타고 다닙니다.");
		}else {
			System.out.print("음수는 입력할 수 없습니다.");
		}
		
		
	}

	public static void main(String[] args) {
		Ex01 Mc = new Ex01();
		Mc.MoneyCond();
	
		// IF 문을 사용해서
				// 스캐너를 사용해서 가지고 있는 돈을 입금 받습니다.
				// 0~3000원: 걸어서다닙니다.
				// 3000~30000: 지하철을 타고 다닙니다.
				// 30000~ 100000 : 택시를 타고 다닙니다.
				// 100000 이상 : 비행기를 타고 다닙니다.
	}

}

























