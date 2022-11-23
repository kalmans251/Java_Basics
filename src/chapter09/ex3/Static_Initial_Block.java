package chapter09.ex3;


class D{
	int a; // 인스턴스 필드 : 객체를 생성할 때 초기값을 할당, 생성자를 통해서 기본값 객체를 만들 때. new
	static int b; //정적필드 : 객체를 생성하지 않아도 사용이 가능. 스테틱 블락에서 정적 필드의 초기값을 세팅., 스테틱 블락은 class가 JVM에 로드 될때 작동.
					// 스테틱블락 객체 생성전에 작동,
	static { //스테틱 블락에서 정적 필드의 초기값을 세팅., 스테틱 블락은 class가 JVM에 로드 될때 작동. <== 생성자와 같은 역할.
		// 스테틱블락 객체 생성전에 작동,
		b =5;
		System.out.println("class D가 JVM에 로딩 되었습니다.");
	}
	
	//생성자를 사용해서 초기값 할당 : a 필드
	D(){
		a=10;
	}
	
	
	
}


public class Static_Initial_Block {

	public static void main(String[] args) {
		// static 필드에 초기값 셋팅 : static{ 초기값 할당 } <== 객체생성전에.
		// 인스턴스 필드의 초기값 세팅 : 객체를 생성할 때 1. 생성자를 통해 , 2. setter를 사용해서 할당.
		
		//객체 생성 없이 호출 ( 정적 스테틱 필드 호출 )
		System.out.println(D.b);
		
		//객체 생성 후 호출 : a
		D d1 = new D();
		System.out.println(d1.a);
		
	}

}
