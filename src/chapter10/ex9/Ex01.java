package chapter10.ex9;

class Car extends Object {
	private String carName;
	private String carColor;
	private int maxSpeed;
	private String carModel;

	// 기본생성자
	public Car() {
	}

	// 인풋을 받는 기본생성자.
	public Car(String carName, String carColor, int maxSpeed, String carModel) {
		// super();
		this.carName = carName;
		this.carColor = carColor;
		this.maxSpeed = maxSpeed;
		this.carModel = carModel;
	}

	// getter , setter

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	// 부모클래스인 Object의 toString 오버라이드로 재정의
	@Override
	public String toString() {
		return "Car [carName=" + carName + ", carColor=" + carColor + ", maxSpeed=" + maxSpeed + ", carModel="
				+ carModel + "]";
	}

}

public class Ex01 {

	public static void main(String[] args) {
		// 1. 기본 생성자 , 인풋값을 받는 생성자
		// 2. getter , setter 생성
		// 3. Object의 toString() 오버라이드로 재정의 : 전체 메모리 내용 출력.

		// 4. 생성자를 통해서 값을 할당후 메모리의 전체 내용 출력.
		// 5. setter를 통해서 값을 할당 메모리 전체 내용을 출력.
		// 6. getter를 사용해서 각 필드의 내용을 출력.

		System.out.println("=================생성자를 통해서 값 할당후 내용출력==================");

		Car car = new Car("제네시스", "검정", 280, "G90"); // 이름,색상,최고속도,차모델
		System.out.println(car);

		System.out.println("==============================================================");
		System.out.println();
		System.out.println();
		System.out.println("====================setter getter use=========================");

		Car car1 = new Car();

		car1.setCarColor("노랑");
		car1.setCarModel("아벤타도르");
		car1.setCarName("람보르기니");
		car1.setMaxSpeed(320);

		System.out.print(car1.getCarName() + ", ");
		System.out.print(car1.getCarColor() + ", ");
		System.out.print(car1.getCarModel() + ", ");
		System.out.println(car1.getMaxSpeed());

		System.out.println("==============================================================");

	}

}
