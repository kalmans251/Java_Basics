package chapter05.ex9;

public class Ex01 {

	public static void main(String[] args) {
		/*  
		 국어 영어 수학 과학          | 국어 영어 수학 과학      | 국어 영어 수학 과학      | 국어 영어 수학 과학 |
	홍길동  70  88  77 99    이순신		80 68 87 79   김똘똘  60 86  87   30   홍길순 77              
	
	메인 메소드 args로 아래와 같은 값이 인풋 되었을 경우 <출력> 과 같이 출력해 보세요.
		args: 홍길동 70 88 77 99 이순신 80 68 87 79 김똘똘 60 86 87 30 홍길순 77 56 80 99
		
		
		<for 문을 사용해서 출력 하세요 >
		
		<출력>  
		      국어     영어   수학   과학    <합계>    <평균>
		==================================================
		홍길동   70      
		이순신
		김똘똘
		홍길순
		================================================= 
		<합계>
		<평균>
		 */
		String[][] arrs = new String[4][5];
		double[][] sum_avr = new double[2][4]; 
		int[] sum = new int[4];
		double[] avr = new double[4]; 
		
		for(int i = 0 ; i < arrs.length ; i++) {
			for(int j = 0 ; j < arrs[i].length ; j++ ) {
				arrs[i][j] = args[j+(i*5)];   
			}
			
			for(int j = 0 ; j < sum.length ; j++ ) {
				sum[i] += Integer.parseInt(arrs[i][j+1]);
			}
			for(int j = 0 ; j < sum.length ; j++ ) {
				avr[i] = (sum[i]/4.0);
			}
		}
		for(int i = 0 ; i < sum_avr.length-1 ; i++ ) {
			for(int j = 0 ; j < sum_avr[i].length ; j++ ) {
				for(int k = 0 ; k < arrs.length ; k++ ) {
					sum_avr[i][j] += Double.parseDouble(arrs[k][j+1]);
				}
				sum_avr[1][j] = sum_avr[0][j]/4;
			}
		}
		System.out.printf("<출력>\n");
		System.out.printf("          국어     영어     수학     과학      <합계>    <평균>\n");  //11 ,  7 , 7 , 7
		System.out.printf("=====================================================================\n");
		for(int i = 0 ; i < arrs.length ; i++ ) {
			System.out.printf("%s",arrs[i][0]);
			for(int j = 1 ; j < 5 ; j++) {
				System.out.printf("%8s",arrs[i][j]);
			}
			System.out.printf("       %d",sum[i]);
			System.out.printf("%10.2f\n",avr[i]);
		}
		System.out.print("=====================================================================\n");
		System.out.print("합계치");
		for(int i = 0 ; i < sum_avr.length ; i++ ) {
			for(int j = 0 ; j < sum_avr[i].length ; j++ ) {
				if(i==0) {
					System.out.printf("%8.0f",sum_avr[i][j]);
				}else {
					System.out.printf("%8.2f",sum_avr[i][j]);
				}
			}
			if(i==0) {
				System.out.printf("%10d",(sum[0]+sum[1]+sum[2]+sum[3]));
			}else {
				System.out.printf("%20.2f",(avr[0]+avr[1]+avr[2]+avr[3])/4);
			}
			System.out.println();
			if( i==(sum_avr.length-1) ) {
				continue;
			}
			System.out.print("평균치");
		}
		System.out.println("=====================================================================");
	}
}
