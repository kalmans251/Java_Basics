package chapter14.ex3;

public class Ex01 {

	public static void main(String[] args) {
		// 3 개의 예외를 하나의 try ~ catch 블락에 넣고,
			// 1. 각각에 대해서 catch 블락 생성
			// 2. 하나의 catch 에 3개의 예외를 모두 적용
		
		
		
		try {
			System.out.println(3/0);
			
			int[] arr = new int[] {1,2,3};
			System.out.println(arr[5]);
			
			int num = Integer.parseInt("34A");
			System.out.println(num);

		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("어레이 인덱스값을 초과했습니다.");
		} catch (NumberFormatException e) {
			System.out.println("문자를 숫자로 바꿀수 없습니다");
		} finally {
			System.out.println("각각의 catch블락을 생성 출력 방법1.");
		}
		
		System.out.println("======================================================");
		
		try {
			System.out.println(3/0);
			
			int[] arr1 = new int[] {1,2,3};
			System.out.println(arr1[5]);
			
			int num1 = Integer.parseInt("34A");
			System.out.println(num1);
		} catch (ArithmeticException|ArrayIndexOutOfBoundsException|NumberFormatException e) {
			System.out.println("0으로 나눌수 없습니다");
			System.out.println("어레이 인덱스값을 초과했습니다.");
			System.out.println("문자를 숫자로 바꿀수 없습니다");
		}finally {
			System.out.println("하나의 catch블락에 3개의 Exception 조건, 출력 방법2.");
		}
		
	}

}
