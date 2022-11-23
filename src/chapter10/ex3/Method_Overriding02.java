package chapter10.ex3;
class Animal {
	void animalSound() {
		System.out.println("모든 동물은 소리내어 웁니다.");
	}
}
class Tiger extends Animal {
	@Override
	void animalSound() {
		System.out.println("호랑이의 울음소리 : 어흥");
	}
}
class Eagle extends Animal{
	@Override
	void animalSound() {
		System.out.println("독수리의 울음소리 : 끼이오");
	}
}
class Lion extends Animal{
	@Override
	void animalSound() {
		System.out.println("사자의 울음소리 : 어흥흐흥");
	}
}
public class Method_Overriding02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//객체 생성
		Animal t1 = new Tiger();
		Animal e1 = new Eagle();
		Animal l1 = new Lion();
		
		// 메소드 오버라이딩, 오버라이딩된 메소드 출력...
		// Animal의 메소드 호출시 오버라이딩된 자식의 메소드가 출력.
		t1.animalSound();	//Animal 의 animalSound 호출시 , Tiger 의 animalSound 가 출력 
		e1.animalSound();	//Animal 의 animalSound 호출시 , Eagle 의 animalSound 가 출력
		l1.animalSound();	//Animal 의 animalSound 호출시 , Lion  의 animalSound 가 출력
		
		System.out.println("===================================");
		
		
		//배열에 객체를 저장.
		Animal[] arr1 = new Animal[3];
		
		
		//arr1 배열의 각 방에 Animal 객체 저장.
		
		arr1[0] = t1;		//animal , tiger
		arr1[1] = e1;		//animal , lion
		arr1[2] = l1;		//animal , eagle
		
		//2. arr1 배열에 Animal 타입의 객체가 저장이 되어 있음.
			//배열의 각 방의 값을 가지고 오기
		Animal a1 = arr1[0];
		Animal a2 = arr1[1];
		Animal a3 = arr1[2];
		
		//3. Animal 타입의 객체를 출력
		System.out.println("===========================");
		a1.animalSound();
		a2.animalSound();
		a3.animalSound();
		
	}
}
