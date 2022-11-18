package chapter07;

class Car{
	String Company;
	String Car_Name;
	String color;
	int year;
	int maxSpeed;
	//생성자 오버로딩 : 시그니쳐에 따라서 다른 생성자를 호출.
	//기본 생성자 
	Car( ) { }
	//생성자 : 매개변수가 3개인 생성자.
	Car(String Company, String Car_Name , String color ) {
		this.Company = Company;
		this.Car_Name = Car_Name;
		this.color = color;
	}
	Car(String Company, String Car_Name , String color , int year , int maxSpeed ) {
		this.Company = Company;
		this.Car_Name = Car_Name;
		this.color = color;
		this.year = year;
		this.maxSpeed = maxSpeed;
	}
	void print() {
		System.out.println("회사명 : " + Company);
		System.out.println("차이름 : " + Car_Name);
		System.out.println("차색상 : " + color);
		System.out.println("차연식 : " + year);
		System.out.println("최대속력 : " + maxSpeed);
	}
	
}

public class Constructor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 기본 생성자로 객체 생성
		Car car1 = new Car();
		car1.print();
		System.out.println("======5개 시그니쳐 ====== ");
		//2. 매개변수 3개인 생성자 호출
		Car car2 = new Car("현대자동차","그랜져","검은색",2022,230);
		car2.print();
		
		System.out.println("======3개 시그니쳐 ====== ");
		//3. 매개변수 5개인 생성자 호출
		Car car3 = new Car("기아자동차","K9","붉은색");
		car3.print();
		
		System.out.println("====================== ");
		//
		Car car4 = new Car("삼성자동차","SM5","갈색",2020,200);
		car4.print();
	}
	
}
