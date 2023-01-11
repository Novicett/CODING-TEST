class Solution {
    public int solution(int n, int t) {
        int a=1; //첫 시간
        while(a<=t){
            n=n*2;
            a++;
        }
        int answer = n;
        return answer;
    }
}