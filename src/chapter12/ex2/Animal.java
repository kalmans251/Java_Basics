package chapter12.ex2;

public interface Animal {

	
	public abstract void cry();
	public abstract void run();
	
	public abstract void eat();  // 인터페이스 내부에 구현부가 있는 메소드를 넣으면 오류
	
	
}


// Animal 의 메소드를 구현한 클래스.
// Cat 클래스는 Animal 인터페이스의 구현되지 않는 메소드를 구현한 클래스.
