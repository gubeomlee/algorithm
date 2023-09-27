class Solution {
    public String getReverse(String str) {
        StringBuilder sb = new StringBuilder(); 
        for(int i=str.length() - 1 ; i>=0 ; i--) {
            sb.append(str.charAt(i)); 
        }
        
        return sb.toString(); 
    } 
    
    public String solution(String my_string) {
        String answer = getReverse(my_string);
        return answer;
    }
}