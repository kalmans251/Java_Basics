package chapter05.ex9;

public class Sharing_String_Object {

	public static void main(String[] args) {
		// 문자열 객체의 공유
		
		//1. 문자열 객체의 공유 : 리터럴로 객체를 생성시 공유됨.
		//					new 생성자를 사용해서 객체를 생성할때는 공유되지 않는다. 별도의 공간에 생성됨.
		
		
		String str1 = new String("안녕");  	
		String str2 = "안녕";				 	
		String str3 = "안녕";                //리터럴로 생성되면 동일한 주소를 갖는다 ,  new String으로 선언시에는 다른 주소를 갖게 된다.
		String str4 = "안녕";
		String str5 = new String("안녕");
		
		
		//2. Stack 메모리의 주소값 비교 ( == : Stack의 값을 비교 )
		//			equals() : Heap 의 값을 비교. 참조객체.equals(비교객체) => true , false 
		
		System.out.println( str1 == str2 );	  //false [다른 주소를 사용하여 Stack값이 같더라도 Heap의 주소비교를 하여 항상 false가 나온다.]
		System.out.println( str2 == str3 );   // 같은 주소를 사용하기 때문에 리터럴 비교 가능하다.
		System.out.println( str3 == str4 );   // 역시 같은 주소를 사용하여 Stack값을 바로 비교. 안녕으로 같기에 True
		System.out.println( str2 == str4 );   // True
		System.out.println( str1 == str5 );   // new String으로 각자 생성한 객체는 서로 다른 주소값을 갖게되어 역시 항상 false를 출력
	
		
		System.out.println("==================================");
		//3. equals () : Heap 영역의 값을 비교
		System.out.println(str1.equals(str2)); //true
		System.out.println(str2.equals(str3)); //true
		System.out.println(str3.equals(str4)); //true
		System.out.println(str2.equals(str4)); //true
		System.out.println(str1.equals(str5)); //true
		
	
	}
	
	
	
}
