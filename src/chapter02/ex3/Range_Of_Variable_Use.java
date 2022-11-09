package chapter02.ex3;

public class Range_Of_Variable_Use {
	
	public static void main(String[] agrs) {
		// 변수의 사용 범위 ( 변수의 생존 기간 ) : 선언 위치에 따라 생존 범위가 달라진다.
		
		int value1 =3;       //전역 변수 ,Global
		
		{    //if , for , switch , do while,
			int value2 = 5;      //지역 변수 ,Local
			System.out.println(value1);
			System.out.println(value2);
			
		}
		System.out.println(value1);
		//System.out.println(value2);   //오류 발생
		
		
	}

}
