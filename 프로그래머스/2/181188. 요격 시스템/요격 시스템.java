import java.util.*; 

class Solution {
    public int getCnt(int[][] t) {
        Arrays.sort(t, (o1, o2) -> {
            return o1[1] - o2[1]; 
        }); 
        
        int idx = 0; 
        int cnt = 0; 
        for(int i=0 ; i<t.length ; i++) {
            int start = t[i][0]; 
            int end = t[i][1]; 
            
            if(start >= idx) {
                idx = end; 
                cnt++; 
            }
        } 
        return cnt; 
    }
    
    public int solution(int[][] targets) {
        int answer = getCnt(targets);
        return answer;
    }
}
