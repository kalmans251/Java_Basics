package chapter10.ex9;

class Student1 {

	private String name;
	private int stuID;
	private int age;
	private String stuAdd;
	private String stuPhone;
	private double weight;
	private int month;

	// 생성자 선언 { shift + alt + s 누르고 -> o // Generate c[o]nstructor using field }
	Student1() {
	}

	public Student1(String name, int stuID, int age, String stuAdd, String stuPhone, double weight, int month) {
		// super(); //objecSt 클래스// 생략가능.
		this.name = name;
		this.stuID = stuID;
		this.age = age;
		this.stuAdd = stuAdd;
		this.stuPhone = stuPhone;
		this.weight = weight;
		this.month = month;
	}

	// getter 와 setter를 통해 private인 field의 값을 변경,조회...{ shift + alt + s 누르고--> r //
	// Gene[r]ate getter and setter }
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

	// 객체 자체를 프린트 할때 필드의 값 전체를 출력 할 수 있도록 , toString() : Object클래스에 위치하며 모든 클래스는
	// Object를 상속하여 Override 할 수 있다.
	// { shift + alt + s 누르고 -> s // Generate to[S]tring }
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", stuID=" + stuID + ", age=" + age + ", stuAdd=" + stuAdd + ", stuPhone="
				+ stuPhone + ", weight=" + weight + ", month=" + month + "]";
	}

}

public class Initial_Field02 {

	public static void main(String[] args) {
		// 1. 모든 필드의 접근 제어가 private로 직접접근이 불가.
		Student1 s1 = new Student1();

		s1.setAge(50);
		s1.setMonth(0);
		s1.setName("세종대왕");
		s1.setStuAdd(null);
		s1.setStuID(0);
		s1.setStuPhone(null);
		s1.setWeight(0);

		System.out.println(s1);

	}
}
