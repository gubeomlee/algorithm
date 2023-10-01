class Solution {
    public String getStr(String str, String pat) {
        StringBuilder sb = new StringBuilder(); 
        loop: for(int i=str.length()-pat.length() ; i>=0 ; i--) {
            for(int j=0 ; j<pat.length() ; j++) {
                if (str.charAt(i + j) != pat.charAt(j)) {
                    continue loop; 
                }
            }
            for(int j=0 ; j<i+pat.length() ; j++) {
                sb.append(str.charAt(j)); 
            }
            break; 
        }
        
        return sb.toString(); 
    }
    
    public String solution(String myString, String pat) {
        String answer =getStr(myString, pat);
        return answer;
    }
}