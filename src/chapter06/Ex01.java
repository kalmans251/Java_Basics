package chapter06;

import java.util.Arrays;

class Man {
	// 필드 <p.jangwoo@gmail.com> <<완료시간 = 1:10 분까지>>
	String name = "홍길동";
	int age = 30;
	String phone = "010-1111-1234";
	String addr = "서울 종료구 인사동";
	double weight = 70.5;

	// 기본 생성자는 생략됨 : Man () {}
	Man() {
	} // 선언해도 상관 없음

	// 메소드 :
	void add1() {
		// 1 ~ 100 까지 2의 배수를 출력하고 더한값을 출력.
		int sum = 0;

		for (int i = 2; i <= 100; i += 2) {
			System.out.print((i) + ", ");
			sum += i;
		}
		System.out.println();
		System.out.println(sum);
		System.out.println();
	}

	void add2() {
		// 1 ~ 500 까지 3의 배수와 4의 배수를 출력하고 더한값 출력.
		int[] arr1;
		int sum = 0;
		int num = (500 / 3) + (500 / 4) - (500 / 12);
		arr1 = new int[num];
		for (int i = 0, k = 0; i < num; i++) {
			while (true) {
				k++;
				if (k % 3 == 0 || k % 4 == 0) {
					arr1[i] = k;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
		for (int i = 0; i < num; i++) {
			sum += arr1[i];
		}
		System.out.println();
		System.out.println(sum);
		System.out.println();

	}

	void add3() {
		// 1 ~ 1000까지 1씩 증가하고 4의 배수만 출력되지 않도록 하고 더한값 출력.
		int[] arr1;
		int sum = 0;
		int num = 1000 - (1000 / 4);
		arr1 = new int[num];

		for (int i = 0, k = 0; i < num; i++) {
			while (true) {
				k++;
				if (k % 4 == 0) {
					i--;
					break;
				}
				arr1[i] = k;
				break;
			}
		}
		System.out.println(Arrays.toString(arr1));

		for (int i = 0; i < num; i++) {
			sum += arr1[i];
		}
		System.out.println(sum);

	}

}

public class Ex01 {

	public static void main(String[] args) {

		Man ma = new Man();

		System.out.println("1 ~ 100 까지 2의 배수를 출력하고 더한값을 출력");
		ma.add1();
		System.out.println();
		System.out.println("1 ~ 500 까지 3의 배수와 4의 배수를 출력하고 더한값 출력");
		ma.add2();
		System.out.println();
		System.out.println("1 ~ 1000까지 1씩 증가하고 4의 배수만 출력되지 않도록 하고 더한값 출력");
		ma.add3();

	}

}
