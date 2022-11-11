package chapter03.ex5;

public class AssignmentOperator {

	public static void main(String[] args) {
		// 대입 연산자 ( += , -= , *= , /= )
		//1. 대입연산자 축약 표현
		int value1 = 3;
		value1 = value1 + 3;		//value1 += 3 과 동일.
		System.out.println(value1);
		
		System.out.println("==================");
		
		int value2 = 3;
		System.out.println(value2 += 3);
		System.out.println(value2 -= 2);
		System.out.println(value2 *= 2);
		System.out.println(value2 /= 4);
		

	}

}
