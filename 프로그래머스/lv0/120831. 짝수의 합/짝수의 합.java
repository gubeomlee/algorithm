class Solution {
    public int getSum(int n) {
        int sum = 0; 
        for(int i=2 ; i<=n ; i+=2) {
            sum += i; 
        }
        
        return sum; 
    }
    
    public int solution(int n) {
        int answer = getSum(n);
        return answer;
    }
}