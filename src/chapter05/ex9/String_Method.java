package chapter05.ex9;

import java.util.Arrays;

public class String_Method {

	public static void main(String[] args) {
		// String 클래스에서 사용되는 주요 메소드. (함수)
		        //기본자료형 : boolean , byte , short , int , long , float , double , char
				//참조자료형 : 배열 / 열거 / 객체 / 인터페이스		<== 첫자 모두 대문자.
		// 
		// 1. 문자열의 길이 (length())
		// 
		// [참조] 자료형    [참조] 변수. 
		String str1 = "Hello Java!";
		String str2 = "안녕하세요! 반갑습니다.";
		
		System.out.println(str1.length()); //글자의 갯수.   : 11 자.
		System.out.println(str2.length()); // 13자.
		
		//2. 문자열 검색 ( charAt(), indexOf() , lastIndex() )
		System.out.println(str1.charAt(1)); 		//1번 방의 문자를 출력 : e
		System.out.println(str2.charAt(1));			//녕
		
			//indexOf() , lastIndexOf();
		System.out.println(str1.indexOf('l'));
		System.out.println(str1.lastIndexOf('l'));
		
		System.out.println(str1.indexOf('a',8));	 //8번부터 검색 a를 검색 : 9
		System.out.println(str1.lastIndexOf('a',8)); //8번부터 검색 a를 검색 : 7
		
		
		System.out.println("======================================");
				//문자열을 검색 해서 방 번호를 출력
		System.out.println(str1.indexOf("Java"));	//6
		System.out.println(str2.indexOf("하세요"));	//2
		System.out.println(str1.lastIndexOf("ello")); //1
						//문자열 검색에 실패하면 -1 값을 리턴.
		System.out.println(str1.indexOf("bye"));	//-1
		
		
		
		//3. 문자열 변환 및 문자열 연결 : String.valueOf()  ,  concat()
		// String.valueOf() : 기본 자료형은 문자열 String으로 변환.
		
		//String str3 = 2.3;
		String str3 = String.valueOf(2.4);  //(double 형 데이터를 String에 저장시 오류 , 오류를 피하기 위해 String.valueOf() 를 사용해 문자열로 변환.
		
		//String str4 = true;				
		String str4 = String.valueOf(true);	//boolean 타입을 String 변수에 저장시 오류, String.valueOf() 사용.
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println("=============================================");
		
		//concat() : + 연산자와 같이 문자열과 문자열을 연결해주는 메소드.
		
		String str5 = str3.concat(str4); // str3는 2.4 str4에는 true,, concat의 결과로 2.4true 로 str5에 등록.
		
		System.out.println(str5); // 2.4true
		
		//String.valueOf() + cnacat() ==> +
		
		String str7 = "안녕" + 3;
		String str8 = "안녕".concat(String.valueOf(3));
		
		System.out.println(str7);
		System.out.println(str8);
		
		//4. 문자열 ==> byte[], 바이트 배열에 ( getBytes() )
		//	 문자열 ==> char[], char 배열에 넣는 ( toCharArray() )
		//   
		
		String str10 = "Hello Java!";
		String str11 = "안녕하세요! 반갑습니다.";
		
		//getBytes(): 문자열을 한자씩 바이트 배열안에 넣는다.[아스키 코드값]
		byte[] arr1 = str10.getBytes();
		byte[] arr2 = str11.getBytes();
		

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		//toCharArray() : 문자열을 잘라서 char 배열에 저장.
		
		System.out.println("===============================================");
		char[] arr3 = str10.toCharArray();
		char[] arr4 = str11.toCharArray();
		
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		
		System.out.println(arr3[0]);
		
		//5. 문자열 수정 , 대문자로 출력 : toUpperCase() , 소문자로 변환 : toLowerCase().
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		
		System.out.println("===============================================");
		
		//6. 문자열 수정 : replace("수정할 원본" , " 수정할 내용 ");
					  // substring ( 시작 방 번호 , 잘라올 방 번호 )
		String str13 = "안녕 자바 World";
		
		System.out.println(str10.replace("Hello", "안녕"));
		System.out.println(str10);
		System.out.println(str13.replace("World", "월드"));
		System.out.println(str13);
		
		//substring( 0 , 5 )  = index 0번 방에서부터 5번방을 잘라서 출력
		System.out.println(str13.substring(0,5));   //index 0번에서 시작해서 0번부터 오른쪽으로 5위치를 잘라옴
		
		System.out.println(str13.substring(3,5));   //index 3번부터 4까지.
		
		//split() : 특정 문자를 기준으로 잘라서 문자열 배열에 저장.
		
		String[] strArray = "abc/def-ghi jkl".split("/|-| "); // " / " , " - " , "   " 슬레쉬 , 하이푼 , 공백을 구분하여 자르고 Array에 0번부터 저장. 
		
		System.out.println(Arrays.toString(strArray));
		
		System.out.println("===============================");
		//trim() : 문자열 앞, 뒤의 공배긍ㄹ 제거 하는 메소드
		
		System.out.println("         abc            ");
		System.out.println("         abc            ".trim());  //공백 제거.
		
		//6. 문자열의 내용 비교 ( equals(), equalsIgnoreCase() )
		
				// equals() : Heap의 값을 비교, 대소문자 까지 구분.
				// equalsIgnoreCase() : 대소문자 구별하지 않음. H = h
		String str20 = new String("Java");
		String str21 = new String("Java");
		String str22 = new String("java");
		
		//== : Stack 메모리의 참조 주소 비교.
		System.out.println(str20 == str21); //false
		System.out.println(str20 == str22); //false
		System.out.println(str21 == str22); //false
		
		//equals() : 대소문자를 체크 하면서 Heap의 값을 비교.
		System.out.println(str20.equals(str21)); //  true
		System.out.println(str20.equals(str22)); //	 false
		System.out.println(str21.equals(str22)); //  false
				
		//equalsIgnoreCase() : 대소문자 구분하지 않고 Heap값을 비교
		System.out.println(str20.equalsIgnoreCase(str21)); //  true
		System.out.println(str20.equalsIgnoreCase(str22)); //  true
		System.out.println(str21.equalsIgnoreCase(str22)); //  true
		
		
		
		
		
	}

}
