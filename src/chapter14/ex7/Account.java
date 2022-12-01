package chapter14.ex7;


// 사용자 정의 예외
class BalanceException extends Exception{
	public BalanceException() {
		super();
	}
	public BalanceException(String message) {
		super(message);
	}
}



public class Account {
	
	
	private long balance = 1000;		//예금의 잔고: 1000 원
	public Account() {}  //기본 생성자
	
	public long getBalance() {	//getter : 호출시 balance 필드의 값을 return으로 돌려줌.
		return balance;
	}
	
	//예금 :
	public void deposit(int money) {	
		//기존의 잔고에서 money를 인풋받아서 balance 필드에 적용.
		balance += money;
	}
	
	// 예외처리
	//출금 :
	public void withDrow(int money) {
		//잔고 balance가 money보다 작은경우. 잔고 부족이라고 강제로 예외를 발생 시켜서 처리.
			//예외 메시지 : 잔고가 부족 합니다. 라고 출력을 해주면 됨.
		try {
			if(money < balance) {
				balance -= money;  
			}else {
				throw new BalanceException("예외 메시지 : 잔고가 부족합니다.");
			}
		}catch(BalanceException e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
	
}
