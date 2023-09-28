class Solution {
    public String getStr(String str) {
        StringBuilder sb = new StringBuilder(); 
        for(int i=0 ; i<str.length() ; i++) {
            if(str.charAt(i) < 'a') {
                sb.append((char) (str.charAt(i) + 'a' - 'A')); 
            } else {
                sb.append(str.charAt(i)); 
            }
        }
        
        return sb.toString(); 
    }
    
    public String solution(String myString) {
        String answer = getStr(myString);
        return answer;
    }
}