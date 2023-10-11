class Solution {
    public int getStr(String t, String p) {
        int cnt = 0; 
        loop: for(int i=0 ; i<=t.length() - p.length() ; i++) {
            for(int j=0 ; j<p.length() ; j++) {
                if(t.charAt(i + j) > p.charAt(j)) {
                    continue loop; 
                } else if(t.charAt(i + j) < p.charAt(j)) {
                    cnt++; 
                    continue loop; 
                } 
            }
            cnt++; 
        }
        return cnt; 
    }
    
    public int solution(String t, String p) {
        int answer = getStr(t, p);
        return answer;
    }
}