package chapter04.ex2;

public class Switch_Control_Statement {

	public static void main(String[] args) {
		// Swith 문 :
		//     -- if 문은 참일경우 실행블락을 실행후 break; 가 자동으로 작동
		//     -- switch 문은 실행후 해당 블락을 빠져나오지 않는다. 강제로 빠져나오도록 break;를 넣어야한다.
		//     
		//  1. switch 문에서 break를 사용하지 않는 경우
		int value1 = 2;    ///\ 2 케이스로 점프하고 break가 없을경우 2번 포함 아랫쪽에 위치한 명령문들을 모두 실행한다. [break; 필수.]
		
		switch (value1) {
		case 1:
			System.out.println("A");
			break;
		case 2:
			System.out.println("B");
			break;
		case 3:
			System.out.println("C");
			break;
		case 4:
			System.out.println("D");
			break;
		default:							//if문의 else 와 같다. <case 에 존재하지 않는 모든것>>
			System.out.println("F");
			break;
		}
		System.out.println("==========================");
		
		//3. switch 문은 if , else if , else 문으로 변환
		System.out.println("======if 문으로 변환========");
		
		int value2 =3;
		
		if (value2 == 1) {
			System.out.println("A");
		}else if (value2 == 2) {
			System.out.println("B");
		}else if (value2 == 3) {
			System.out.println("C");
		}else if (value2 == 4) {
			System.out.println("D");
		}else {
			System.out.println("F");
		}
	}

}
https://github.com/pjw20221101/Java_Project00.git
