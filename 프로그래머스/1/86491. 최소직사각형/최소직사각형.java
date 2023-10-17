class Solution {
    public int getNum(int[][] s) {
        int r = Integer.MIN_VALUE;
        int c = Integer.MIN_VALUE;
        for(int i=0 ; i<s.length ; i++) {
            r = Math.max(r, Math.min(s[i][0], s[i][1])); 
            c = Math.max(c, Math.max(s[i][0], s[i][1])); 
        }
        
        return r * c;
    }
    
    public int solution(int[][] sizes) {
        int answer = getNum(sizes);
        return answer;
    }
}