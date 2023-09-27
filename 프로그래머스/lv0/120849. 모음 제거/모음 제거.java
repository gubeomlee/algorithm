class Solution {
    public String getResult(String str) {
        StringBuilder sb = new StringBuilder(); 
        for(int i=0 ; i<str.length(); i++) {
            char c = str.charAt(i); 
            if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                sb.append(c); 
            }
        }
        
        return sb.toString(); 
    }
    
    public String solution(String my_string) {
        String answer = getResult(my_string);
        return answer;
    }
}