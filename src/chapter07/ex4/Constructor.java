package chapter07.ex4;

// 생성자 오버로딩 : 생성자 호출시 시그니쳐에 따라 다른 생성자를 호출
	// 시그니쳐 (매개변수의 갯수, 데이터 타입)

class Ab {
	// 필드 : 인스턴스 필드 : 객체를 생성해야 호출가능.
	int m;
	int n;
	int l;
	int k;
	
	//생성자.
	Ab(){					//매개변수 0개를 받는다.
		System.out.printf("매개변수 정수 0개인 생성자 %d %d %d %d\n",m,n,l,k);
	} //기본 생성자
	
	Ab(int m){				//매개변수 정수 1개를 받는다.
		this.m = m;
		System.out.printf("매개변수 정수 1개인 생성자 %d %d %d %d\n",this.m,n,l,k);
	}
	
	Ab(int m, int n){		//매개변수 정수 2개를 받는다.
		this.m = m;
		this.n = n;
		System.out.printf("매개변수 정수 2개인 생성자 %d %d %d %d\n",this.m,this.n,l,k);
	}
	
	Ab(int m, int n , int l){		//매개변수 정수 3개
		this.m = m;
		this.n = n;
		this.l = l;
		System.out.printf("매개변수 정수 3개인 생성자 %d %d %d %d\n",this.m,this.n,this.l,k);
	}
	
	Ab(int m, int n , int l , int k){	//매개변수 정수 4개
		this.m = m;
		this.n = n;
		this.l = l;
		this.k = k;
		System.out.printf("매개변수 정수 4개인 생성자 %d %d %d %d\n",this.m,this.n,this.l,this.k);
	}
	
}



public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ab a = new Ab();
		System.out.println();
		
		Ab a1 = new Ab(57);
		System.out.println();
		
		Ab a2 = new Ab(47,29);
		System.out.println();
		
		Ab a3 = new Ab(25,19,59);
		System.out.println();
		
		Ab a4 = new Ab(89,19,59,100);
		System.out.println();
		
		
		
	}
}
