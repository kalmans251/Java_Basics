package chapter16.ex05;

//제너릭 메소드 : 일반 클래스 내에 제너릭 타입을 가지는 메소드
class GenericMethods {
	
	//제너릭 메소드 : 일반클래스 내부에 제너릭 타입의 메소드.
	
	public <T> T method1 (T t) {
		return t;
	}
	
	public <T> boolean method2 (T t1, T t2) {
		return t1.equals(t2);
	}
	
	public <K, V> void method3 (K k , V v) {
		System.out.println(k + " : " + v);
	}
	
}



public class GenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericMethods gm = new GenericMethods();
		
		String a = gm.<String>method1("안녕");
		System.out.println(a);
		
		
	}

}
