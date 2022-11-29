package chapter12.ex7;




public class Interface_Static_Method {

	public static void main(String[] args) {
		// interface 블락에서 구현된 메소드 : default, static
		// 메소드 이름앞에 static 메소드 : 인터페이스 이름으로 바로 호출 가능
		
		//interface
			//1. 필드 : public static final이 붙음.
			//2. 메소드 :
				//1. 추상 메소드 : public abstract 생략됨, 선언만 된 메소드,
				//2. default 메소드 : [public] default 메소드 , 구현부가 있는 메소드
					//모든 자식 클래스에 상속되는 메소드, 1.8 버전부터 지원
				//4. static 메소드 : [public] static 메소드, 구현부가 있는 메소드.
						//1.8 버전 부터 지원, 객체의 생성없이 인터페이스 이름으로 호출
		
		
		//A.abc();
		

	}

}
