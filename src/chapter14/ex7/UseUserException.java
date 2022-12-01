package chapter14.ex7;

//사용자 정의 예외 : 일반예외
//1. 정수가 음수이면 예외를 발생 시키는 사용자정의

class MinusException extends Exception{
	public MinusException() {
		super();
	}
	public MinusException(String message) {
		super(message);
	}
}

//2. 점수가 100점을 초과 하는 경우 사용자 정의 예외

class OverException extends Exception{
	public OverException() {
		super();
	}
	public OverException(String message) {
		super(message);
	}
}

//사용자 정의 예외를 처리할 클래스.
class Aa {
	MinusException me1 = new MinusException();
	
	void checkScore(int score) throws MinusException,OverException {
		
		if(score < 0) {
			throw new MinusException("예외가 발생 : 음수값 입력 불가함.");	//일반예외.
		}else if(score > 100) {
			throw new OverException("예외가 발생 : 100이상 입력 불가함.");	//일반예외.
		}
	}
}




public class UseUserException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aa a1 = new Aa();
		
		int score = -18;
		
		try {
			a1.checkScore(score);
		} catch (MinusException|OverException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
	}

}
