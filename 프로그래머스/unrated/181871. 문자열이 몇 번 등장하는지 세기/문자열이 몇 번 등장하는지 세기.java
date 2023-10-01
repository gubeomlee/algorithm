class Solution {
    public int getCnt(String str, String pat) {
        int cnt = 0; 
        loop: for(int i=0 ; i<=str.length()-pat.length() ; i++) {
            for(int j=0 ; j<pat.length() ; j++) {
                if(str.charAt(i + j) != pat.charAt(j)) {
                    continue loop; 
                }
            }
            cnt++; 
        }
        return cnt; 
    }
    public int solution(String myString, String pat) {
        int answer = getCnt(myString, pat);
        return answer;
    }
}