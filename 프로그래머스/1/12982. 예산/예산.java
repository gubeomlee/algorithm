import java.util.*; 

class Solution {
    public int getCnt(int[] d, int b) {
        int[] dp = new int[b + 1]; 
        Arrays.sort(d);

        for(int i=d.length-1 ; i>=0 ; i--) {
            int num = d[i]; 
            for(int j=b ; j-num >= 0 ; j--) {
                dp[j] = Math.max(dp[j], dp[j - num] + 1); 
            }
        }

        return dp[b]; 
    }
    
    public int solution(int[] d, int budget) {
        int answer = getCnt(d, budget);
        return answer;
    }
}