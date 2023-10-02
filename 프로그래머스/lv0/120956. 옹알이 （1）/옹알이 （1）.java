class Solution {
    public boolean isBabbling(String str) {
        String[] arr = {"aya", "ye", "woo", "ma"};
        
        loop1: for(int i=0 ; i<str.length() ;) {
            loop2: for(int j=0 ; j<arr.length ; j++) {
                if (i + arr[j].length() > str.length()) {
                    continue loop2; 
                } else {
                    for(int k=0 ; k<arr[j].length() ; k++) {
                        if(str.charAt(i + k) != arr[j].charAt(k)) {
                            continue loop2; 
                        }
                    }
                    i += arr[j].length();
                    continue loop1; 
                }
            }
            return false; 
        }
        return true; 
    }
    
    public int getCnt(String[] babbling) {
        int cnt = 0;
        for(int i=0 ; i<babbling.length ; i++) {
            if(isBabbling(babbling[i])) {
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