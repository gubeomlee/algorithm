import java.util.*; 

class Solution {
    public int getSum(int k, int m, int[] s) {
        int sum = 0; 
        Arrays.sort(s); 
        for(int i=s.length - 1 ; i - m + 1>=0 ; i-=m) {
            sum += s[i - m + 1] * m; 
        }
        return sum; 
    }
    
    public int solution(int k, int m, int[] score) {
        int answer = getSum(k, m, score);
        return answer;
    }
}