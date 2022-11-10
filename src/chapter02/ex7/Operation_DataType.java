package chapter02.ex7;

public class Operation_DataType {

	public static void main(String[] args) {
		// 같은 자료형 간의 연산 vs 다른 자료형 간의 연산
		
		//1. 같은 자료형 간의 연산.
		int value1 = 3+5;  //8
		float value2 = (float) 8./5;  //1
		
		System.out.println(value1);
		System.out.println(value2);

		float data1 = 3.0f + 5.0f;
		System.out.println(data1);
		
		double data2 = 8. / 5. ;
		System.out.println(data2);
		
		double data3 = 8/5;			//int/int =int (1)
		System.out.println(data3);  //1.0
		
		double data4 = 8/5.;		//정수 8이 double 형으로 업캐스팅이 일어나서 연산
		System.out.println(data4);  //1.6
		
		//주의 : 평균을 계산 할때 double
		System.out.println("===============================");
		//2. 다른 자료형 간의 연산 (작은 자료형은 높은 자료형으로 업캐스팅이 자동으로 일어나고 연산)
		
		//int data5 = 5 + 3.5;  //오류 발생
		
		double data6 = 5 + 3.5; // 5.0 + 3.5
		
		int data7 = 5 + (int) 3.5;  // 8
		
		int data8 = (int) (5 + 3.5); // 8
		
		double data9 = 5/2.0;  //정수 5가 double 로 업캐스팅

		System.out.println(data9);  //2.5
		
		double data10 = 5/2;   //2
		
		System.out.println(data10);
		
		System.out.println("===============");
		
		int data11 = 50;
		double data12 = 33.33;
		
		//업캐스팅 : data11 (int) ==> data11 (double)
		System.out.println(data11+data12);
		//업캐스팅 : data11 (int) ==> data11 (double)
		System.out.println(data11/data12);
		//다운캐스팅 : data12 (double) ==> data12 (int)
		System.out.println(data11/(int)data12);
		//다운캐스팅 : data12 (double) ==> data12 (int) 
		
		//<문재>
		// 국어 : 90 , 수학 : 88, 영어 : 77 , 음악 : 90  , 과학 : 99
		// 각 과목 점수를 int의 변수로 만들어서 저장후: 합계(sum), 평균(avg) 값을 출력
		// 합계는 int 평균은 double.
		
	}

}
