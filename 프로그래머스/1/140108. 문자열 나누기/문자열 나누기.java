class Solution {
    public int getCnt(String s) {
        int cnt = 0; 
        while(s.length() > 0) {
            int temp = 1; 
            for(int i=1 ; i<s.length() ; i++) {
                if(s.charAt(i) == s.charAt(0)) {
                    temp++; 
                } else {
                    temp--; 
                }
                
                if(temp == 0 || i == s.length() - 1) {
                    s = new String(s.substring(i+1)); 
                    cnt++; 
                    break; 
                }
            }
            
            if(s.length() == 1) {
                cnt++; 
                break; 
            }
        }
        return cnt; 
    }
    
    public int solution(String s) {
        int answer = getCnt(s);
        return answer;
    }
}