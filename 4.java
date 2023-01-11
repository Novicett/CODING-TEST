class Solution{
    public int solution(int[] array) {
        int count=0;
    	for(int i=0; i<array.length; i++) {
    		String b=Integer.toString(array[i]);
    		System.out.println(b);
        	for (int j = 0; j < b.length(); j++) {
				if (b.charAt(j)=='7') {
					count++;
				} 
			}
        }
        int answer = count;
        return answer;
    }
}
