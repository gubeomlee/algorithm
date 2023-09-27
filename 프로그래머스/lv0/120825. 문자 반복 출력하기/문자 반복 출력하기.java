class Solution {
    public String getString(String str, int n) {
        StringBuilder sb = new StringBuilder(); 
        for(int i=0 ; i<str.length() ; i++) {
            for(int j=0 ; j<n ; j++) {
                sb.append(str.charAt(i)); 
            }
        }
        
        return sb.toString(); 
    }
    
    public String solution(String my_string, int n) {
        String answer = getString(my_string, n);
        return answer;
    }
}