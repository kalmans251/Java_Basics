package chapter03.ex4;

public class LogicalOperator {

	public static void main(String[] args) {
		/*논리 연산자 vs 비트연산자를 이용한 논리 연산
		 1. 논리연산자 (  AND ( && ),  OR ( || ) , XOR ( ^ ),  NOT (!)  <== 쇼트 서킷이 발생됨.
		 1-1. AND 연산 ( && ) 
		 true && true ==> true 
		 true && false ==> false
		 false && true ==> false
		 false && false ==> false
		*/
		System.out.println( true  && true  );
		System.out.println( true  && false );
		System.out.println( false && true  );
		System.out.println( false && false );
		System.out.println( "===================" );
		/*1-2. OR ( || )
		 		true || ture ==> true
		 		false|| true ==> true
		 		true || false==> true
		 		false|| false==> false
		 */
		System.out.println( true  || true  );
		System.out.println( true  || false );
		System.out.println( false || true  );
		System.out.println( false || false );
		System.out.println( "===================" );
		/*1-3. XOR ( ^ ) : 두값이 같을때 False 다를 떄 True
		 */
		System.out.println( true  ^ true  );
		System.out.println( true  ^ false );
		System.out.println( false ^ true  );
		System.out.println( false ^ false );
		System.out.println( false ^(5 < 2));
		System.out.println( (10 > 20) ^ (30 > 20) );
		System.out.println( "===================" );
		/*1-4. NOT ( ! ) : true-> false 변환 false -> ture 변환
		 */
		System.out.println( ! true  );
		System.out.println( ! false );
		System.out.println( false || ( 5 < 3 ));
		System.out.println( false || !( 5 < 3 ));
		System.out.println( ! false || ! ( 5 < 3 ));
		System.out.println( "===================" );
		/* 2.비트 연산자로 논리연산이 가능하다. <== 쇼트 서킷을 발생시키지 않음
		 *    AND ( & ) , OR ( | ) , XOR ( ^ ) , NOT ( ! ) 
		 */
		System.out.println(true & true );
		System.out.println(true | false );
		System.out.println(true | (5<3) );
		System.out.println(true ^ true );
		System.out.println(! true );
		System.out.println(! false);
		System.out.println( "===================" );
		// System.out.println( ~ true);  //오류발생 . 쇼트서킷
		/*
		 * 3. 쇼트서킷 : 논리연산자에서 앞의 내용으로 뒤의 값의 유무없이 식별 가능하면 뒤의 값을 처리하지 않음 
		 */
		System.out.println(false && true );
		
		// AND 연산자에서는 처음 값이 false면 뒤에 어떤값이 오더라도 결과는 false로 지정되며 이를 쇼트서킷이라 한다.
		System.out.println( "======AND 연산에서 쇼트서킷 발생 및 방지=============" );
		int value1 = 3;
		System.out.println(false && ++value1 > 6); //쇼트서킷 발생 o
		System.out.println(value1);					// 논리연산자.
		
		int value2 = 3;
		System.out.println(false & ++value2 > 6); //쇼트서킷 발생 x
		System.out.println(value2);					// 비트연산자.
		
		
		System.out.println( "======OR 연산에서 쇼트서킷 발생 및 방지=============" );
		int value3 = 3;
		System.out.println(false || ++value3 > 6); //쇼트서킷 발생 o
		System.out.println(value3);					// 논리연산자.
		
		int value4 = 3;
		System.out.println(false | ++value4 > 6); //쇼트서킷 발생 x
		System.out.println(value4);					// 비트연산자.		
		
		// XOR ( ^ ) : 논리연산, 비트연산 <== 뒤의 값을 반드시 확인. [쇼트서킷발생x]
		
		  
		
		
		
		
		
		
	}

}
