class Solution {
    public long getSum(int a, int b) {
        long sum = 0;
        for(int i=Math.min(a, b) ; i<=Math.max(a, b) ; i++) {
            sum += i; 
        }
        return sum; 
    }
    
    public long solution(int a, int b) {
        long answer = getSum(a, b);
        return answer;
    }
}