class Solution {
    public boolean isValid(String s) {
        if(s.length() != 4 && s.length() != 6) {
            return false; 
        }
        for(int i=0 ; i<s.length() ; i++) {
            if('0' > s.charAt(i) || s.charAt(i) > '9') {
                return false; 
            }
        }
        
        return true; 
    }
    
    public boolean solution(String s) {
        boolean answer = isValid(s);
        return answer;
    }
}