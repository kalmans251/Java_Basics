package chapter10.ex3;

class Fruit { // Fruit 의 메소드를 오버라이딩해서 출력. Apple,Banana,Orange
	void eat() {
		System.out.println("모든 과일은 맛이 있습니다. ");
	}
}

class Apple extends Fruit {
	@Override
	void eat() {
		System.out.println("사과는 빨갛고 상큼합니다.");
	}
}

class Banana extends Fruit {
	@Override
	void eat() {
		System.out.println("바나나는 노랗고 달달합니다.");
	}
}

class Orange extends Fruit {
	@Override
	void eat() {
		System.out.println("오렌지는 주황색이고 상큼합니다.");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("================================");
		// 1. 배열사용

		Fruit[] fruitArr = new Fruit[3];
		fruitArr[0] = new Apple();
		fruitArr[1] = new Banana();
		fruitArr[2] = new Orange();

		for (int i = 0; i < fruitArr.length; i++) {
			fruitArr[i].eat();
		}

		System.out.println("================================");
		// 2. 하나씩 선언.

		Fruit ap = new Apple();
		Fruit ba = new Banana();
		Fruit or = new Orange();

		ap.eat();
		ba.eat();
		or.eat();

		System.out.println("================================");

	}

}
