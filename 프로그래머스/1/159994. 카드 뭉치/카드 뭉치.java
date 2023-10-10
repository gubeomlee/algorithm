class Solution {
    public String getStr(String[] c1, String[] c2, String[] g) {
        int idx1 = 0; 
        int idx2 = 0; 
        for(int i=0 ; i<g.length ; i++) {
            if(idx1 < c1.length && g[i].equals(c1[idx1])) {
                idx1++; 
            } else if(idx2 < c2.length && g[i].equals(c2[idx2])) {
                idx2++; 
            } else {
                return "No"; 
            }
        }
        return "Yes"; 
    }
    
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = getStr(cards1, cards2, goal);
        return answer;
    }
}