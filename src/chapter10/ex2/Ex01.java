package chapter10.ex2;

class Human {
	String name;
	int age;
	
	void eat() {
		System.out.println("모든 사람은 먹습니다.");
	}
}
class Student extends Human {
	String stuID;
	void stuEat() {
		System.out.println("학생은 빵을 먹습니다.");
	}
}
class Student2 extends Student {
	String stu2ID;
	void stu2Eat() {
		System.out.println("학생2는 음식을 맛나게 먹습니다.");
	}
}



public class Ex01 {

	public static void main(String[] args) {
		// 업케스팅 실습.
		// 1. Student 객체를 생성 하면서. Human 타입으로 지정 : h1
		// 2. Student 객체를 생성하면서 Student 타입으로 지정 : s1
		
		// 3. Student2 객체를 생성하면서 Human 타입으로 지정 : h2
		// 4. Student2 객체를 생성하면서 Student 타입으로 지정 : s2
		
		// 5. Student2 객체를 생성하면서 Student2 타입으로 지정 : s3
		
		
		Human h1 = new Student();
		Student s1 = new Student();
		
		Human h2 = new Student2();
		Student s2 = new Student2();
		Student2 s3 = new Student2();
		
		//==========================================//
		System.out.println("========================================");
		
		//Human 타입의 Student() 객체.. h1[ Human클래스까지 접근 가능. ]
		
		System.out.println("Instanceof Human? :"+ (h1 instanceof Human));       //true
		System.out.println("Instanceof Student? :"+ (h1 instanceof Student));   //true
		System.out.println("Instanceof Student2? :"+ (h1 instanceof Student2)); //false
		
		h1.eat();						 // Human
		System.out.println(h1.age);		 // Human
		System.out.println(h1.name);	 // Human
		
		//h1.stuEat();  				 // [Student] 접근 불가.
		//System.out.println(h1.stuID);  // [Student] 접근 불가
		
		//h1.stu2Eat();					 // [Student2] 접근 불가
		//System.out.println(h1.stu2ID); // [Student2] 접근불가
		
		
		System.out.println("========================================");
		
		//Student 타입의 Student 객체.. s1[ Human과 Student 클래스 모두 접근가능. ]
		
		System.out.println("Instanceof Human? :"+ (s1 instanceof Human));       //true
		System.out.println("Instanceof Student? :"+ (s1 instanceof Student));   //true
		System.out.println("Instanceof Student2? :"+ (s1 instanceof Student2)); //false
		
		s1.eat();							// Human
		System.out.println(s1.age);			// Human
		System.out.println(s1.name);		// Human
		
		s1.stuEat();						// Student
		System.out.println(s1.stuID);		// Student
		
		//s1.stu2Eat();					    // [Student2] 접근 불가
		//System.out.println(s1.stu2ID);    // [Student2] 접근불가
		
		System.out.println("========================================");
		
		//Human 타입의 Student2 객체.. h2[ Human 클래스까지 접근 가능. ]
		
		System.out.println("Instanceof Human? :"+ (h2 instanceof Human));       //true
		System.out.println("Instanceof Student? :"+ (h2 instanceof Student));   //true
		System.out.println("Instanceof Student2? :"+ (h2 instanceof Student2)); //true
		
		h2.eat();							// Human
		System.out.println(h2.age);			// Human
		System.out.println(h2.name);		// Human
		
		//h2.stuEat();						// [Student] 접근불가
		//System.out.println(h2.stuID);	    // [Student] 접근불가
		
		//h2.stu2Eat();					    // [Student2] 접근 불가
		//System.out.println(h2.stu2ID);    // [Student2] 접근불가
		
		System.out.println("========================================");
		
		//Student 타입의 Student2 객체.. s2[ Student 클래스까지 접근 가능. ]
		
		System.out.println("Instanceof Human? :"+ (s2 instanceof Human));       //true
		System.out.println("Instanceof Student? :"+ (s2 instanceof Student));   //true
		System.out.println("Instanceof Student2? :"+ (s2 instanceof Student2)); //true
		
		s2.eat();							// Human
		System.out.println(s2.age);			// Human
		System.out.println(s2.name);		// Human
		
		s2.stuEat();						// Student
		System.out.println(s2.stuID);		// Student
		
		//s2.stu2Eat();					    // [Student2] 접근 불가
		//System.out.println(s2.stu2ID);    // [Student2] 접근불가
			
		System.out.println("========================================");
		
		//Student2 타입의 Student2 객체.. s3[ Student2 클래스까지 접근 가능. ]
		
		System.out.println("Instanceof Human? :"+ (s3 instanceof Human));       //true
		System.out.println("Instanceof Student? :"+ (s3 instanceof Student));   //true
		System.out.println("Instanceof Student2? :"+ (s3 instanceof Student2)); //true
		
		s3.eat();							// Human
		System.out.println(s3.age);			// Human
		System.out.println(s3.name);		// Human
		
		s3.stuEat();						// Student
		System.out.println(s3.stuID);		// Student
		
		s3.stu2Eat();					    // Student2
		System.out.println(s3.stu2ID);      // Student2
		
		System.out.println("========================================");
		
	}

}
