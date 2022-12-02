package chapter17.ex04;

import java.util.ArrayList;
import java.util.List;

//car 객체를 3개정도 생성해서 ArrayList 에 저장후 객체를 출력시 필드의 값을 출력 하도록함.
// for , Enhanced for , 컬랙션 객체자체를 출력시
// 완료시간 : 6시 20분까지. 


class Car{
	String company;
	String carModel;
	String color;
	int maxSpeed;
	
	public Car(String company, String carModel, String color, int maxSpeed) {
		this.company = company;
		this.carModel = carModel;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", carModel=" + carModel + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ "]";
	}
	
	
}

public class Ex01 {

	public static void main(String[] args) {
		
		List<Car> a1 = new ArrayList<>();
		
		Car c1 = new Car("현대","현대차","검정",220);
		Car c2 = new Car("기아","기아차","하양",230);
		Car c3 = new Car("쌍용","쌍용차","노랑",240);
		
		a1.add(c1);
		a1.add(c2);
		a1.add(c3);
		
		for(int i = 0 ; i < a1.size() ; i++) {
			System.out.println(a1.get(i));
		}
		
		System.out.println("=============================");
		
		for(Car k : a1) {
			System.out.println(k);
		}
		
		System.out.println("=============================");
		
		System.out.println(a1);
		
	}

}
