package chapter05.ex2;
import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
		// 스캐너로 배열의 방 번호를 인풋 받습니다.
		// 배열 변수 : arr1 , 2의 배수를 저장후 출력  , enhanced for 문을 사용해서 출력
		// 배열 변수 : arr2 , 3의 배수를 인풋 받아서 출력, for 문을 사용해서 출력
		//   arr1.length 

		//========================================================//
		
		
		
		//========================================================//
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		//========================================================//
		
		System.out.print("방의 갯수를 선택하세요. [1번방은 2의배수], [2번방은 3의배수] 입력 >>> ");
		n = sc.nextInt();
		
		int[] arr1 = new int[n];
		int[] arr2 = new int[n];
		
		for(int i = 0 ; i < arr1.length ; i++) {
			arr1[i] = (i+1)*2;
			arr2[i] = (i+1)*3;
		}
		
		//========================================================//
		
		System.out.println();
		System.out.println("[1번방 2의배수]");
		for(int k : arr1) {
			System.out.print(k+", ");
		}
		System.out.println();
		
		//========================================================//
		
		System.out.println();
		System.out.println("[2번방 3의배수]");
		for(int k : arr2) {
			System.out.print(k+", ");
		}
		System.out.println();
		
		//========================================================//
		
	}
}
