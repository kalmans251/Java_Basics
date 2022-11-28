package chapter12.ex4;

interface Animal {

}

interface Animal1 extends Animal {
	public abstract void cry();
}

interface Animal2 extends Animal {
	public abstract void run();
}

interface Animal3 extends Animal {
	public abstract void eat();
}

//Cat , Tiger 는 cry, run 만 구현.
// Dog , Lion 은 run, eat 구현
// Eagle 은 run,eat,cry 모두 구현.

class Cat implements Animal1, Animal2 {
	@Override
	public void cry() {
		System.out.println("고양이가 야옹하며 운다.");

	}

	@Override
	public void run() {
		System.out.println("고양이가 미친듯이 뛴다.");
	}
}

class Tiger implements Animal1, Animal2 {
	@Override
	public void cry() {
		System.out.println("호랑이가 어흥하며 운다.");
	}

	@Override
	public void run() {
		System.out.println("호랑이가 미친듯이 뛰어다닌다.");
	}
}

class Dog implements Animal2, Animal3 {
	@Override
	public void eat() {
		System.out.println("강아지가 사료를 먹는다.");
	}

	@Override
	public void run() {
		System.out.println("강아지가 뛰어다닌다.");
	}
}

class Lion implements Animal2, Animal3 {
	@Override
	public void eat() {
		System.out.println("사자가 고기를 먹는다.");
	}

	@Override
	public void run() {
		System.out.println("사자가 무섭게 뛰어다닌다.");
	}
}

class Eagle implements Animal1, Animal2, Animal3 {
	@Override
	public void cry() {
		System.out.println("독수리가 끼이이오 하며 운다.");
	}

	@Override
	public void eat() {
		System.out.println("독수리가 고기를 먹고있다.");
	}

	@Override
	public void run() {
		System.out.println("독수리가 하늘을 날아다닌다.");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// 배열에 넣어서 오버라이딩된 메소드 출력
		// instanceof 를 사용해서 객체 내부에 Cat,Tiger 타입이 있으면 cry(), run() 출력.
		// instanceof 를 사용해서 객체 내부에 Dog,Lion 타입이 있으면 run(), eat() 출력.
		// instanceof 를 사용해서 객체 내부에 Eagle이 있으면 run() , eat(), cry() 출력.

		Animal[] arr = new Animal[] { new Cat(), new Tiger(), new Dog(), new Lion(), new Eagle() };

		for (int i = 0; i < arr.length; i++) {
			System.out.println("=================================");

			if (arr[i] instanceof Cat) {
				((Animal2) arr[i]).run();
				((Animal1) arr[i]).cry();
			} else if (arr[i] instanceof Tiger) {
				((Animal2) arr[i]).run();
				((Animal1) arr[i]).cry();
			} else if (arr[i] instanceof Dog) {
				((Animal2) arr[i]).run();
				((Animal3) arr[i]).eat();
			} else if (arr[i] instanceof Lion) {
				((Animal2) arr[i]).run();
				((Animal3) arr[i]).eat();
			} else if (arr[i] instanceof Eagle) {
				((Animal2) arr[i]).run();
				((Animal1) arr[i]).cry();
				((Animal3) arr[i]).eat();
			}

		}

	}

}
