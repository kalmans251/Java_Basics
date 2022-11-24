package chapter10.ex8;

class Animal{
	void run() {
		System.out.println("모든 동물은 달립니다.");
	}
}

class Man extends Animal {
	@Override
	void run() {
		System.out.println("인간 남자는 두발로 달립니다.");
	}
}

class Woman extends Animal {
	@Override
	void run() {
		System.out.println("인간 여자는 두발로 달립니다.");
	}
}

class Lion extends Animal {
	@Override
	void run() {
		System.out.println("사자는 네발로 달립니다.");
	}
}

class Tiger extends Animal {
	@Override
	void run() {
		System.out.println("호랑이는 네발로 달립니다.");
	}
}

class Cat extends Animal {
	@Override
	void run() {
		System.out.println("고양이는 네발로 달립니다.");
	}
}

class Dog extends Animal {
	@Override
	void run() {
		System.out.println("강아지는 네발로 달립니다.");
	}
}

class DogChild extends Dog {
	@Override
	void run() {
		System.out.println("아기 강아지도 네발로 달립니다.");
	}
}
public class Ex01 {
	
	public static void main(String[] args) {
		// Animal : 부모 클래스, run() 정의
		// 자식 클래스 : Man , Woman , Lion , Tiger , Cat , Dog , DogChild <== 다형성 하나의 부모클래스를 상속하여 다양한 형태의 다형성
		//   - 부모의 run 메소드를 재정의
		//  arr 배열에 저장후 for 문으로 출력.Enhansed for 문으로 출력, run() 메소드 출력.
		Animal[] arr = new Animal[] {new Man(),new Woman(),new Lion(),new Tiger(),new Cat(),new Dog(),new DogChild()};
		
		System.out.println("===========For문으로 출력===========");
		for(int i = 0 ; i < arr.length ; i++) {
			arr[i].run();
		}
		
		
		
		System.out.println("============Enhanced For 출력===========");
		for(Animal k : arr) {
			k.run();
		}
		
		
	}
	
	
}
