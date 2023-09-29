class Solution {
    public String getStr(String str, int n) {
        StringBuilder sb = new StringBuilder(); 
        for(int i=n-1 ; i<str.length() ; i+=n) {
            sb.append(str.charAt(i)); 
        }
        
        return sb.toString(); 
    }
    
    public String solution(String cipher, int code) {
        String answer = getStr(cipher, code);
        return answer;
    }
}