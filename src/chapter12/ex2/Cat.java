package chapter12.ex2;


//Cat 클래스는 Animal 인터페이스를 구현한 메소드
public class Cat implements Animal{
	
		
		@Override
		public void cry() {
			System.out.println("야옹");
		}
		
		@Override
		public void eat() {
			System.out.println("고양이는 먹습니다.");
		}
		
		@Override
		public void run() {
			System.out.println("고양이는 달립니다.");
		}
		
}

