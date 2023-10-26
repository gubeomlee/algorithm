class Solution {
    public String getStr(int n) {
        StringBuilder sb = new StringBuilder(); 
        for(int i=0 ; i<n ; i++) {
            if(i % 2 == 0) {
                sb.append("수"); 
            } else {
                sb.append("박"); 
            }
        } 
        return sb.toString(); 
    }
    public String solution(int n) {
        String answer = getStr(n);
        return answer;
    }
}