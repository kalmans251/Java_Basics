package chapter11.ex4;

abstract class Car { // Car_Truck , Car_Normal ,Car_Poclain
	abstract void run();

	abstract void eat();

}

class Car_Truck extends Car {
	@Override
	void eat() {
		System.out.println("트럭은 요소수와 디젤연료를 사용한다.");
	}

	@Override
	void run() {
		System.out.println("트럭은 시속 80~100 km로 제한속도가 걸려있다.");
	}

}

class Car_Normal extends Car {
	@Override
	void eat() {
		System.out.println("자가용은 일반적으로 가솔린을 사용한다.");
	}

	@Override
	void run() {
		System.out.println("자가용은 200km 이상의 속도로 달릴수 있으며 제한속도가 가끔있다.");
	}

}

class Car_Poclain extends Car {
	@Override
	void eat() {
		System.out.println("포크레인은 유압을 위한 기름과 디젤을 사용한다.");
	}

	@Override
	void run() {
		System.out.println("포크레인은 속도가 매우 느리다.");
	}

}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car truck1 = new Car_Truck();
		truck1.eat();
		truck1.run();

		System.out.println("===============================");

		Car normal1 = new Car_Normal();
		normal1.eat();
		normal1.run();

		System.out.println("===============================");

		Car poclain1 = new Car_Poclain();
		poclain1.eat();
		poclain1.run();
	}
}
