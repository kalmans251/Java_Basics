package chapter11.ex2;

class Student {

	// 필드
	String name;

	Student() {
	}

	// 합계와 평균을 출력 하는 메소드
	void sum_avg() {
		System.out.println("Student의 평균 출력 메소드, 아직 값이 들어오지 않았습니다.");
	}

}

class Student_Sub extends Student {
	// 자식의 필드

	Student_Sub(String name, int kor, int eng, int math) {
		super();
		super.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	int kor; // 국어점수를 받는다.
	int eng; // 영어점수를 받는다.
	int math; // 수학점수를 받는다.

	@Override
	void sum_avg() {
		System.out.printf("< %s 학생의 => 국어 영어 수학 [합계] : %4d   >\n", name, kor + eng + math);
		System.out.printf("< %s 학생의 => 국어 영어 수학 [평균] : %7.2f>\n", name, (kor + eng + math) / 3.);
		System.out.println();
	}

	// 부모의 sum_avg() 메소드를 오버라이딩 해서 객체의 kor , eng, math 의 합계와 평균을 출력하는 메소드.

}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성자를 사용해서 객체 생성시 필드의 값을 할당하고.
		// 국어 영어 수학
		// 홍길동 70 88 77
		// 이순신 80 68 87
		// 김똘똘 60 86 87
		// 홍길순 77 56 80
		// 강감찬 55 66 77
		// Student 배열변수 arr 변수에 모든 객체를 저장해서
		// 배열의 값을 for 문으로 출력 할때
		// [오버라이딩된 메소드 출력.] < 그 학생의 국어,영어,수학 의 합계, 평균>
		// 5명 학생의 국어의 합계 , 평균
		// 5명 학생의 영어의 합계 , 평균
		// 5명 학생의 수학의 합계 , 평균

		System.out.println("=====================개개인 학생의 국어,영어,수학 합계 평균========================");
		Student[] stArr = new Student[] { new Student_Sub("홍길동", 70, 88, 77), new Student_Sub("이순신", 80, 68, 87),
				new Student_Sub("김똘똘", 60, 86, 87), new Student_Sub("홍길순", 77, 56, 80),
				new Student_Sub("강감찬", 55, 66, 77) };

		for (int i = 0; i < stArr.length; i++) {
			stArr[i].sum_avg();
		}

		System.out.println("=====================5명 학생의 국어 합계 평균========================");

		for (int i = 0, sumKor = 0; i < stArr.length; i++) {
			sumKor += ((Student_Sub) stArr[i]).kor;
			if (i == (stArr.length - 1)) {
				System.out.println("5명 학생의 국어 [합계] : " + sumKor);
				System.out.println("5명 학생의 국어 [평균] : " + (sumKor / 5.));
				System.out.println();
			}
		}

		System.out.println("=====================5명 학생의 영어 합계 평균========================");

		for (int i = 0, sumEng = 0; i < stArr.length; i++) {
			sumEng += ((Student_Sub) stArr[i]).eng;
			if (i == (stArr.length - 1)) {
				System.out.println("5명 학생의 영어 [합계] : " + sumEng);
				System.out.println("5명 학생의 영어 [평균] : " + (sumEng / 5.));
				System.out.println();
			}
		}

		System.out.println("=====================5명 학생의 수학 합계 평균========================");

		for (int i = 0, sumMath = 0; i < stArr.length; i++) {
			sumMath += ((Student_Sub) stArr[i]).math;
			if (i == (stArr.length - 1)) {
				System.out.println("5명 학생의 수학 [합계] : " + sumMath);
				System.out.println("5명 학생의 수학 [평균] : " + (sumMath / 5.));
				System.out.println();
			}
		}

	}

}
