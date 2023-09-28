class Solution {
    public String getStr(String str, int n) {
        StringBuilder sb = new StringBuilder(); 
        for(int i=str.length() - n ; i<str.length() ; i++) {
            sb.append(str.charAt(i)); 
        }
        
        return sb.toString(); 
    }
    
    public String solution(String my_string, int n) {
        String answer = getStr(my_string, n);
        return answer;
    }
}