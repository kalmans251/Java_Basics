package chapter11.ex4;

abstract class Animal { // 추상 클래스, 추상 메소드가 1라도 있으면 추상 클래스
	abstract void eat();

	abstract void run();

	abstract void cry();
}



class Cat extends Animal { // 콘크리트 클래스 : 추상 메소드를 모두 구현한 클래스를 콘크리트 메소드라고 한다.
	@Override
	void cry() {
		System.out.println("고양이는 야옹.");
	}

	@Override
	void run() {
		System.out.println("고양이가 달린다.");
	}

	@Override
	void eat() {
		System.out.println("고양이는 생선을 먹는다.");
	}
}



abstract class Dog extends Animal { // 추상 클래스의 추상 메소드를 일부만 구현 한경우 : 추상 클래스.
	
	
	@Override
	void eat() {
		System.out.println("개는 뼈다구를 먹는다.");
		
	}
	@Override
	void cry() {
		System.out.println("개는 멍멍");
		
	}
}


class DogChild extends Dog { // 추상 클래스의 모든 메소드를 만들었으니 콘크리트 클래스.
	
	@Override
	void run() {
		System.out.println("강아지는 네발로 달립니다.");
	}	
}


public class Abstract_Method {

	public static void main(String[] args) {
		// 추상 클래스는 객체를 생성하지 못한다. 타입으로 지정은 가능하다.
		// Animal , Dog 는 추상 클래스 이므로 객체 생성이 안된다.
		
		//1. Animal 객체 생성.
//		Animal a1 = new Animal();  	//추상 클래스는 객체화 불가능.
		
		//2. Dog 객체 생성.
//		Animal d1 = new Dog(); 		//추상 클래스는 객체화 불가능.
		
		//3. Cat 객체 생성. [콘크리트 클래스로 객체화 가능]
		Animal cat = new Cat();
		cat.cry();
		
		System.out.println("============================");
		
		//4. DogChild 객체 생성. [콘크리트 클래스로 객체화 가능]
		Animal dc = new DogChild();
		dc.cry();
		dc.eat();
		dc.run();
		
		System.out.println("============================");

		// Cat 객체화 해서 Cat 타입으로 지정
		Cat c2 = new Cat();
		c2.cry();
		c2.eat();
		c2.run();
		
		System.out.println("============================");

		// DogChild 객체화 해서 DogChild 타입으로 지정.
		DogChild dc2 = new DogChild();
		dc2.cry();
		dc2.eat();
		dc2.run();
		
		System.out.println("============================");
		
		//DogChild 를 객체화 해서 Dog 타입으로 지정.
		Dog d3 = new DogChild();
		d3.cry();
		d3.eat();
		d3.run();
		
		
	}

}
