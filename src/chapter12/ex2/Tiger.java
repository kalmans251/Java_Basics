package chapter12.ex2;

public class Tiger implements Animal {

	@Override
	public void cry() {
		System.out.println("어흥");
	}

	@Override
	public void run() {
		System.out.println("호랑이는 달립니다.");
	}

	@Override
	public void eat() {
		System.out.println("호랑이는 먹습니다.");
	}

}
