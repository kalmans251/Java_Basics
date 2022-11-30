package chapter14.ex3;

public class Multi_Catch03 {

	public static void main(String[] args) {
		// Exceiption : 모든 예외의 부모 클래스 , try 블락의 모든 예외를 처리
		// 각 예외에 대한 세부적인 제어가 불가능,

		/*
		 * try { System.out.println(3 / 2.);
		 * 
		 * int[] arr1 = new int[] { 1, 2, 3 }; System.out.println(arr1[2]);
		 * 
		 * int num1 = Integer.parseInt("34A"); System.out.println(num1);
		 * }catch(Exception e){ //모든 예외를 포함. } catch(ArithmeticException e) {
		 * 
		 * }catch(ArrayIndexOutOfBoundsException e) {
		 * 
		 * }catch(NumberFormatException e) {
		 * 
		 * }
		 */

		try {
			System.out.println(3 / 2.);

			int[] arr1 = new int[] { 1, 2, 3 };
			System.out.println(arr1[2]);

			int num1 = Integer.parseInt("34A");
			System.out.println(num1);

		} catch (ArithmeticException e) {
			// 1. try 블락의 예외에 대한 세부 처리.

		} catch (ArrayIndexOutOfBoundsException e) {
			// 1. try 블락의 예외에 대한 세부 처리.

		} catch (NumberFormatException e) {
			// 1. try 블락의 예외에 대한 세부 처리.

		} catch (Exception e) {   
			// 세부적인 예외처리 후 모든 예외를 담는 Exception은 제일 마지막에 위치해야 한다.
			
			
		}
	}

}
