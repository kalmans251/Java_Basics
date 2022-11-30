package chapter13.ex9;

interface Car {
	public abstract void run();

	public abstract void stop();

	public abstract void start();

}

class CarPlay {

	void abc(Car c1) {
		c1.run();
		c1.start();
		c1.stop();
	}

}

public class Ex01 {

	public static void main(String[] args) {
		// 4번째 방법으로 출력 , Car 클래스의 abc() ,
		// 매소드의 매개변수에 구현한 코드 만들어서 호출.
		CarPlay carplay = new CarPlay();

		carplay.abc(new Car() {
			@Override
			public void run() {
				System.out.println("인터페이스 Car -> 익명 객체화 -> CarPlay.abc 시그니처로 삽입, run()매소드 실행, ");
			}

			@Override
			public void start() {
				System.out.println("인터페이스 Car -> 익명 객체화 -> CarPlay.abc 시그니처로 삽입, start()매소드 실행 , ");
			}

			@Override
			public void stop() {
				System.out.println("인터페이스 Car -> 익명 객체화 -> CarPlay.abc 시그니처로 삽입, stop()매소드 실행, ");
			}
		});

	}

}
