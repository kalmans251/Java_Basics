package chapter16.ex10;

import java.util.Scanner;

//제너릭 클래스 / 제너릭 메소드 를 사용해서 두점의 좌표 값으로 넓이를 구하는 프로그램 작성.

//두점의 좌표를 처리하는 클래스 생성. <제너릭 클래스>
class Point < X , Y > {
	X x;
	Y y;

	//생성자를 통해서  t, v의 값을 입력
	
	Point(X x,Y y){
		this.x = x;
		this.y = y;
	}

	//getter 만 생성

	public X getX() {
		return x;
	}
	public Y getY() {
		return y;
	}
	
}

//제너릭 메소드 : 일반클래스 안에 제너릭 메소드가 위치

class GenericMethod {
	
	public static <X,Y> double makeRectangle (Point<X,Y> p1, Point<X,Y> p2) {
		//두 점의 좌표를 받아서 넓이를 계산해서 리턴으로 돌려줌.
		
		return ((double)p1.getX()-(double)p2.getX());
		
		/*double difX=0.;
		
		if(p1.getX() instanceof Integer) {
			if(p2.getX()instanceof Integer) {
				difX = (double)((int)p1.getX() - (int)p2.getX());
			}else if(p2.getX() instanceof Double) {
				difX = (int)p1.getX() - (double)p2.getX();
			}
		}else if(p1.getX() instanceof Double) {
			if(p2.getX()instanceof Integer) {
				difX = (double)p1.getX() - (int)p2.getX();
			}else if(p2.getX() instanceof Double) {
				difX = (double)p1.getX() - (double)p2.getX();
			}
		}
		
		double difY=0.; 
		
		if(p1.getY() instanceof Integer) {
			if(p2.getY()instanceof Integer) {
				difY = (double)((int)p1.getY() - (int)p2.getY());
			}else if(p2.getY() instanceof Double) {
				difY = (int)p1.getY() - (double)p2.getY();
			}
		}else if(p1.getY() instanceof Double) {
			if(p2.getY()instanceof Integer) {
				difY = (double)p1.getY() - (int)p2.getY();
			}else if(p2.getY() instanceof Double) {
				difY = (double)p1.getY() - (double)p2.getY();
			}
		}
		
		
		return Math.abs(difX*difY);
		*/
		
	}
	
	
}



public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double in1 = sc.nextDouble();
		double in2 = sc.nextDouble();
		double in3 = sc.nextDouble();
		double in4 = sc.nextDouble();
		
		// 두점의 좌표를 저장하는 p1
		Point p1 = new Point(   in1   ,    in2    );
		Point p2 = new Point(   in3  ,   in4 );
		
		
		
		// makeRectangel (p1,p2) 를 던져주면 계산해서 값 리턴
		
		System.out.println(GenericMethod.makeRectangle(p1, p2));
	}

}
