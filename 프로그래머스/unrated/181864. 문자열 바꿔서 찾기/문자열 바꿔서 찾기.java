class Solution {
    public int getStr(String str, String pat) {
        loop: for(int i=0 ; i<=str.length() - pat.length() ; i++) {
            for(int j=0 ; j<pat.length() ; j++) {
                if(str.charAt(i + j) == pat.charAt(j)) {
                    continue loop; 
                }
            }
            return 1; 
        }
        return 0; 
    }
    
    public int solution(String myString, String pat) {
        int answer = getStr(myString, pat);
        return answer;
    }
}