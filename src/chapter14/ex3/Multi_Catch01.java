package chapter14.ex3;

public class Multi_Catch01 {

	public static void main(String[] args) {
		// 여러 예외가 동시에 발생 된 경우 처리

		// 1. 두개의 Exception 을 각각의 try ~ catch 로 처리.

		try {
			System.out.println(3 / 0); // 실행시 : ( ArithmeticException )
		} catch (ArithmeticException e) {
			System.out.println("숫자 0으로는 나눌 수 없습니다.");
		} finally {
			System.out.println("첫번째 프로그램 종료.");
			System.out.println("===========================");
		}

		try {
			int num = Integer.parseInt("10A"); // 실행시 : ( NumberFormatException )
		} catch (NumberFormatException e) {
			System.out.println("문자를 숫자로 바꿀수 없습니다.");
		} finally {
			System.out.println("두번째 프로그램 종료.");
			System.out.println("===========================");
		}

		System.out.println("================2. 두번째 방법 ===================");

		try {
			System.out.println(3 / 0); // 실행시 : ( ArithmeticException )
			int num = Integer.parseInt("10A"); // 실행시 : ( NumberFormatException )
		} catch (ArithmeticException e) {
			System.out.println("숫자 0으로는 나눌 수 없습니다.");
		} catch (NumberFormatException e) {
			System.out.println("문자를 숫자로 바꿀수 없습니다.");
		} finally {
			System.out.println("세번째 프로그램 종료.");
			System.out.println("===========================");
		}

		// 3. 하나의 try ~ catch 에서 한번에 처리.
		System.out.println("======================3번째 방법=======================");

		try {
			System.out.println(3 / 1); // 실행시 : ( ArithmeticException )
			int num = Integer.parseInt("10A"); // 실행시 : ( NumberFormatException )
		} catch (ArithmeticException | NumberFormatException e) {
			if (e instanceof ArithmeticException) {
				System.out.println("숫자 0으로는 나눌 수 없습니다.");
			}

			if (e instanceof NumberFormatException) {
				System.out.println("문자를 숫자로 바꿀수 없습니다.");
			}
		} finally {
			System.out.println("네번째 프로그램 종료.");
			System.out.println("===========================");
		}

		// 2. 하나의 try ~ catch 에서 한꺼번에 처리.

	}
}
