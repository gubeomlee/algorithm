class Solution {
    public String getString(String str, int k) {
        StringBuilder sb = new StringBuilder(); 
        for(int i=0 ; i<k ; i++) {
            for(int j=0 ; j<str.length() ; j++) {
                sb.append(str.charAt(j)); 
            }
        }
        
        return sb.toString(); 
    }
    
    public String solution(String my_string, int k) {
        String answer = getString(my_string, k);
        return answer;
    }
}