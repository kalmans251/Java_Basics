package 연습;


class Solution {

    public int solution(int n, int[][] lighthouse) {
        int answer=0;
        int finish=0,endCount=0;
        int max = 0;
        int[] on_off = new int[lighthouse.length+1];
        int[] num_count = new int[n];

        while(finish!=1){
            for(int k = 0 ; k < n ; k++ ){
                for(int i = 0 ; i < lighthouse.length; i++){
                    for(int j = 0 ; j < lighthouse[i].length ; j++){
                        if(k==lighthouse[i][j]-1 && on_off[i]!=1){
                            num_count[k] += 1;
                            
                        }else if(k==lighthouse[i][j]-1 && on_off[k]==1) {
                        	num_count[k] = 0;
                        }
                    }
                    
                } 
                
            }
            
            for(int i = 0 ; i < n ; i++) {
            	if(max < num_count[i]) {
            		max = num_count[i];
            	}
            }
            System.out.println(max);
            for(int i = 0 ; i<n; i++) {
            	num_count[i] = 0;
            }
            
            for(int i = 0 ; i < lighthouse.length; i++){
                for(int j = 0 ; j < lighthouse[i].length ; j++){
                    if(max==lighthouse[i][j]){
                        on_off[i] = 1;
                    }
                }
            }
            for(int i = 0 ; i < lighthouse.length; i++){    
                        endCount += on_off[i]; 
            }
            System.out.println(endCount);
            answer += 1; 
            if(endCount== lighthouse.length){
            	finish=1;
            }
            
            endCount =0;
        } 
        return answer;
        
    }
}
	
	


public class Practice_01 {

	public static void main(String[] args) {
	int[][] lh = new int[][] {{1, 2}, {1, 3}, {1, 4}, {1, 5}, {5, 6}, {5, 7}, {5, 8}};
	
	Solution so = new Solution();
	
	so.solution(8, lh);
	
	}

}
