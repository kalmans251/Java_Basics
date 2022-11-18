package chapter07;

class Student{
	
	//필드선언
	String stuName;		//학생이름.
	int strNum ; 		//학번을 저장.
	String strAddr;   	//학생의 주소.
	String stuPhone;	//학생의 전화번호.
	double weight; 		//학생의 몸무게
	
	// 생성자 오버로딩 ,
	//	  기본생성자, 매개변수 3개인 생성자, 매개변수 5개인 생성자
	
	Student(){};
	
	Student(String stuName, int strNum , String strAddr ){
		this.stuName = stuName;  // 
		this.strNum = strNum;
		this.strAddr = strAddr;
	}
	
	Student(String stuName, int strNum , String strAddr , String stuPhone , double weight){
		this.stuName = stuName;
		this.strNum = strNum;
		this.strAddr = strAddr;
		this.stuPhone = stuPhone;
		this.weight = weight;
	};
	
	// 필드의 값을 출력하는 메소드 void print() { 필드의 값을 출력 }
	
	void print() {
		System.out.printf("학생 이름 : %15s        ||",stuName);
		System.out.printf("학생 학번 : %15d        ||",strNum);
		System.out.printf("학생 주소 : %15s        ||",strAddr);
		System.out.printf("학생 전화 : %15s        ||",stuPhone);
		System.out.printf("학생 무게 : %15.2f        ||",weight);
	}
	
}

public class Ex02 {

	public static void main(String[] args) {
		
		System.out.println("========================================시그니처 3개 입력========================================");
		Student st1 = new Student("홍길동",2022015,"경기도 화성");
		st1.print();
		
		System.out.println();
		
		System.out.println("========================================시그니처 5개 입력========================================");
		Student st2 = new Student("김영희",2019354,"서울 종로구","010-1423-5273", 75.2);
		st2.print();
		
		System.out.println();
		
		System.out.println("========================================시그니처 0개 입력========================================");
		Student st3 = new Student();
		st3.print();
		
		System.out.println();
	}

}
