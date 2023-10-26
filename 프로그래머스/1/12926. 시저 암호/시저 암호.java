class Solution {
    public String getStr(String s, int n) {
        StringBuilder sb = new StringBuilder(); 
        for(int i=0 ; i<s.length() ; i++) {
            if('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                if(s.charAt(i) + n > 'Z') {
                    sb.append(Character.toString(s.charAt(i) + n - 1 - 'Z' + 'A'));
                } else {
                    sb.append(Character.toString(s.charAt(i) + n)); 
                }
            } else if('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
                if(s.charAt(i) + n > 'z') {
                    sb.append(Character.toString(s.charAt(i) + n - 1 - 'z' + 'a'));
                } else {
                    sb.append(Character.toString(s.charAt(i) + n)); 
                }
            } else {
                sb.append(" "); 
            }
        }
        return sb.toString(); 
    }
    
    public String solution(String s, int n) {
        String answer = getStr(s, n);
        return answer;
    }
}