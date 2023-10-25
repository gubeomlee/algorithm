class Solution {
    public int[] getArr(long n) {
        String str = Long.toString(n); 
        int[] result = new int[str.length()]; 
        for(int i=0 ; i<str.length() ; i++) {
            result[i] = str.charAt(str.length() - 1 - i) - '0'; 
        }
        
        return result; 
    }
    
    public int[] solution(long n) {
        int[] answer = getArr(n);
        return answer;
    }
}