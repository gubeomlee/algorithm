class Solution {
    public boolean isValid(String str) {
        String[] test = {"aya", "ye", "woo", "ma"};
        int flag = -1; 
        loop1: for(int i=0 ; i<str.length() ;) {
            loop2: for(int j=0 ; j<test.length ; j++) {
                if(str.length() - i >= test[j].length()) {
                    for(int k=0 ; k<test[j].length() ; k++) {
                        if(str.charAt(i + k) != test[j].charAt(k)) {
                            continue loop2;       
                        }
                    }
                    if(j == flag) {
                        return false; 
                    }
                    i += test[j].length();
                    flag = j;
                    continue loop1; 
                }
            }
            return false; 
        }
        return true; 
    }
    
    public int getCnt(String[] b) {
        int cnt = 0; 
        for(int i=0 ; i<b.length ; i++) {
            if(isValid(b[i])) {
                cnt++;
            }
        }
        return cnt; 
    }
    
    public int solution(String[] babbling) {
        int answer = getCnt(babbling);
        return answer;
    }
}