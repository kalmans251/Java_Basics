package chapter14.ex4;

import java.io.InputStreamReader;

public class TryWithResource02 {

	public static void main(String[] args) {
		// Try with Resource : Java 1.7
		// 일반적인 try 구문 : try { } catch (Exception e) { }
		// Try With Resource :
			// try ( 객체선언[Resource] ) { } catch (Exception e) { }
			// 자동으로 객체를 close() 
			// 자동으로 객체를 제거하기 위해서는 AutoClosable() 인터페이스를 구현 클래스만이 자동으로 제거됨.
		
		
		
		//1. 자동으로 객체를 제거하는 예제
			// (Resourece : 객체를 선언)   <== 객체를 자동으로 close() 하게 된다.
			// InputStreamReader 는 AutoCloseable 인터페이스를 구현하고 있다.
		System.out.println(" 한글자를 입력 하세요 >>> ");
		try (InputStreamReader ir1 = new InputStreamReader(System.in)) {	// 소괄호 (Resource) 블락 : 객체를 선언
			char input = (char) ir1.read();	//일반 예외 : IOException
			System.out.println("입력한 글자는 : "+input);
		} catch (Exception e) {
			System.out.println("IOException 이 발생되었습니다.");
			e.printStackTrace();
		}
		
		//finally 블락에 close() 를 쓰지 않아도 자동으로 close() 됨.
		// try ( 객체선언 및 생성 ) { } catch { }
		
		
	}

}
