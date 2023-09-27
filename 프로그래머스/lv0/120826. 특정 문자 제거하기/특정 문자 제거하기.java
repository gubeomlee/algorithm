class Solution {
    public String getString(String string, String letter) {
        StringBuilder sb = new StringBuilder(); 
        for(int i=0 ; i<string.length() ; i++) {
            if(string.charAt(i) != letter.charAt(0)) {
                sb.append(string.charAt(i)); 
            }
        }
        
        return sb.toString(); 
    }
    
    public String solution(String my_string, String letter) {
        String answer = getString(my_string, letter);
        return answer;
    }
}