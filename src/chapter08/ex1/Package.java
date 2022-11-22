package chapter08.ex1;
import chapter08.ex2.Student;
import chapter07.*;
import chapter07.ex1.*;

public class Package {

	public static void main(String[] args) {
		// 클래스 내부 구성요소 : 
			// 1.필드 , 2.생성자 , 3.메소드 , 4.이너클래스
		// 클래스 외부 구성요소 : 
			// 1.패키지 , 2.임포트 , 3.외부클래스
		
			// 1.패키지(package) : 클래스를 조직화 해서 관리하는 폴더.
				//한 패키지 내에 동일한 이름의 클래스는 올 수 없다.
				//외부에서 클래스를 가지고 오는 경우 기존의 클래스 이름과 동일한 경우 
			// 2.임포트(import) : 다른 패키지에 있는 클래스를 사용하려 하는 경우 import를 해야함.
		
		//Student 클래스의 객체 생성: 다른 패키지에 존재하는 클래스
			//chapter08.ex02.Student
		
		Student st = new Student();
		st.print();
		
		
		Student st1 = new Student("홍길동","1111",3,"서울종로구");
		st1.print();
		
		
		System.out.println("===================================");
		
		//Car 클래스는 import 없이 전체 이름으로 사용
		
		chapter08.ex2.Car car1 = new chapter08.ex2.Car();
		car1.print();
		
		System.out.println("====================================");
		
		chapter08.ex2.Car car2 = new chapter08.ex2.Car("삼성자동차","검은색",200);
		car2.print();
	}

}
