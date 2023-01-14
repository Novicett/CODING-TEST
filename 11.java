class Solution {
    public int solution(int slice, int n) {
        int k =0;
        if(n%slice!=0){
            k= n/slice;
            k=k+1;
        }
        else{
            k=n/slice;
        }
        
        
        int answer = k;
        return answer;
    }
}