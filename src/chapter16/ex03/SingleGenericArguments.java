package chapter16.ex03;

//제너릭 클래스 : 다양한 타입을 저장 할 수 있는 클래스
class Apple { String apple = "애플";}
class Pencil { String pencil = "연필";}
class Banana { String banana = "바나나";}

//제너릭 클래스 : 다양한 타입을 저장 할 수 있는 클래스
	// 클래스 이름 뒤 <T>
	// 객체를 생성할 때 <T> 들어가는 타입을 지정해서 객체를 생성함.
	// <T> 들어오는 타입은 객체형 타입만 들어와야 한다.
	// wrapper class : 기본 자료형을 객체형 자료형으로 만들것.
	// boolean : Boolean,  char : Character , int : Integer , long : Long 
	// float : Float, double : Double


class MyClass<T> {
	private T t;
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
}

public class SingleGenericArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyClass<Apple> app1 = new MyClass<Apple>();
		
		//Apple 객체를 setter를 사용해서 주입 하고 값 가져오기.
		app1.set(new Apple());
		System.out.println(app1.get().apple);
		
		//Pencil 객체를 setter 를 사용해서 주입하고 값 가져오기.
		MyClass<Pencil> pencil = new MyClass<Pencil>();
		pencil.set(new Pencil());
		System.out.println(pencil.get().pencil);
		
		// Banana 객체를 setter 로 주입하고 값 가져오기
		MyClass<Banana> ba1 = new MyClass<Banana>();
		ba1.set(new Banana());
		System.out.println(ba1.get().banana);
		
		//String 값을 넣고 출력 하기.
		MyClass<String> str1 = new MyClass<String>();
		
		str1.set("안녕하세요");
		System.out.println(str1.get());
		
		
		//int 값을 넣고 출력 하기. : Integer 객체
		MyClass<Integer> in1 = new MyClass<Integer>();
		in1.set(45);
		System.out.println(in1.get());
		
		
		
		//double 값을 넣고 출력 하기. : Double 객체
		MyClass<Double> double1 = new MyClass<Double>();
		
		double1.set(34.52);
		System.out.println(double1.get());
		
	}

}
