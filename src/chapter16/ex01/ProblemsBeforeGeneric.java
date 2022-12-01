package chapter16.ex01;

//1. Apple 클래스와 
class Apple{}		//클래스 선언
class Goods1{
	private Apple apple = new Apple();	//접근 제어자가 private 이기 때문에 apple 참조변수에 값을 넣거나 가져올경우 getter setter 를 사용.
	//getter , setter 통해서만 apple 참조변수에 값을 수정 할 수 있다.
	// getter : apple 참조변수의 값을 가져올때
	// setter : 참조변수 값을 다른값으로 바꿀때.
	public Apple getApple () {
		return apple;
	}
	
	public void setApple(Apple apple) {
		this.apple = apple;
	}
	
}		//상품 클래스, Apple 상품을 담는 클래스

//2. pencil 클래스와 Pancil 클래스를 담을 수 있는 클래스
class Pencil{}

class Goods2 {	//pencil 타입의 객체를 담는 클래스.);
	private Pencil pencil = new Pencil();

	public Pencil getPencil() {
		return pencil;
	}

	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}
	
	
}


public class ProblemsBeforeGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods1 goods1 = new Goods1();
		goods1.getApple();
		goods1.setApple(null);
		
		Apple apple = goods1.getApple();
		
		//2. Goods2를 ㅏ용해서 Pencil 객체를 추가하고 가져오기.
		Goods2 goods2 = new Goods2();
		//Pencil pencil = new getPencil(); // getter 를 사용해서 pencil 객체를 가져옴
		goods2.setPencil(null);
	}

}
