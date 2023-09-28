class Solution {
    public int isPre(String str, String pre) {
        if(str.length() < pre.length()) {
            return 0; 
        }
        
        for(int i=0 ; i<pre.length() ; i++) {
            if(str.charAt(i) != pre.charAt(i)) {
                return 0; 
            }
        }
        return 1; 
    }
    
    public int solution(String my_string, String is_prefix) {
        int answer = isPre(my_string, is_prefix);
        return answer;
    }
}