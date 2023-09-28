class Solution {
    public int isSuf(String str, String suf) {
        if(str.length() < suf.length()) {
            return 0; 
        }
        
        for(int i=0 ; i<suf.length() ; i++) {
            if(str.charAt(str.length() - 1 - i) != suf.charAt(suf.length() - 1 - i)) {
                return 0;
            }
        }
        
        return 1; 
    } 
    
    public int solution(String my_string, String is_suffix) {
        int answer = isSuf(my_string, is_suffix);
        return answer;
    }
}