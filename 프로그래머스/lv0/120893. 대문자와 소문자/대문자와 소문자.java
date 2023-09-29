class Solution {
    public String getStr(String str) {
        StringBuilder sb = new StringBuilder(); 
        for(int i=0 ; i<str.length() ; i++) {
            if(str.charAt(i) >= 'a') {
                sb.append((char) (str.charAt(i) - 'a' + 'A')); 
            } else {
                sb.append((char) (str.charAt(i) - 'A' + 'a'));
            }
        }
        return sb.toString(); 
    }
    
    public String solution(String my_string) {
        String answer = getStr(my_string);
        return answer;
    }
}