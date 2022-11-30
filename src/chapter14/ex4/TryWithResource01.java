package chapter14.ex4;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TryWithResource01 {

	public static void main(String[] args) {
		// try 구문에서 리소스 자동 해제, 객체를 사용후에 반드시 그 객체를 제거해야 heap메모리를 최적화.(close()) 해서 메모리를
		// 최적화.
		// 객체를 사용후 finally 블락에서 객체를 제거함.

		System.out.print("문자를 입력 하세요 ! >> ");

		// 1. 리소스 수동 해제 : finally 블락에서 객체를 close() 메소드를 호출 해서 객체를 메모리에서 제거.

		// 콘솔을 사용해서 문자열을 입력 받도록 하는 클래스 : InputStreamReader
		InputStreamReader ir1 = null;

		// 일반예외 (Catched Exception) : 프로그램 작성시 컴파일 단계에서 오류 예외처리를 해야함.
			// 반드시 예외를 처리해야한다.
		// 1. 예외를 전가 [throws]
		// 메소드 블락에서 적용됨, 메소드를 호출하는 곳에서 예외 처리를 해야함.
		// 2. 예외를 내가 처리 [try ~ catch]

		ir1 = new InputStreamReader(System.in);
		// 예외를 내가 처리
		try {
			char input = (char) ir1.read();		// 예외처리가 되어야함. 일반예외 : IOException
			System.out.println("입력한 글자는 : " + input);
		} catch (IOException e) {
			//
			System.out.println("IOException 이 발생되었습니다. 하나의 문자만 넣어주세요.");
			e.printStackTrace();
		} finally {
			// 일반적으로 객체를 사용후 finally 블락에서 객체를 제거함.
			// 객체를 제거 할 때에도 예외 처리가 되어야함.
			if (ir1 != null) { // 객체가 null일때 제거하지 않고, 객체가 null 이 아닐때 제거.
				try {
					ir1.close();		//일반예외,, 객체를 close 하는데에도 예외 처리가 있어야함.
					System.out.println("ir1 인스턴스 종료");
				} catch (IOException e) {
					System.out.println("객체 제거시 예외 발생됨.");
					e.printStackTrace();
				}
			}
		}

	}

}
