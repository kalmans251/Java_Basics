package chapter05.ex4;
import java.util.Arrays;
import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		// <문제>
		
		int[] arr1;
		int n,arr_num;
		Scanner sc = new Scanner(System.in);
		
		
		do {
			System.out.println("=========================================================================");
			System.out.println("1. 인풋 값을 받아서 방의 크기를 지정하고, 7의 배수와 8의 배수 저장후 출력.");
			System.out.println("2. 인풋 값을 받아서 방의 크기를 지정하고, 1씩 증가하도록 값을 넣는데 4의 배수 제외저장 후 출력. ");
			System.out.println("3. 인풋 값을 받아서 방의 크기를 지정하고, 3의 배수만 저장하는데 그중 6의배수는 제외저장 후 출력. ");
			System.out.println("4. 프로그램 종료!");
			System.out.println("=========================================================================");
			System.out.print("번호를 입력하세요[1~4] >>> ");
			n= sc.nextInt();
			
			
			switch(n) {
			case 1:
				System.out.printf("%d번 선택 하셨습니다.",n);
				System.out.print("방의 크기를 입력하세요. >> ");
				arr_num = sc.nextInt();
				arr1 = new int[arr_num];
				
				for(int i=0,j=0; i<arr1.length ; i++) {
					while(true) {
						j++;
						if(j%7==0 || j%8==0) {
							arr1[i] = j;
							break;
						}
					}
				}
				System.out.println();
				System.out.println("1번. 7의 배수와 8의 배수 출력!");
				System.out.print(Arrays.toString(arr1));
				System.out.println();
				break;
			case 2:
				System.out.printf("%d번 선택 하셨습니다.",n);
				System.out.print("방의 크기를 입력하세요. >> ");
				arr_num = sc.nextInt();
				arr1 = new int[arr_num];
				
				for(int i=0,j=0; i<arr1.length ; i++) {
					arr1[i] = j+1;
					j++;
					if((j)%4 == 0 && j !=0) {
						i--;
					}
				}
				System.out.println();
				System.out.println("2번. 4의 배수제외 양수넣기");
				System.out.print(Arrays.toString(arr1));
				System.out.println();
				break;
			case 3:
				System.out.printf("%d번 선택 하셨습니다.",n);
				System.out.print("방의 크기를 입력하세요. >> ");
				arr_num = sc.nextInt();
				arr1 = new int[arr_num];
				
				for(int i=0,j=0; i<arr1.length ; i++) {
					while(true) {
						j++;
						if(j%3==0) {
							arr1[i] = j;
							if(j%6 == 0) {
								i--;
							}
							break;
						}
					}
				}
				System.out.println();
				System.out.println("3번. 3의 배수중 6의 배수 제외 출력!");
				System.out.print(Arrays.toString(arr1));
				System.out.println();
				break;
			case 4:
				System.out.println("4번 선택 : 프로그램 종료!");
				break;
			default:
				System.out.println("1~4의 수를 입력해주세요.");
			}	
		}while(n != 4);
	}
}
