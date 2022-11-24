package chapter10.ex4;


class A{
	protected void abc() { //메소드의 접근 지정자 : protected.	
	}
}

class B extends A {
	@Override
	protected void abc() { // public은 가능. [부모의 접근 지정자보다 넓은 영역은 변경 가능.]
	}
}

class B2 extends A{
	@Override
	public void abc() { // public으로 오버라이드
		
	}
}

class B3 extends A{
	//@Override
	//default void abc() { // default는 상대적으로 좁은 영역으로 수용 불가. private 마찬가지
		
	}





public class MethodOverriding04 {

	public static void main(String[] args) {
		// 메소드 오버라이딩 과 접근지정자와의 관계
		//    - 부모의 메소드를 자식에서 재정의 해서 사용. 
		//	  - 부모의 메소드 이름과 동일, 시그니쳐도 동일
		//    - 부모의 접근지정자 보다 오버라이딩할 자식 메소드는 접근지정자가 부모와 같거나 넓어야 한다.
		//	  - public , protected , default , private 
		//
		

	}

}
