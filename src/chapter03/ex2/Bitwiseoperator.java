package chapter03.ex2;

public class Bitwiseoperator {

	public static void main(String[] args) {
		// 다양한 진법 표현과 비트 연산자
		//1. 자바 코드를 사용해서 진법 변환.(10진수, 16진수, 8진수, 2진수)
		int data = 13;
		System.out.println(Integer.toBinaryString(data)); //2진수로 변환
		System.out.println(Integer.toOctalString(data));  //8진수로 변환
		System.out.println(Integer.toHexString(data));    //16진수로 변환
		
		System.out.println("====================================");
		
		//2. 2진수 , 8진수 , 16진수 ===> 10진수로 변환
		System.out.println(Integer.parseInt("1101",2));  // 2진수를 10진수로
		System.out.println(Integer.parseInt("15",8));  // 8진수를 10진수로
		System.out.println(Integer.parseInt("d",16));  // 16진수를 10진수로
		
		System.out.println("====================================");
		
		//3. 다양한 진법 표현 ( 0b : 2진수 , 0 : 8진수 , 0x : 16진수 ) 해당 진수를 10진수로 변환
		System.out.println(0b1101);
		System.out.println(015);
		System.out.println(0xd);
		
		System.out.println("====================================");
		
		//4. 비트 연산자 (AND) : 모두 2진법으로 변환해서 각 비트를 연산.
			//4-1, AND 
		
			//4-2, OR 
		
			//4-3, XOR 
 		
			//4-4, NOT 
		
		System.out.println( 3 & 10 );  //2     [ 0011 & 1010 = 0010   ]
		System.out.println( 3 | 10 );  //11    [ 0011 | 1010 = 1011   ]
		System.out.println( 3 ^ 10 );  //9     [ 0011 ^ 1010 = 1001   ]
		System.out.println( ~3 );  //-4        [ 0011 ~ =  1 100      ]
		System.out.println( ~10 );  //         [ 01010 ~ = 1 0101     ] <----- 음수: 0을 기준으로 계산 + 1
		
		
		
		
	}

}
