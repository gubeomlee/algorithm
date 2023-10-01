class Solution {
    public String getStr(String code) {
        StringBuilder sb = new StringBuilder(); 
        int mode = 0; 
        for(int i=0 ; i<code.length() ; i++) {
            if(code.charAt(i) == '1') {
                mode ^= 1; 
            } else if(i % 2 == mode) {
                sb.append(code.charAt(i)); 
            }
        }
        if(sb.toString().length() == 0) {
            return "EMPTY"; 
        }
        return sb.toString(); 
    }
    
    public String solution(String code) {
        String answer = getStr(code);
        return answer;
    }
}