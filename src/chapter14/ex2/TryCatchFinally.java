package chapter14.ex2;

public class TryCatchFinally {
	public static void main(String[] args) {
		/*
		 예외를 처리하는 방법
		 1. 자신이 직접 예외를 처리 : try catch finally를 사용해서 처리
		 2. 예외를 전가 : throws , 메소드 뒤에 throws로 예외객체 입력.
		 	//메소드를 호출 하는 곳에서 에외를 처리.
		 	 
		 throw : 예외를 발생기키는 키워드
		 */
		
		//1. try ~ catch
		try {
			//try 블락에서 예외가 발생되면 catch 블락의 코드를 실행
			//try 블락에서 예외가 발생되지 않으면 catch 블락은 실행되지 않는다.
			System.out.println(3/0);		//실행예외 : (ArithmeticException)
			
		} catch (ArithmeticException e) {
			//try 블락에서 ArithmeticException 이 발생 되었을때 작동
			//try 블락에서 ArithmeticException 이 발생 되지 않을때는 작동 안함.
			
			System.out.println("try 블락에서 오류가 발생되었습니다. ");
			// TODO: handle exception
		}
		
		System.out.println("==============================");
		
		//2. try ~ catch ~ finally
			//finally 블락은 오류와 상관없이 실해오디는 블락.
		
		try {
			
			System.out.println(3/0);
			System.out.println("try 블락에 생성된 구문.");
			
		}catch(ArithmeticException e){ //try 에서 발생되는 Exception
			//try 블락에서 Exception 이 발생이 되었을때 실행.
			System.out.println("숫자 0으로는 나눌수가 없습니다.");
			
		}finally {
			// try 블록에서 Exception 발생 유무와 상관없이 반드시 실행됨.
			System.out.println("finally 블락 : 반드시 실행되는 블락 ");
		}
		
		System.out.println("프로그램의 마지막 입니다. ");
		
		
		
	}
}
