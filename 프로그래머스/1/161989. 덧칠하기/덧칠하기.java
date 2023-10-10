class Solution {
    public int getCnt(int n, int m, int[] s) {
        int cnt = 1;
        int cur = s[0]; 
        for(int i=1 ; i<s.length ; i++) {
            if(cur + m - 1 < s[i]) {
                cur = s[i]; 
                cnt++; 
            }
        }
        return cnt; 
    }
    
    public int solution(int n, int m, int[] section) {
        int answer = getCnt(n, m, section);
        return answer;
    }
}