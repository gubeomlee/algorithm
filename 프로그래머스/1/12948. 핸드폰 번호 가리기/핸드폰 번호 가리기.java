class Solution {
    public String getStr(String p) {
        StringBuilder sb = new StringBuilder(); 
        
        for(int i=0 ; i<p.length() ; i++) {
            if(i < p.length() - 4) {
                sb.append("*"); 
            } else {
                sb.append(Character.toString(p.charAt(i))); 
            }
        }
        
        return sb.toString(); 
    }
    
    public String solution(String phone_number) {
        String answer = getStr(phone_number);
        return answer;
    }
}