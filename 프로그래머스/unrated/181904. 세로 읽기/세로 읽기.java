class Solution {
    public String getStr(String str, int m, int c) {
        StringBuilder sb = new StringBuilder(); 
        for(int i=c-1 ; i<str.length() ; i+=m) {
            sb.append(str.charAt(i)); 
        }
        return sb.toString(); 
    }
    
    public String solution(String my_string, int m, int c) {
        String answer = getStr(my_string, m, c);
        return answer;
    }
}