package chapter16.ex07;

abstract class Fluit{
	abstract void print();
}

class Apple extends Fluit{
	private String name;
	private int price;
	
	@Override
	void print() {
	System.out.println("이름 : "+getName());
	System.out.println("가격 : "+getPrice()+"원");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	//getter setter 통해서 인풋
	//print 메소드 오버라이딩 해서 필드의 정보를 출
}

class Banana extends Fluit{
	private String name;
	private int price;
	
	@Override
	void print() {
	System.out.println("이름 : "+getName());
	System.out.println("가격 : "+getPrice()+"원");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}

class Pencil {
	private String name;
	private int price;
	
	void print() {
		System.out.println("이름 : "+getName());
		System.out.println("가격 : "+getPrice()+"원");
		}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}

class GenericClass<T extends Fluit>{
	private T t;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}

}

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GenericClass<Banana> banana1 = new GenericClass<>();
		GenericClass<Apple> apple1 = new GenericClass<>();
		
		banana1.setT(new Banana());

		banana1.getT().setName("바나나");
		banana1.getT().setPrice(2000);
		banana1.getT().print();
		
		System.out.println("===========================");
		
		apple1.setT(new Apple());
		
		apple1.getT().setName("사과");
		apple1.getT().setPrice(3000);
		apple1.getT().print();
	
		
		
	}

}


