package chapter02.ex7;

public class Testch7 {


	
	public static void main(String[] args) {
		
		int 국어,수학,영어,음악,과학,sum;
		국어=90;
		수학=88;
		영어=77;
		음악=90;
		과학=99;
		
		float avg;
		
		sum = 국어+수학+영어+음악+과학;
		avg = (float) (sum / 5.);
		
		System.out.println("합계= "+sum);
		System.out.println("평균= "+avg);
		
	}

}








