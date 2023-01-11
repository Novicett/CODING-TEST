class Solution {
    public int[] solution(int[] array) {
        int a =-1;
        int b=0;
    	for (int i = 0; i < array.length; i++) {
			if(a<array[i]) {
				a=array[i];
			}
		}
    	for (int i = 0; i < array.length; i++) {
			if(array[i]==a) {
				b=i;
			}
		}
        int[] answer = {a,b};
        
        return answer;
    }
}