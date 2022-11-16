package chapter05.ex4;
import java.util.Arrays;
import java.util.Scanner;
public class Ex01_Teacher_Ver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int [] arr1;
		int n,q=0;
		int idx;  // 배열 방의 크기를 스캐너로 인풋받는 
		
		while(true) {
			
			if(q != 1) {
				System.out.println("=========================================================================");
				System.out.println("1. 인풋 값을 받아서 방의 크기를 지정하고, 7의 배수와 8의 배수 저장후 출력.");
				System.out.println("2. 인풋 값을 받아서 방의 크기를 지정하고, 1씩 증가하도록 값을 넣는데 4의 배수 제외저장 후 출력. ");
				System.out.println("3. 인풋 값을 받아서 방의 크기를 지정하고, 3의 배수만 저장하는데 그중 6의배수는 제외저장 후 출력. ");
				System.out.println("4. 프로그램 종료!");
				System.out.println("=========================================================================");
			}
			q=0;
			
			System.out.print("번호를 입력하세요[1~4] >>> ");
			
			n = sc.nextInt();
			
			if ( n== 1) {
				//1번을 선택시 출력하는 프로그램.
				System.out.print("1번 선택 : 배열의 방 크기를 넣어주세요 >>>>>>>> ");
				idx = sc.nextInt();     //배열의 방 크기를 스캐너로 받아서 idx 변수에 할당
				arr1 = new int[idx];	//arr1 배열 변수의 방의 크기를 지정.
				// 7의 배수와 8의 배수를 저장하는 프로그램을 작성 : for 반복문을 사용해서 처리
				int i = -1;  // 배열의 방 번호를 지정.
				int a;
				for ( a = 1 ; ; a++ ) { //a변수는 7의 배수와 8의 배수를 저장하기 위한 변수. [조건을 생략하면 무한 루프]
				
					if(a%7==0 || a%8==0) {
						i++;
						arr1[i]=a;
						
					}
					if(i == arr1.length-1) {
						break;
					}
				}
				
				
				// for 문을 사용해서 배열에 (arr1) 저장된 값을 출력.
				System.out.println("=========================================================================");
				System.out.println("      7의 배수와 8의 배수 출력");
				for ( i = 0 ; i < arr1.length ; i++ ) {
					System.out.print(arr1[i]+", ");
				}
				System.out.println();
				System.out.println(Arrays.toString(arr1));
				
				
				
			}else if( n==2) {
				System.out.println("2번 선택 : 방의 크기를 넣어주세요 >>> ");
				//2. 인풋 값을 받아서 방의 크기를 지정하고 1씩 증가하도록 값을 넣는데 4배수 만 빼고 저장후 출력.
				idx = sc.nextInt();			//배열 방의 크기.
				arr1 = new int[idx];		//스캐너로 받은 값을 방 크기로 지정.
				
				//for 문을 사용해서 1씩 증가 하는데 4의 배수는 배열에 넣지 않고 저장
				
				int i = 0 ; //방번호
				int a;		//값을 저장하는 변수
				for ( a = 1 ; ; a++ ) {
					if( a % 4 == 0) {
						continue;
					}
					
					arr1[i] = a;
					i++;
					
					if ( i == idx ) {
						break;
					}
				}

				System.out.println("=========================================================================");
				System.out.println("      4의 배수 제외 출력");
				for ( i = 0 ; i < arr1.length ; i++ ) {
					System.out.print(arr1[i]+", ");
				}
				System.out.println();
				System.out.println(Arrays.toString(arr1));
				System.out.println();
				
			}else if( n==3) {
				// 3번을 선택시 출력 하는 프로그램 작성
				System.out.println("3번 선택 : 방의 크기를 넣어주세요 >>> ");
				idx = sc.nextInt();
				arr1 = new int[idx];
				
				//3.인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장하며 그중 6의 배수는 빼고 출력한다.
				int i = 0;		//방번호
				int a;			//3의 배수만 저장하되 6의 배수는 저장하지 않도록
					
				//for 문을 사용해서 값을 저장
				for ( a = 1 ; ; a++ ) {
					if ( a%3 == 0 ) {			//3의 배수이고
						if ( a % 6 != 0 ) {		//6의 배수가 아닐때
							arr1[i] = a;
							i++;
						}
					}
					if ( i == idx ) {
						break;
					}
				}
				
				//for 문을 사용해서 넣은 값을 출력
				for ( i = 0 ; i < arr1.length ; i++) {
					System.out.println( arr1[i] + " ," );
				}
				
				//for 문을 사용해서 넣은 값을 출력
				System.out.println("=========================================================================");
				System.out.println("   3의 배수 6배수 제외 출력");
				for ( i = 0 ; i < arr1.length ; i++ ) {
					System.out.print(arr1[i]+", ");
				}
				System.out.println();
				System.out.println(Arrays.toString(arr1));
				System.out.println();
				
				
				
				
			}else if( n==4) {
				System.out.println("=========================================================================");
				System.out.print("4번 선택 >> ");
				System.out.println("프로그램 종료!");
				break;
			}else {
				System.out.println("=========================================================================");
				System.out.println("1~4의 수를 입력해주세요.");
				q=1;
				
			}	
			
		}
		sc.close();
	}

}
