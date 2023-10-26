class Solution {
    public boolean isValid(String s) {
        int cnt = 0; 
        for(int i=0 ; i<s.length() ; i++) {
            if(s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                cnt++; 
            } else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                cnt--; 
            }
        }
        if(cnt == 0) {
            return true; 
        } else {
            return false; 
        }
    }
    
    public boolean solution(String s) {
        boolean answer = isValid(s);
        return answer;
    }
}