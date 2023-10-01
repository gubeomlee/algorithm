class Solution {
    public String getStr(String str1, String str2, int s) {
        StringBuilder sb = new StringBuilder(); 
        for(int i=0 ; i<str1.length() ; i++) {
            if(s <= i && i < s + str2.length()) {
                sb.append(str2.charAt(i - s)); 
            } else {
                sb.append(str1.charAt(i)); 
            }
        }
        
        return sb.toString(); 
    }
    
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = getStr(my_string, overwrite_string, s);
        return answer;
    }
}