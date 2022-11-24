package chapter10.ex9;


class Student extends Object{  // 모든 객체는 extends Object를 상속받고있다.
	//필드
	private String name;
	private int stuID;
	private int age;
	private String stuAdd;
	private String stuPhone;
	private double weight;
	private int month;     // month : 1월 ~ 12월 값만 들어와야함.
	
	Student(){}
	Student(String name, int stuID , int age , String stuAdd , String stuPhone ,double weight , int month){
		this.name = name;
		this.stuID =stuID;
		this.age = age;
		this.stuAdd = stuAdd;
		this.stuPhone = stuPhone;
		this.weight = weight;
		if(month >= 1 && month <= 12) {
			this.month = month;
		}else {
			System.out.println("                         month 잘못된 입력값입니다. 1~12 사이의 값을 넣으세요");
		}
		
	}
	
	//getter(필드의 값을 리턴으로 돌려줌) , setter (인풋값을 받아서 필드의 값을 적용) 생성.
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStuID() {
		return stuID;
	}
	public void setStuID(int stuID) {
		this.stuID = stuID;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStuAdd() {
		return stuAdd;
	}
	public void setStuAdd(String stuAdd) {
		this.stuAdd = stuAdd;
	}
	public String getStuPhone() {
		return stuPhone;
	}
	public void setStuPhone(String stuPhone) {
		this.stuPhone = stuPhone;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", stuID=" + stuID + ", age=" + age + ", stuAdd=" + stuAdd + ", stuPhone="
				+ stuPhone + ", weight=" + weight + ", month=" + month + "]";
	}
	
	//toString() 재정의 : 객체의 Heap 메모리의 주소값이 출력됨 , hashcode로 출력 (16진수)
	// 객체 자체를 출력 했을때 toString() 가 작동.
	
	
	
	//getter , setter 생성.
	
	//toString() 재정의 : 객체의 Heap 메모리의 주소값이 출력됨 , hashcode로 출력 (16진수)
	
	
	
}


public class Initial_Field01 {

	public static void main(String[] args) {
		// 1. 객체를 생성 후 직접 필드의 값을 할당.
		// 2. 객체를 생성할때 생성자를 사용해서 필드의 값을 할당.
		// 3. DTO (Data Transfer Object) , VO (Value Object) : 
		//		: client 에게 값을 받아서 DAO에 값을 전송
					// DAO (Data Access Object) : DataBase 에 Insert , Update , Delete
		//		getter(필드의 값을 읽을때), setter(필드의 값을 할당할 때)를 사용해서 값을 
		
		//1. 객체를 생성후 직접 필드의 값을 할당.
		Student s1 = new Student();
		//s1.name = "홍길동";
		//s1.age = 20;
		//s1.stuAdd = "서울 종로구";
		//s1.stuID = 1111;
		//s1.stuPhone = "010-1111-1111";
		//s1.weight = 80.5;
		//s1.month = 50;
		
		System.out.println(s1);				//객체를 출력할때 toString() 메소드가 호출이됨
		System.out.println(s1.toString());	//
		
		System.out.println("==============================================================================================");
		
		//2. 객체를 생성시 생성자를 
		Student s2 = new Student("이순신",2222,30,"서울 강남구","010-2222-2222",85.4,143);
		
		System.out.println(s2);				//객체를 출력할때 toString() 메소드가 호출이됨
		System.out.println(s2.toString());
		
		System.out.println("==============================================================================================");
		
		//3. setter를 사용해서 값을 넣고 getter를 사용해서 필드의 값을 출력.
		Student s3 = new Student();
		
		s3.setName("강감찬");
		s3.setAge(40);
		s3.setStuAdd("서울 성북구");
		s3.setStuID(3333);
		s3.setStuPhone("010-3333-3333");
		s3.setWeight(90.5);
		
		System.out.println(s3);
		System.out.println(s3.toString());
		System.out.println("==============================================================================================");
		
		//getter 출력
		
		System.out.println(s3.getName());
		System.out.println(s3.getAge());
		System.out.println(s3.getStuAdd());
		System.out.println(s3.getStuID());
		System.out.println(s3.getStuPhone());
		System.out.println(s3.getWeight());
		
	}
}
