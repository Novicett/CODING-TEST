class Solution {
    public int solution(int[] array, int height) {
    	// 첫번째 파라메터는 우리반 키 애들 두 번째 는 나  누가 나보다 큰지 맞추기
    	int answer = 0;
        for (int i : array) {
			if(i>height) {
				answer++;
			}
		}
        
        return answer;
    }
}
