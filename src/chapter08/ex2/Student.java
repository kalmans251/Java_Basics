package chapter08.ex2;



public class Student { //public : 필드, 메소드 이름앞에 다른 패키지에서 사용하려면

		//필드선언
	
	public String stuName;
	public String stuNo;
	public int stuYear;
	public String stuAdd;
	
	public Student(){
		
	}
	
	public Student(String stuName,String stuNo,int stuYear,String stuAdd){
		this.stuName =stuName;
		this.stuNo =stuNo;
		this.stuYear = stuYear;
		this.stuAdd = stuAdd;
	}
	
	public void print() {
		System.out.printf("학생이름 : %s \n",stuName);
		System.out.printf("학생번호 : %s \n",stuNo);
		System.out.printf("학생연도 : %s \n",stuYear);
		System.out.printf("학생주소 : %s \n",stuAdd);
	}
	
}
