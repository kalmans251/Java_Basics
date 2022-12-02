package chapter17.ex04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Student {
	String name;
	int stuID;
	
	Student(){}
	//생성자를 사용해서 값을 인풋받아 메모리에 할당
	Student(String name,int stuID){
		this.name = name;
		this.stuID = stuID;
	}
	//toString() 오버라이딩 : 객체 자체를 출력할때 객체 주소가 출력되지 않고 메모리의 값이 출력.

	@Override
	public String toString() {
		return "Student [name=" + name + ", stuID=" + stuID + "]";
	}
}

public class UseArrayList {

	public static void main(String[] args) {
		
		//ArrayList에 저장될 객체는 Student 객체가 저장됨.
		List<Student> a1 = new ArrayList<>();
		

		//Student 객체를 생성.
		Student s1 = new Student("홍길동",1111);
		Student s2 = new Student("이순신",2222);
		Student s3 = new Student("강감찬",3333);
		
		
		//Student 객체를 ArrayList 컬렉션에 저장
		a1.add(s1);
		a1.add(s2);
		a1.add(s3);
		Student[] st1 = a1.toArray(new Student[0]);
		
		
		
		
		Student[] sta1 = a1.toArray(new Student[0]);
		System.out.println(Arrays.toString(sta1));
		
		//컬렉션의 내용을 순환하면서 출력
		for(int i = 0 ; i < a1.size() ; i++) {
			Student ss1 = a1.get(i);
			System.out.println(ss1.toString());
		}
		System.out.println("=======================");
		
		for(Student k : a1 ) {
			System.out.println(k);
		}
		
		System.out.println("=======================");
		
		System.out.println(a1);
		
	}

}
