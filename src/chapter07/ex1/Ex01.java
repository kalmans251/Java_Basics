package chapter07.ex1;

public class Ex01 {

	public static void main(String[] args) {
		// <완료시간 11시 40분 까지>

		int A = sumInt3(3,6,8);
		System.out.println(A);
		
		System.out.println("============================");
		
		double B = sumDouble3(3.6,35.4,62.8);
		System.out.println(B);
		
		System.out.println("============================");
		
		Ex01 ex01 = new Ex01();
		String C = ex01.proDuct_Name_Count_Price("치약","455","19000");
		System.out.println(C);
		
		
	}
	
	
	//정수값 3개를 인풋 받아 리턴하는 메소드 (static)
	public static int sumInt3(int x, int y, int z) {
		return x+y+z;
	}
	
	//실수 3개를 인풋 받아서 리턴하는 메소드 (static)
	public static double sumDouble3(double x, double y, double z) {
		return x+y+z;
	}
	
	//문자열을 연결해서 출력하는 메소드 (인스턴스 메소드 : static 을 사용하지 않은 메소드)
	//"제품이름" , "제품수량" , "제품가격"
	// 객체를 생성해서 
	public String proDuct_Name_Count_Price(String Name, String Count , String Price) {
		return (Name.concat(Count)).concat(Price);
	}
	
}
