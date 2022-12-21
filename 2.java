class Solution {
    public int solution(int M, int N) {
        //(n*2)-m
       int answer;
	        if(M==1&&N==1){
	            answer=0;
	        }
	        else{
	            answer = (N*M)-1;    
	        }
	        
	        return answer;
	    }
}