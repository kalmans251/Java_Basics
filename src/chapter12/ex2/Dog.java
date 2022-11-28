package chapter12.ex2;

public class Dog implements Animal {

	@Override
	public void cry() {
		System.out.println("멍멍");
	}

	@Override
	public void run() {
		System.out.println("개는 달립니다.");
	}

	@Override
	public void eat() {
		System.out.println("개는 먹습니다.");
	}

}
