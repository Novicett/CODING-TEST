class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int temp = common[1]-common[0];
        boolean a = true;
        
        for(int i = 0 ; i<common.length-1; i++){
            if(temp!=common[i+1]-common[i]){
                a=false;
                break;
            }
        }
        if(a){
            answer=common[common.length-1]+temp;
        }
        else{
            temp = common[1] / common[0];
            answer=common[common.length-1]*temp;
        }
        
        return answer;
    }
}