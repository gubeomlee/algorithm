class Solution {
    public String getString(String str) {
        StringBuilder sb = new StringBuilder(); 
        for(int i=0 ; i<str.length() ; i++) {
            if(str.charAt(i) == 'm') {
                sb.append("rn"); 
            } else {
                sb.append(str.charAt(i)); 
            }
        }
        
        return sb.toString(); 
    }
    
    public String solution(String rny_string) {
        String answer = getString(rny_string);
        return answer;
    }
}