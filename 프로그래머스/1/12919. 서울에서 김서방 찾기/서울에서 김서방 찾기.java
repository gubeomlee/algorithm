class Solution {
    public String getStr(String[] s) {
        for(int i=0 ; i<s.length ; i++) {
            if(s[i].equals("Kim")) {
                return "김서방은 " + i + "에 있다"; 
            }
        }
        return ""; 
    }
    
    public String solution(String[] seoul) {
        String answer = getStr(seoul);
        return answer;
    }
}