package chapter10.ex1;

class Animal {			// Animal 클래스를 상속해서 Tiger , Eagle , Lion 을 생성
					// 자식 클래스에서는 필드1, 메소드 1 정의
						// LionChild 클래스는 Lion 클래스를 상속해서 필드1, 메소드1.
	String name;
	int age;
	String color;
	
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
	void sleep () {
		System.out.println("모든 동물은 잠을 잡니다.");
	}
	
}

class Tiger extends Animal{
	
	Tiger(){
		name = "호랑이";
		age = 13;
		color = "하얀색";
	}
	void printAnimal() {
		System.out.println("종류 : "+name);
		System.out.println("색상 : "+color);
		System.out.println("나이 : "+age);
	}
}

class Eagle extends Animal{
	Eagle(){
		name = "독수리";
		age = 24;
		color = "검은색";
	}
	void printAnimal() {
		System.out.println("종류 : "+name);
		System.out.println("색상 : "+color);
		System.out.println("나이 : "+age);
	}
}

class Lion extends Animal{
	Lion(){
		name = "사자";
		age = 16;
		color = "진한 주황색";
	}
	void printAnimal() {
		System.out.println("종류 : "+name);
		System.out.println("색상 : "+color);
		System.out.println("나이 : "+age);
	}
}

class LionChild extends Lion{
	
	LionChild(){
		name = "아기사자";
		age = 1;
		color = "연한 주황색";
	}
}

public class Ex01 {
		
	public static void main(String[] args) {
		// Type Casting (형 변환 ) :
		
		// 1. 업캐스팅 : Tiger (자식객체) ==> Animal (부모타입)
		// 업캐스팅 : 자식 객체를 생성해서 부모 타입으로 정의 , 자동으로 일어남
		// a1 : Tiger 필드, 메소드 + Animal 필드와 메소드도 포함.
		//	Animal의 필드와 메소드만 사용 가능.
		Animal a1 = new Tiger();  //Tiger 객체를 생성해서 Animal 타입으로 지정.
		
		//a1 은 Animal 타입의 필드와 메소드만 사용 가능.
		a1.name = "호랑이";
		a1.age = 10;
		System.out.println(a1.name);
		System.out.println(a1.age);
		
		
		System.out.println("========호랑이=========");
		Tiger t1 = new Tiger();
		t1.printAnimal();
		t1.sleep();
		t1.eat();
		
		System.out.println("========독수리=========");
		Eagle e1 = new Eagle();
		e1.printAnimal();
		e1.sleep();
		e1.eat();
		
		System.out.println("========사자=========");
		Lion l1 = new Lion();
		l1.printAnimal();
		l1.sleep();
		l1.eat();
		
		System.out.println("========아기사자=========");
		
		LionChild lc1 = new LionChild();
		lc1.printAnimal();
		lc1.sleep();
		lc1.eat();
		
		
		
	}

}
