class Solution {
    public int getSum(int[] numbers, int n) {
        int sum = 0; 
        int idx = 0; 
        while(sum <= n) {
            sum += numbers[idx++]; 
        }
        
        return sum; 
    }
    
    public int solution(int[] numbers, int n) {
        int answer = getSum(numbers, n);
        return answer;
    }
}