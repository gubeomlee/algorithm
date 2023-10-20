class Solution {
    public boolean isHarshad(int x) {
        int sum = 0; 
        String numStr = Integer.toString(x); 
        for(int i=0 ; i<numStr.length() ; i++) {
            sum += numStr.charAt(i) - '0'; 
        }
        
        if(x % sum == 0) {
            return true; 
        }
        return false; 
    }
    
    public boolean solution(int x) {
        boolean answer = isHarshad(x); 
        return answer;
    }
}