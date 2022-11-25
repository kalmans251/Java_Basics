package chapter10.ex10;

class C {
	private String stuID;
	private String name;
	private int age;

	// c1.equals(c2) 를 넣었을 때 stuID가 같으면 true , 아니면 false 출력 하도록 .equals() Override 로
	// 재정의

	/*
	 * 생성자, 기본생성자1, 생성자를 통해 stuID ,name,age 값을 인풋받는다 toString 메소드 재정의 : field의 값을
	 * 출력, 객체를 프린트
	 */

	public C() {
	}

	public C(String stuID, String name, int age) {
		// super();
		this.stuID = stuID;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "C [stuID=" + stuID + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this.stuID == ((C) obj).stuID) {
			return true;
		} else {
			return false;
		}

	}

}

public class Ex01 {

	public static void main(String[] args) {
		// 생성자를 통해 stuID ,name,age 값을 인풋

		C c1 = new C("202201527", "홍길동", 30);
		C c2 = new C("202201527", "이순신", 50);

		System.out.println();
		System.out.println("============ toString 재정의로 객체 field값 출력 ============");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println();

		System.out.println("============ Object의 equals() 재정의로 Heap비교하기 ============");
		System.out.println("c1 과 c2 stack값 일치? = " + (c1 == c2)); // stack의 참조값 비교 // false
		System.out.println("c1.equals(c2) [Override 된 equals를 사용] 일치? = " + (c1.equals(c2)));

	}

}
