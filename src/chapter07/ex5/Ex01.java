package chapter07.ex5;

class Student{			// 완료시간 : 1시 20분 까지
	//필드 선언
	String stuName;			//학생이름 : 학생이름없음
	int stuNo;
	String stuPhone;
	String stuAddr;
	int stuAge;
	double stuWeight;
	
	Student(){		//기본생성자에서 초기값을 할당 : this () 메소드를 사용해서 각 필드의 값을 적용
		stuName = "학생이름없음";
		stuNo = 0;
		stuPhone = "000-0000-0000";
		stuAddr = "서울 ";
		stuWeight = 0.0;
	}
	
	Student(String stuName){
		this();
		this.stuName = stuName;
	}
	
	Student(String stuName,int stuNo){
		this(stuName);
		this.stuNo = stuNo;
	}
	
	Student(String stuName,int stuNo,String stuPhone){
		this(stuName,stuNo);
		this.stuPhone = stuPhone;
	}
	
	Student(String stuName,int stuNo,String stuPhone,String stuAddr){
		this(stuName,stuNo,stuPhone);
		this.stuAddr = this.stuAddr.concat(stuAddr);
	}
	
	Student(String stuName,int stuNo,String stuPhone,String stuAddr,int stuAge){
		this(stuName,stuNo,stuPhone,stuAddr);
		this.stuAge = stuAge;
	}
	
	Student(String stuName,int stuNo,String stuPhone,String stuAddr,int stuAge,double stuWeight){
		this(stuName,stuNo,stuPhone,stuAddr,stuAge);
		this.stuWeight = stuWeight;
	}
	
	
	
	
	
	
	
	void print() { //필드의 내용을 출력
		System.out.printf("|| 학생이름: %4s || 학생학번: %10d || 학생전화: %13s || 학생주소: %10s || 학생나이: %2d || 뭄무게: %5.2f ||\n",stuName,stuNo,stuPhone,stuAddr,stuAge,stuWeight);
	}
}
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student st1 = new Student();
		st1.print();
		System.out.println();
		
		Student st2 = new Student("홍길동");
		st2.print();
		System.out.println();
		
		Student st3 = new Student("홍길동",2022015);
		st3.print();
		System.out.println();
		
		Student st4 = new Student("홍길동",2022015,"010-6443-1234");
		st4.print();
		System.out.println();
		
		Student st5 = new Student("홍길동",2022015,"010-6443-1234","종로구 인사동");
		st5.print();
		System.out.println();
		
		Student st6 = new Student("홍길동",2022015,"010-6443-1234","종로구 인사동",23);
		st6.print();
		System.out.println();
		
		Student st7 = new Student("홍길동",2022015,"010-6443-1234","종로구 인사동",23,72.14);
		st7.print();
		System.out.println();
		
		
		
	}
}
