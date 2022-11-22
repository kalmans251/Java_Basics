package chapter08.ex2;

public class Car {	//public : 클래스 이름 앞, 필드명, 생성자명, 메소드명 앞에 public키가 붙어야
							//다른 패키지에서 불러올수 있다.

	public String carName;
	public String carColor;
	public int maxSpeed;
	
	public Car(){}
	public Car(String carName , String carColor, int maxSpeed){
		this.carName = carName;
		this.carColor = carColor;
		this.maxSpeed = maxSpeed;
	}
	
	public void print() {
		System.out.println("자동차명 : " + carName);
		System.out.println("자동차색 : " + carColor);
		System.out.println("자동차속도 : " + maxSpeed);	
	}
}
