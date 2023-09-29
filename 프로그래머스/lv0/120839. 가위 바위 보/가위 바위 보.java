class Solution {
    public String win(String rsp) {
        StringBuilder sb = new StringBuilder(); 
        for(int i=0 ; i<rsp.length() ; i++) {
            if(rsp.charAt(i) == '0') {
                sb.append('5'); 
            } else if(rsp.charAt(i) == '2') {
                sb.append('0'); 
            } else if(rsp.charAt(i) == '5') {
                sb.append('2');
            }
        }
        return sb.toString();
    }
    
    public String solution(String rsp) {
        String answer = win(rsp);
        return answer;
    }
}