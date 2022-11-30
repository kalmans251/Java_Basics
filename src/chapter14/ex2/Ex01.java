package chapter14.ex2;

public class Ex01 {

	public static void main(String[] args) {
		
		// 12시 45분까지 .
		// try ~ catch ~ finally 구문을 사용해서 예외 처리
		
		int[] arr = new int[] {1,2,3,4};
		
		
		//실행시 예외 발생 : IndexOutOfBound
		
		try {
			System.out.println(arr[5]);			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스값 한계치를 넘었습니다.");
		}finally{
			System.out.println("Finally 블락 : 예외와 상관 없이 항상 작동됨.");
			System.out.println("프로그램 종료");
		}
		
	}

}
