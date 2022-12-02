package chapter14.ex5;



//우리가 생성한 객체를 자동으로 리소스 해제 하기.
	//AutoCloseable 인터페이스를 구현해야 한다.
		//close() 메소드를 재정의 해야 한다.

class A implements AutoCloseable{
	
	String resource;
	
	A (String resource){
		this.resource = resource;
	}
	
	@Override
	public void close() throws Exception {
						//close() 메소드를 호출하는 곳에서 예외 처리가 필요함.
		
		if (resource != null) {
			resource = null;
			System.out.println("리소스가 해제되었습니다.");
		}	
	
	}
	
}

public class TryWithResource03 {

	public static void main(String[] args) {
		// 1. 리소스를 수동으로 제거 하기 AutoCloseable 인터페이스 , close 메소드 재정의 필요 없다.
		// 											그냥 A 클라스 자체로 수동제거 방법.
		A a1 = null;
		
		try {
			a1 = new A("문자열 입력");
			System.out.println(a1.resource);
			System.out.println("=========================");
		}catch (Exception e) {
			System.out.println("예외가 발생했습니다.");
			e.printStackTrace();
		}finally {
			if(a1.resource != null) {
				try {
					a1.close();
				} catch (Exception e) {
					
					e.printStackTrace();
				}				
			}
		}
		
		System.out.println(a1.resource);
		
		System.out.println("============2. 자동으로 객체 리소스 제거 ==============");
		//1. 그 객체가 AutoCloseable 인터페이스에 close 메소드를 재정의가 필요하다.
		//2. try ( 객체를 선언, 생성 ) 경우 : 자동으로 close() 
		
		try(A a2 = new A("문자열 입력 2")){
			System.out.println(a2.resource);
			System.out.println("==============");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

}